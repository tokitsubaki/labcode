package main

import (
	"flag"
	"fmt"
	"os"
)

func main() {
	fmt.Println(os.Args)
	for _, arg := range os.Args {
		fmt.Println(arg)
	}

	fmt.Println("---------------------------------")

	// flag.Parse()
	// fmt.Println(flag.Args())

	s := flag.String("str", "default", "文字列を指定する")
	i := flag.Int("int", 0, "数値を指定する")
	b := flag.Bool("bool", false, "真偽値を指定する")

	flag.Parse()
	fmt.Println(*s)
	fmt.Println(*i)
	fmt.Println(*b)
}
