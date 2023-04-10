package main

import (
	"fmt"
	"math/rand"
	"sync"
	"time"
)

func test() {
	fmt.Println("goroutine test.")
}

func threadA(name string, wg *sync.WaitGroup) {
	fmt.Println(fmt.Sprintf("%s start.", name))
	rand.Seed(time.Now().UnixNano())
	time.Sleep(time.Duration(rand.Intn(3000)) * time.Millisecond)
	fmt.Println(fmt.Sprintf("%s end.", name))
	defer wg.Done()
}

func threadB(name string, c chan<- string) {
	fmt.Println(fmt.Sprintf("%s start.", name))
	rand.Seed(time.Now().UnixNano())
	sleep_time := time.Duration(rand.Intn(3000)) * time.Millisecond
	time.Sleep(sleep_time)
	fmt.Println(fmt.Sprintf("%s end.", name))
	c <- fmt.Sprintf("%s %s", name, sleep_time)
}

func main() {

	// go test()

	// スレッド作成
	var wg sync.WaitGroup
	wg.Add(3)
	fmt.Println("スレッド開始")
	go threadA("スレッドA-1", &wg)
	go threadA("スレッドA-2", &wg)
	go threadA("スレッドA-3", &wg)
	wg.Wait()
	fmt.Println("スレッド終了")

	fmt.Println("------------------------------------")

	// 戻り値（チャネル）
	c := make(chan string)
	fmt.Println("スレッド開始")
	go threadB("スレッドB-1", c)
	go threadB("スレッドB-2", c)
	go threadB("スレッドB-3", c)
	fmt.Println(<-c)
	fmt.Println(<-c)
	fmt.Println(<-c)
	fmt.Println("スレッド終了")

	fmt.Println("------------------------------------")

	// 複数チャネルの操作
	c1 := make(chan string)
	c2 := make(chan string)
	c3 := make(chan string)
	fmt.Println("スレッド開始")
	go threadB("スレッドC-1", c1)
	go threadB("スレッドC-2", c2)
	go threadB("スレッドC-3", c3)

	for i := 0; i < 3; i++ {
		select {
		case r1 := <-c1:
			fmt.Println(fmt.Sprintf("%s %s", "チャネル1: ", r1))
		case r2 := <-c2:
			fmt.Println(fmt.Sprintf("%s %s", "チャネル2: ", r2))
		case r3 := <-c3:
			fmt.Println(fmt.Sprintf("%s %s", "チャネル3: ", r3))
		}
	}
	fmt.Println("スレッド終了")
}
