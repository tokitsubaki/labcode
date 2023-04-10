package main

import (
	"fmt"
	"io"
	"os/exec"
)

func main() {

	// コマンド実行（結果取得なし）
	err := exec.Command("sleep", "1").Run()

	// コマンド実行（結果取得あり）
	result, err := exec.Command("date").Output()
	fmt.Println(string(result))

	// コマンド実行（完了待たない）
	err = exec.Command("sleep", "5").Start()

	// コマンド実行（完了を待つ）
	cmd := exec.Command("sleep", "5")
	cmd.Start()
	cmd.Wait()

	// 標準エラー出力も取得
	result, err = exec.Command("ls", "not exists file").CombinedOutput()
	if err != nil {
		fmt.Println(err)
	}
	fmt.Println(string(result))

	// 標準入力を渡す
	cmd = exec.Command("cat")
	stdin, _ := cmd.StdinPipe()
	io.WriteString(stdin, "test")
	stdin.Close()
	result, _ = cmd.Output()
	fmt.Println(string(result))

	// プロセスID取得
	cmd = exec.Command("sleep", "5")
	cmd.Start()
	fmt.Println(cmd.Process.Pid)
	cmd.Process.Kill()
	cmd.Wait()

	// 実行ファイルのパス確認
	path, _ := exec.LookPath("go")
	fmt.Println(path)
}
