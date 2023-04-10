require 'json'

json = nil

# ファイルの読み込み
File.open("./data.json", "r") do |file|
    json = JSON.load(file)
    puts json
end

# データの参照
puts json["string"]
puts json["int"]
puts json["bool"]
puts json["null"]

puts json["array"][0]["no"]
puts json["array"][0]["name"]
puts json["array"][1]["no"]
puts json["array"][1]["name"]

json["array"].each do |a|
    puts a["no"]
    puts a["name"]
end

puts json["object"]["no"]
puts json["object"]["name"]

# データの追加
json["string2"] = "文字列2"
json["int2"] = 2021
json["bool2"] = false
json["null2"] = nil

json["array"].push({"no"=>4, "name"=>"Ruby"})

json["object"]["object2"] = {"no"=>5, "name"=>"Go"}

puts JSON.pretty_generate(json)

# データの削除
json.delete("string2")
json.delete("int2")
json.delete("bool2")
json.delete("null2")
json["array"].delete_at(2)
json["object"].delete("object2")

puts JSON.pretty_generate(json)

# 文字列からJSONへの変換
s = "{\"text\": \"テキスト\", \"num\": 1}"
j = JSON.parse(s)
puts j

# JSONから文字列への変換
puts JSON.dump(j)
puts JSON.generate(j)
puts JSON.pretty_generate(j)



