package main

import (
	"fmt"
	"math"
	"math/big"
	"math/cmplx"
)

func main() {
	result := math.Abs(3)
	fmt.Println(result)

	result = math.Abs(-3)
	fmt.Println(result)

	result = math.Abs(3.33)
	fmt.Println(result)

	result = math.Abs(-3.33)
	fmt.Println(result)

	result = math.Abs(math.Inf(1))
	fmt.Println(result)

	result = math.Abs(math.Inf(-1))
	fmt.Println(result)

	result = math.Abs(math.NaN())
	fmt.Println(result)

	result = math.Abs(10.0 / 3.0)
	fmt.Println(result)

	result = math.Abs(math.MinInt64)
	fmt.Println(result)

	result = math.Abs(math.MaxInt64)
	fmt.Println(result)

	// math/big
	b := big.NewInt(math.MinInt64)
	r := b.Abs(b)
	fmt.Println(r)

	b = big.NewInt(math.MaxInt64)
	r = b.Abs(b)
	fmt.Println(r)

	// math/cmplx
	c := cmplx.Abs(3 + 4i)
	fmt.Println(c)
}
