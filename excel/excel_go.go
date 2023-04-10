package main

import (
	"fmt"

	"github.com/360EntSecGroup-Skylar/excelize"
)

func main() {

	// 新規ファイルを作成
	file := excelize.NewFile()

	// 保存する
	err := file.SaveAs("./test_excel1.xlsx")
	if err != nil {
		fmt.Println(err)
		return
	}

	// Excelファイルを開く
	file, err = excelize.OpenFile("./test_excel1.xlsx")
	if err != nil {
		fmt.Println(err)
		return
	}

	// ワークシート名の一覧を取得する
	worksheets := file.GetSheetMap()
	fmt.Println(worksheets)

	// 操作対象のワークシートを選択する
	file.SetActiveSheet(0)

	// シートを追加する
	index := file.NewSheet("Sheet2")
	fmt.Println(file.GetSheetMap())
	fmt.Println(index)

	// ワークシートをコピーする
	file.CopySheet(0, 1)
	fmt.Println(file.GetSheetMap())

	// ワークシートを削除する
	file.DeleteSheet("Sheet2")
	fmt.Println(file.GetSheetMap())

	// セルへの書き込み
	file.SetCellValue("Sheet1", "A1", "A1データ")

	// セル値の取得
	value, err := file.GetCellValue("Sheet1", "A1")
	fmt.Println(value)

	// 行と列を別々に数値で指定
	cell, _ := excelize.CoordinatesToCellName(1, 1)
	value, err = file.GetCellValue("Sheet1", cell)
	fmt.Println(value)

	// 列の変換
	fmt.Println(excelize.ColumnNumberToName(37))
	fmt.Println(excelize.ColumnNameToNumber("AK"))

	// 行と列の分割と結合
	fmt.Println(excelize.SplitCellName("AK74"))
	fmt.Println(excelize.CellNameToCoordinates("AK74"))
	fmt.Println(excelize.JoinCellName("AK", 74))

	// セル式の設定
	file.SetCellFormula("Sheet1", "A2", "=1+1")
	fmt.Println(file.GetCellFormula("Sheet1", "A2"))
	fmt.Println(file.GetCellValue("Sheet1", "A2"))

	// 行と列単位の操作
	file.SetCellValue("Sheet1", "B1", "B1データ")
	file.SetCellValue("Sheet1", "B2", "B2データ")
	cols, _ := file.Cols("Sheet1")
	for cols.Next() {
		col, _ := cols.Rows()
		for _, rowCell := range col {
			fmt.Print(rowCell, "\t")
		}
		fmt.Println()
	}

	rows, _ := file.Rows("Sheet1")
	for rows.Next() {
		row, _ := rows.Columns()
		for _, colCell := range row {
			fmt.Print(colCell, "\t")
		}
		fmt.Println()
	}

	// セルのスタイル設定
	style, _ := file.NewStyle(`{
		"border" : [
			{
				"type": "left",
				"color": "000000",
				"style": 1
			},
			{
				"type": "top",
				"color": "000000",
				"style": 1
			},
			{
				"type": "bottom",
				"color": "000000",
				"style": 1
			},
			{
				"type": "right",
				"color": "000000",
				"style": 1
			}
		],
		"font" : {
			"size": 14,
			"color": "#0000FF",
			"family": "メイリオ"
		},
		"fill" : {
			"type" : "pattern",
			"color" : ["#FFFF00"],
			"pattern" : 1
		}
	}`)
	file.SetCellStyle("Sheet1", "B1", "B2", style)

	file.Save()
}
