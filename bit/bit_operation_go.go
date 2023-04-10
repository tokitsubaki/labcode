package main

import "fmt"

func main() {
	a := 10
	b := 0b0110

	bit := 0b1010
	fmt.Println(bit)
	fmt.Printf("%08b\n", bit)

	fmt.Printf("%08b\n", a)
	fmt.Printf("%08b\n", b)
	fmt.Println(b)

	// AND演算
	r := a & b
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	// OR演算
	r = a | b
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	// XOR演算
	r = a ^ b
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	// AND NOT演算
	r = a &^ b
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	c := 0b1111
	r = a &^ c
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	// 左シフト
	r = a << 2
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	c = -10
	fmt.Printf("%08b\n", c)
	fmt.Println(c)
	r = c << 2
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	// 右シフト
	r = a >> 2
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	r = c >> 6
	fmt.Printf("%08b\n", r)
	fmt.Println(r)

	a = 0b10001110
	b = 0b00001011
	fmt.Printf("%08b\n", a&^b)
}
