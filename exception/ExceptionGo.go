package main

import (
	"fmt"
)

func main() {
	fmt.Println("before error.")
	_, e := OccurTestError()
	if e != nil {
		fmt.Println(e)
		return
	}
	fmt.Println("after error.")

}

func OccurTestError() (string, error) {
	fmt.Println("before occur.")
	err1 := fmt.Errorf("err1")
	return "", fmt.Errorf("test error, %w", err1)
}
