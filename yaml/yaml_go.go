package main

import (
	"fmt"
	"io/ioutil"

	yaml "gopkg.in/yaml.v2"
)

func main() {

	// ファイルの読み込み
	s, _ := ioutil.ReadFile("./data.yaml")

	var yamldata map[string]interface{}
	yaml.Unmarshal([]byte(s), &yamldata)
	fmt.Println(yamldata)

	// データの参照
	fmt.Println(yamldata["string"])
	fmt.Println(yamldata["int"])
	fmt.Println(yamldata["bool"])
	fmt.Println(yamldata["null"])

	a := yamldata["array"].([]interface{})
	fmt.Println((a[0].(map[interface{}]interface{}))["index"])
	fmt.Println((a[0].(map[interface{}]interface{}))["name"])
	fmt.Println((a[1].(map[interface{}]interface{}))["index"])
	fmt.Println((a[1].(map[interface{}]interface{}))["name"])

	for _, value := range a {
		fmt.Println(value.(map[interface{}]interface{})["index"])
		fmt.Println(value.(map[interface{}]interface{})["name"])
	}

	fmt.Println(yamldata["object"].(map[interface{}]interface{})["index"])
	fmt.Println(yamldata["object"].(map[interface{}]interface{})["name"])

	// データの追加
	yamldata["string2"] = "文字列2"
	yamldata["int2"] = 2021
	yamldata["bool2"] = false
	yamldata["null2"] = nil
	yamldata["array"] = append(yamldata["array"].([]interface{}), map[string]interface{}{"index": 4, "name": "Ruby"})
	yamldata["object"].(map[interface{}]interface{})["object2"] = map[string]interface{}{"index": 5, "name": "Go"}

	fmt.Println(yamldata)
	s, _ = yaml.Marshal(yamldata)
	fmt.Println(string(s))

	// データの削除
	delete(yamldata, "string2")
	delete(yamldata, "int2")
	delete(yamldata, "bool2")
	delete(yamldata, "null2")
	yamldata["array"] = yamldata["array"].([]interface{})[0:2]
	delete(yamldata["object"].(map[interface{}]interface{}), "object2")

	fmt.Println(yamldata)
	s, _ = yaml.Marshal(yamldata)
	fmt.Println(string(s))

	// 文字列からYAMLへの変換
	str := "text: テキスト\nnum: 1"

	var j map[string]interface{}
	yaml.Unmarshal([]byte(str), &j)
	fmt.Println(j)

	// YAMLから文字列への変換
	s, _ = yaml.Marshal(j)
	fmt.Println(string(s))
}
