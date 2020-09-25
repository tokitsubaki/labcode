package main

import (
	"fmt"
	"reflect"
	"strconv"
	"strings"
	"unicode/utf8"
)

func main() {

	var s string
	var s1 string
	var s2 string
	var r string
	var rn int
	var rb bool
	var n int

	// +演算子による結合
	s1 = "Hello"
	s2 = "Go"
	r = s1 + s2
	fmt.Println(r) // -> HelloGo

	// Joinを使った結合
	a := []string{"Hello", "Go"}
	r = strings.Join(a, " ")
	fmt.Println(r) // -> Hello Go

	// Sprintfを使った結合
	s1 = "Hello"
	s2 = "Go"
	r = fmt.Sprintf("%s %s", s1, s2)
	fmt.Println(r) // -> Hello Go

	// strings.Builderを使った結合
	s1 = "Hello"
	s2 = "Go"
	var builder strings.Builder
	builder.WriteString(s1)
	builder.WriteString(s2)
	r = builder.String()
	fmt.Println(r) // -> HelloGo

	// インデックス指定による文字列抽出
	s = "Hello Go"
	r = s[6:8]
	fmt.Println(r) // -> Go

	// lenによるバイト長取得
	s = "Go言語"
	rn = len(s)
	fmt.Println(rn) // -> 8

	// RuneCountInStringによる文字列長取得
	s = "Go言語"
	rn = utf8.RuneCountInString(s)
	fmt.Println(rn) // -> 4

	// Containsによる文字列検索
	s = "Hello Go"
	rb = strings.Contains(s, "Go")
	fmt.Println(rb) // -> true

	// Indexによる文字列検索
	s = "Hello Go"
	rn = strings.Index(s, "o")
	fmt.Println(rn) // -> 4

	// LastIndexによる文字列検索
	s = "Hello Go"
	rn = strings.LastIndex(s, "o")
	fmt.Println(rn) // -> 7

	// Countによる文字列カウント
	s = "Hello Go"
	rn = strings.Count(s, "o")
	fmt.Println(rn) // -> 2

	// HasPrefixによる文字列検索
	s = "Hello Go"
	rb = strings.HasPrefix(s, "Hello")
	fmt.Println(rb) // -> true

	// HasSuffixによる文字列検索
	s = "Hello Go"
	rb = strings.HasSuffix(s, "Go")
	fmt.Println(rb) // -> true

	// Replaceによる文字列置換
	s = "Hello Go??"
	r = strings.Replace(s, "?", "!", 1)
	fmt.Println(r) // -> Hello Go!?

	// ReplaceAllによる文字列置換
	s = "Hello Go??"
	r = strings.ReplaceAll(s, "?", "!")
	fmt.Println(r) // -> Hello Go!!

	// NewReplacerによる文字列置換
	s = "Hello Java??"
	replacer := strings.NewReplacer("Java", "Go", "?", "!")
	r = replacer.Replace(s)
	fmt.Println(r) // -> Hello Go!!

	// Replaceによる文字列削除
	s = "HelloGo"
	r = strings.Replace(s, "Hello", "", -1)
	fmt.Println(r) // -> Go

	// splitによる文字列分割
	s = "JavaScript,Python,Java,Ruby,Go"
	ra := strings.Split(s, ",")
	fmt.Println(ra) // -> [JavaScript Python Java Ruby Go]

	// Trimによるトリミング
	s = "  Hello Go "
	r = strings.Trim(s, " ")
	fmt.Println(r) // -> Hello Go

	// Sprintfによるパディング
	s = "123"
	r = fmt.Sprintf("%010s", s)
	fmt.Println(r) // -> 0000000123

	// ToUpperによる大文字変換
	s = "Hello Go"
	r = strings.ToUpper(s)
	fmt.Println(r) // -> HELLO GO

	// ToLowerによる小文字変換
	s = "Hello Go"
	r = strings.ToLower(s)
	fmt.Println(r) // -> hello go

	// ToTitleによる変換
	s = "hello go"
	r = strings.Title(s)
	fmt.Println(r) // -> Hello Go

	// Atoiによる変換
	s = "123"
	rn, _ = strconv.Atoi(s)
	fmt.Println(rn)                 // -> 123
	fmt.Println(reflect.TypeOf(rn)) // -> int

	// Itoaによる変換
	n = 123
	r = strconv.Itoa(n)
	fmt.Println(r)                 // -> 123
	fmt.Println(reflect.TypeOf(r)) // -> string

	// ==による一致確認
	s1 = "Go"
	s2 = "Go"
	rb = s1 == s2
	fmt.Println(rb) // -> true

	// EqualFoldによる一致確認
	s1 = "Go"
	s2 = "go"
	rb = strings.EqualFold(s1, s2)
	fmt.Println(rb) // -> true

	// Compareによる一致確認
	s1 = "Go"
	s2 = "Go"
	rn = strings.Compare(s1, s2)
	fmt.Println(rn) // -> 0
}
