arr = [1, 2, 3];

// これまで
v1 = arr[0];
v2 = arr[1];
v3 = arr[2];
console.log(v1);
console.log(v2);
console.log(v3);

// 分割代入
[d1, d2, d3] = arr;
console.log(d1);
console.log(d2);
console.log(d3);

// デフォルト値の利用
arr = [1, 2];
[x=97, y=98, z=99] = arr;
console.log(x);
console.log(y);
console.log(z);

// 変数の入れ替え
a = 1;
b = 2;
[a, b] = [b, a];
console.log(a);
console.log(b);

arr = [1, 2, 3];
[arr[2], arr[0]] = [arr[0], arr[2]];
console.log(arr);

// 戻り値の解析
f = () => [1, 2];
[a, b] = f();
console.log(a);
console.log(b);

// 不要な代入をしない
f = () => [1, 2, 3];
[a, , b] = f();
console.log(a);
console.log(b);

// 代入をまとめる
f = () => [1, 2, 3, 4, 5];
[a, b, ...others] = f();
console.log(a);
console.log(b);
console.log(others);

// 正規表現の一致からの値取得
url = "https://javascript-example.jp/destructuring/assignment"
parsedURL = /^(\w+)\:\/\/([^\/]+)\/(.*)$/.exec(url);
[, protocol, host, path] = parsedURL;
console.log(protocol);
console.log(host);
console.log(path);

// オブジェクトの分割代入
o = {index: 1, name:"abc"};
const {index, name} = o;
console.log(index);
console.log(name);

// 変数名の変更
o = {index: 1, name:"abc"};
const {index: i, name: n} = o;
console.log(i);
console.log(n);

// デフォルト値の利用
var {a = 10, b = 5} = {a: 3};
console.log(a);
console.log(b);

// 分割代入の残りの取得
var {a, b, ...others} = {a: 3, b: 5, c: 7, d: 9};
console.log(a);
console.log(b);
console.log(others);

// 関数の引数に対する分割代入
f = ({index, fullname: {firstname: name}}) => `${index} : ${name}`;
var user = {
    index: 10,
    fullname : {
        firstname: "Taro",
        lastname: "Yamada"
    }
};
console.log(f(user));


// 配列とオブジェクトの分割代入の組み合わせ
datalist = [
    {index: 1, data: "abc"},
    {index: 2, data: "opq"},
    {index: 3, data: "xyz"}
];
var [, , {data}] = datalist;
console.log(data);