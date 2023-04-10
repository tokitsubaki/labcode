fs = require('fs');

// JSONファイル読み込み
s = fs.readFileSync('./data.json', 'utf-8');
console.log(s);

// JSON文字列からJSONオブジェクトへ変換
json = JSON.parse(s);
console.log(json);

// データの参照
console.log(json.string);
console.log(json.int);
console.log(json.bool);
console.log(json.null);

console.log(json.array[0].no)
console.log(json.array[0].name)
console.log(json.array[1].no)
console.log(json.array[1].name)

json.array.forEach((data) => {
    console.log(data.no);
    console.log(data.name);
})

console.log(json.object.no);
console.log(json.object.name);

// データの追加
json.string2 = "追加文字列";
json.int2 = 2021
json.bool2 = false
json.null2 = null

json.array.push({"no": 4, "name": "Ruby"});

json.object.object2 = {"no": 5, "name": "Go"};

console.log(json);

// データの削除
delete json.string2;
delete json.int2;
delete json.bool2;
delete json.null2;
json.array.splice(2, 1);
delete json.object.object2;
console.log(json);

// JSONオブジェクトから文字列への変換
s = JSON.stringify(json);
console.log(s);


