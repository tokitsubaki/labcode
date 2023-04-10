package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
)

func main() {

	// ファイルの読み込み
	s, _ := ioutil.ReadFile("./data.json")

	var jsondata map[string]interface{}
	json.Unmarshal([]byte(s), &jsondata)
	fmt.Println(jsondata)

	// データの参照
	fmt.Println(jsondata["string"])
	fmt.Println(jsondata["int"])
	fmt.Println(jsondata["bool"])
	fmt.Println(jsondata["null"])

	a := jsondata["array"].([]interface{})
	fmt.Println((a[0].(map[string]interface{}))["no"])
	fmt.Println((a[0].(map[string]interface{}))["name"])
	fmt.Println((a[1].(map[string]interface{}))["no"])
	fmt.Println((a[1].(map[string]interface{}))["name"])

	for _, value := range a {
		fmt.Println(value.(map[string]interface{})["no"])
		fmt.Println(value.(map[string]interface{})["name"])
	}

	fmt.Println(jsondata["object"].(map[string]interface{})["no"])
	fmt.Println(jsondata["object"].(map[string]interface{})["name"])

	// データの追加
	jsondata["string2"] = "文字列2"
	jsondata["int2"] = 2021
	jsondata["bool2"] = false
	jsondata["null2"] = nil
	jsondata["array"] = append(jsondata["array"].([]interface{}), map[string]interface{}{"no": 4, "name": "Ruby"})
	jsondata["object"].(map[string]interface{})["object2"] = map[string]interface{}{"no": 5, "name": "Go"}

	s, _ = json.MarshalIndent(jsondata, "", "  ")
	fmt.Println(string(s))

	// データの削除
	delete(jsondata, "string2")
	delete(jsondata, "int2")
	delete(jsondata, "bool2")
	delete(jsondata, "null2")
	jsondata["array"] = jsondata["array"].([]interface{})[0:2]
	delete(jsondata["object"].(map[string]interface{}), "object2")

	s, _ = json.MarshalIndent(jsondata, "", "  ")
	fmt.Println(string(s))

	// 文字列からJSONへの変換
	str := "{\"text\": \"テキスト\", \"num\": 1}"
	var j map[string]interface{}
	json.Unmarshal([]byte(str), &j)

	s, _ = json.MarshalIndent(j, "", "  ")
	fmt.Println(string(s))
	fmt.Println(j)

	// JSONから文字列への変換
	s, _ = json.Marshal(j)
	fmt.Println(string(s))
}
