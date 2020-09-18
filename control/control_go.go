package main
import (
    "fmt"
)
func main() {
    a := 3
    b := 5
    if a < b {
        fmt.Println("a より b の方が大きい")
    } else if  a > b {
        fmt.Println("b より a の方が大きい")
    } else {
        fmt.Println("a と b は同一")
    }


    fmt.Println("------------------------------------------")


    s := "Go"
    switch s {
    case "Go":
        fmt.Println(s) // 標準出力に「Go」と表示される
    case "JavaScript":
        fmt.Println(s) // 標準出力に「JavaScript」と表示される
    default:
        fmt.Println(s) // 標準出力に「Ruby」「Go」でない変数sに入っている文字列が表示される
    }


    fmt.Println("------------------------------------------")


    for i := 0; i < 10; i++ {
        fmt.Println(i)
    }


    fmt.Println("------------------------------------------")

    i := 0
    for i < 10 {
        fmt.Println(i)
        i += 1
    }


    fmt.Println("------------------------------------------")


    i = 0
    for {
        if i >= 10 {
            break
        }
        fmt.Println(i)
        i += 1
    }


}

