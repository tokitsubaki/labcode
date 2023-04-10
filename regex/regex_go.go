package main

import (
	"fmt"
	"regexp"
)

func main() {

	// 正規表現による文字列チェック
	str := ""
	regex := regexp.MustCompile(`Go`)
	rep := ""

	str = "Hello Go!!"
	regex = regexp.MustCompile(`Go`)

	fmt.Println(regex.MatchString(str))
	fmt.Println(regex.FindString(str))
	fmt.Println(regex.FindStringIndex(str))
	fmt.Println(regex.FindAllString(str, -1))

	str = "Hello Go!!"
	regex = regexp.MustCompile(`(?i)go`)

	fmt.Println(regex.MatchString(str))
	fmt.Println(regex.FindString(str))
	fmt.Println(regex.FindStringIndex(str))
	fmt.Println(regex.FindAllString(str, -1))

	// 正規表現による置換
	str = "Hello Go!!"
	regex = regexp.MustCompile(`\w`)
	rep = "*"

	fmt.Println(regex.ReplaceAllString(str, rep))
	fmt.Println(regex.ReplaceAllLiteralString(str, rep))

	// 正規表現による文字列抽出
	str = "Hello Go!!"
	regex = regexp.MustCompile(`(\w+)\s(\w+)`)

	fmt.Println(regex.ReplaceAllString(str, "$2 $1"))

	a := regex.FindStringSubmatch(str)
	fmt.Println(a[0])
	fmt.Println(a[1])
	fmt.Println(a[2])

	// エスケープ
	str = "Hello+Go."
	regex = regexp.MustCompile(`\w+\+\w+\.`)
	fmt.Println(regex.MatchString(str))

	r := regexp.QuoteMeta(str)
	fmt.Println(r)
	regex = regexp.MustCompile(r)
	fmt.Println(regex.MatchString(str))
}
