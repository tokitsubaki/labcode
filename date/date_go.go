package main

import (
	"fmt"
	"time"
)

func main() {

	// 現在日時で生成
	t := time.Now()
	fmt.Println(t)

	// 任意の日時で生成
	t = time.Date(2020, 10, 23, 9, 1, 2, 3, time.Local)
	fmt.Println(t)

	// 日時の値を取得
	t = time.Date(2020, 10, 23, 9, 1, 2, 3, time.Local)
	fmt.Println(t.Year())
	fmt.Println(t.Month())
	fmt.Println(int(t.Month()))
	fmt.Println(t.Day())
	fmt.Println(t.Hour())
	fmt.Println(t.Minute())
	fmt.Println(t.Second())
	fmt.Println(t.Nanosecond())
	fmt.Println(t.YearDay())
	fmt.Println(t.Zone())
	fmt.Println(t.Date())
	fmt.Println(t.Clock())

	// 曜日の取得
	t = time.Date(2020, 10, 23, 9, 1, 2, 3, time.Local)
	fmt.Println(t.Weekday())
	fmt.Println(int(t.Weekday()))

	// 年月日の加算・減算
	t = time.Date(2020, 1, 1, 0, 0, 0, 0, time.Local)
	// 1年2ヶ月3日後
	fmt.Println(t.AddDate(1, 2, 3))
	// 1年2ヶ月3日前
	fmt.Println(t.AddDate(-1, -2, -3))

	// 時刻の加算・減算
	t = time.Date(2020, 1, 1, 0, 0, 0, 0, time.Local)
	// 1秒後
	fmt.Println(t.Add(1 * time.Second))
	// 2分後
	fmt.Println(t.Add(2 * time.Minute))
	// 3時間前
	fmt.Println(t.Add(-3 * time.Hour))

	// 日時の差分
	t1 := time.Date(2020, 1, 1, 0, 0, 0, 0, time.Local)
	t2 := time.Date(2020, 10, 23, 9, 1, 2, 3, time.Local)
	fmt.Println(t2.Sub(t1))
	fmt.Println(int(t2.Sub(t1)))

	// 日時の比較
	t1 = time.Date(2020, 1, 1, 0, 0, 0, 0, time.Local)
	t2 = time.Date(2020, 10, 23, 9, 1, 2, 3, time.Local)
	fmt.Println(t1.Before(t2))
	fmt.Println(t1.Equal(t2))
	fmt.Println(t1.After(t2))

	// 日時から文字列へフォーマット
	t = time.Date(2020, 10, 23, 9, 1, 2, 3, time.Local)
	fmt.Println(t.Format(time.RFC3339))
	fmt.Println(t.Format("2006/01/02"))
	fmt.Println(t.Format("2006/01/02 03:04:05"))
	fmt.Println(t.Format("2006年01月02日 15時04分05秒"))

	// 文字列から日時への変換
	t, _ = time.Parse("2006/01/02 03:04:05", "2020/10/23 09:01:02")
	fmt.Println(t)
	fmt.Println(t.Local())
	t, _ = time.Parse("2006/01/02 03:04:05 MST", "2020/10/23 09:01:02 JST")
	fmt.Println(t)

}
