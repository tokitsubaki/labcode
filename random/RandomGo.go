package main
import (
    "fmt"
    "math/rand"
    "time"
)
func main() {
    rand.Seed(time.Now().UnixNano())
    num := rand.Intn(6) + 1
    fmt.Println(num)
}
