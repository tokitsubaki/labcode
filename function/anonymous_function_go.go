package main

import (
	"fmt"
	"math"
)

func pow(n int) int {
	return int(math.Pow(float64(n), 2))
}

func returnPow() func(int) int {
	return func(n int) int {
		return int(math.Pow(float64(n), 2))
	}
}

func argFunc(n int, f func(int) int) int {
	return f(n)
}

func sumPow() func(int) (int, int) {
	sum := 0
	return func(n int) (int, int) {
		sum = sum + int(math.Pow(float64(n), 2))
		return sum, n
	}
}

func main() {
	// 通常の関数呼出し
	r := pow(2)
	fmt.Println(r)

	// 関数を変数に格納して呼び出す
	f := pow
	fmt.Println(f(2))

	// 無名関数
	f2 := func(n int) int {
		return int(math.Pow(float64(n), 2))
	}
	fmt.Println(f2(2))

	// 戻り値として関数を返す
	f3 := func() func(int) int {
		return func(n int) int {
			return int(math.Pow(float64(n), 2))
		}
	}
	fmt.Println(f3()(2))

	fmt.Println(returnPow()(2))
	f4 := returnPow()
	fmt.Println(f4(2))

	fmt.Println(returnPow()(2))

	// 関数を引数にとる関数

	fmt.Println(argFunc(
		2, func(n int) int { return int(math.Pow(float64(n), 2)) }))

	f5 := func(n int, f func(int) int) int {
		return f(n)
	}
	f6 := func(n int) int {
		return int(math.Pow(float64(n), 2))
	}
	fmt.Println(f5(2, f6))
	fmt.Println(f5(3, f6))

	// クロージャ
	f7 := sumPow()
	for i := 1; i <= 5; i++ {
		sum, n := f7(i)
		fmt.Printf("%d : %d\n", n, sum)
	}
}
