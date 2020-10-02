package main

import (
	"fmt"
	"sort"
)

func main() {

	var r string
	var rn int
	var rs []string
	var rm map[int]string

	// Arrayの作成
	var a [3]string
	fmt.Println(a) // -> [  ]

	// Arrayの作成
	a = [3]string{"Hello", "World", "Go"}
	fmt.Println(a) // -> [Hello World Go]

	// Sliceの作成
	var s []string
	fmt.Println(s) // -> []

	// Sliceの作成
	s = []string{"Hello", "World", "Go"}
	fmt.Println(s) // -> [Hello World Go]

	// Mapの作成
	var m map[int]string
	fmt.Println(m) // -> map[]

	// Mapの作成
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	fmt.Println(m) // -> map[1:Hello 2:World 3:Go]

	// Arrayからの値の取得
	a = [3]string{"Hello", "World", "Go"}
	r = a[2]
	fmt.Println(r) // -> Go

	// Sliceからの値の取得
	s = []string{"Hello", "World", "Go"}
	r = s[2]
	fmt.Println(r) // -> Go

	// Mapからの値の取得
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	r = m[3]
	fmt.Println(r) // -> Go

	// Arrayの長さを取得
	a = [3]string{"Hello", "World", "Go"}
	rn = len(a)
	fmt.Println(rn) // -> 3

	// Sliceの長さを取得
	s = []string{"Hello", "World", "Go"}
	rn = len(s)
	fmt.Println(rn) // -> 3

	// Mapの長さを取得
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	rn = len(m)
	fmt.Println(rn) // -> 3

	// Arrayの要素を変更
	a = [3]string{"Hello", "World", "Go"}
	a[2] = "Golang"
	fmt.Println(a) // -> [Hello World Golang]

	// Sliceに要素を追加
	s = []string{"Hello", "World", "Go"}
	rs = append(s, "!!")
	fmt.Println(rs) // -> [Hello World Go !!]

	// Mapに要素を追加
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	m[4] = "!!"
	fmt.Println(m) // -> map[1:Hello 2:World 3:Go 4:!!]

	// Arrayの要素を削除するために新しいArrayを作る
	a = [3]string{"Hello", "World", "Go"}
	ra := a[0:2]
	fmt.Println(ra) // -> [Hello World]

	// Sliceから要素を削除
	s = []string{"Hello", "World", "Go"}
	rs = append(s[:1], s[2:]...)
	fmt.Println(rs) // -> [Hello Go]

	// Mapから要素を削除
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	delete(m, 2)
	fmt.Println(m) // -> map[1:Hello 3:Go]

	// Arrayの要素をコピー
	a = [3]string{"Hello", "World", "Go"}
	raa := a
	fmt.Println(raa) // -> [Hello World Go]

	// Sliceの要素をコピー
	s = []string{"Hello", "World", "Go"}
	rs = make([]string, len(s))
	copy(rs, s)
	fmt.Println(rs) // -> [Hello World Go]

	// Mapの要素をコピー
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	rm = make(map[int]string)
	for key, value := range m {
		rm[key] = value
	}
	fmt.Println(rm) // -> map[1:Hello 2:World 3:Go]

	// Arrayのループ
	a = [3]string{"Hello", "World", "Go"}
	for index, value := range a {
		fmt.Println(index, value) // -> 0 Hello -> 1 World -> 2 Go
	}

	// Sliceのループ
	s = []string{"Hello", "World", "Go"}
	for index, value := range s {
		fmt.Println(index, value) // -> 0 Hello -> 1 World -> 2 Go
	}

	// Mapのループ
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	for key, value := range m {
		fmt.Println(key, value) // -> 1 Hello -> 2 World -> 3 Go
	}

	// Arrayのソート
	a = [3]string{"Hello", "World", "Go"}
	// sort.Sort(a)

	// Sliceのソート
	s = []string{"Hello", "World", "Go"}
	sort.Strings(s)
	fmt.Println(s) // -> [Go Hello World]

	// Mapのソート
	m = map[int]string{3: "Go", 1: "Hello", 2: "World"}
	var keys []int
	for key := range m {
		keys = append(keys, key)
	}
	sort.Ints(keys)
	for _, key := range keys {
		fmt.Println(key, m[key]) // -> 1 Hello -> 2 World -> 3 Go
	}

	// Sliceの結合
	s1 := []string{"Hello", "World"}
	s2 := []string{"Go", "!!"}
	rs = append(s1, s2...)
	fmt.Println(rs) // -> [Hello World Go !!]

	// Mapの結合
	m1 := map[int]string{1: "Hello", 2: "World"}
	m2 := map[int]string{3: "Go", 4: "!!"}
	rm = make(map[int]string)
	for key, value := range m1 {
		rm[key] = value
	}
	for key, value := range m2 {
		rm[key] = value
	}
	fmt.Println(rm) // -> map[1:Hello 2:World 3:Go 4:!!]

	// Mapの検索
	m = map[int]string{1: "Hello", 2: "World", 3: "Go"}
	_, rb := m[1]
	fmt.Println(rb) // -> true
}
