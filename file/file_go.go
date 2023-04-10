package main

import (
	"bufio"
	"fmt"
	"io"
	"io/ioutil"
	"os"
	"path/filepath"
)

func main() {

	// ファイルの読み込み
	s, err := ioutil.ReadFile("./files/testfile.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println(string(s))

	// 1行ずつ読み込み
	file, err := os.Open("./files/testfile.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer file.Close()
	scanner := bufio.NewScanner(file)
	for scanner.Scan() {
		fmt.Println(scanner.Text())
	}

	// ファイルの書き込み
	text := "新規にファイルを作成するテスト"
	err = ioutil.WriteFile("./files/writefile.txt", []byte(text), 0664)
	if err != nil {
		fmt.Println(err)
		return
	}

	// 既存ファイルへの追記
	text = "既存にファイルに追記するテスト"
	file, err = os.OpenFile("./files/writefile.txt", os.O_WRONLY|os.O_CREATE|os.O_APPEND, 0664)
	if err != nil {
		fmt.Println(err)
		return
	}
	defer file.Close()
	fmt.Fprintln(file, text)

	// ファイルの削除
	err = os.Remove("./files/writefile.txt")
	if err != nil {
		fmt.Println(err)
		return
	}

	// ファイルの存在確認
	_, err = os.Stat("./files/testfile.txt")
	fmt.Println(os.IsNotExist(err))
	_, err = os.Stat("./files/notexists.txt")
	fmt.Println(os.IsNotExist(err))
	_, err = os.Stat("./files")
	fmt.Println(os.IsNotExist(err))

	// ファイルかディレクトリかの判別
	f, err := os.Stat("./files/testfile.txt")
	fmt.Println(f.IsDir())
	f, err = os.Stat("./files")
	fmt.Println(f.IsDir())

	// ファイルのコピー
	w, err := os.Create("./files/copyfile.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	r, err := os.Open("./files/testfile.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	_, err = io.Copy(w, r)
	if err != nil {
		fmt.Println(err)
		return
	}

	// ディレクトリの一覧取得
	files, err := ioutil.ReadDir("./files/")
	if err != nil {
		fmt.Println(err)
		return
	}
	for _, file := range files {
		fmt.Println(file.Name())
	}

	// ディレクトリの一覧取得（再帰）
	err = filepath.Walk("./files/", func(path string, info os.FileInfo, err error) error {
		if info.IsDir() {
			fmt.Println(info.Name())
			return nil
		}
		rel, err := filepath.Rel("./files/", path)
		fmt.Println(rel)
		return nil
	})
	if err != nil {
		fmt.Println(err)
		return
	}

	// ディレクトリの作成
	err = os.Mkdir("./files/testdir1", 0755)
	if err != nil {
		fmt.Println(err)
		return
	}

	// ディレクトリの一括作成
	err = os.MkdirAll("./files/testdir2/testdir2", 0755)
	if err != nil {
		fmt.Println(err)
		return
	}

	// 一時ディレクトリの作成
	tempdir, err := ioutil.TempDir("./files/", "prefix-")
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println(tempdir)

	// ディレクトリの削除
	err = os.Remove("./files/testdir1")
	if err != nil {
		fmt.Println(err)
		return
	}

	// ディレクトリの一括削除
	err = os.RemoveAll("./files/testdir")
	if err != nil {
		fmt.Println(err)
		return
	}
}
