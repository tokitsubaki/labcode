// 基本
s = `Hello JavaScript`;
console.log(s);

// 複数行
s = `Hello
JavaScript`;
console.log(s);

// 式の挿入
s = "JavaScript";
console.log(`Hello ${s}`);

s = `1 + 1 = ${1 + 1}`;
console.log(s);

// 入れ子のテンプレート
lang = "JavaScript";
conv = "Large";
s = `Hello ${(lang == "JavaScript" ? `conv == "Large" ? ${lang.toUpperCase()} : ${lang.toLowerCase()}` : '')}`;
console.log(s);

// エスケープ
s = `Hello \$ JavaScript`;
console.log(s);

s = `Hello \\ JavaScript`;
console.log(s);

s = String.raw`Hello \ JavaScript`;
console.log(s);

// タグ付きテンプレート
function convUpper(str) {
    return str[0].toUpperCase();
}
s = convUpper`JavaScript`;
console.log(s);

function func(str, ...args) {
    console.log(str);
    console.log(args);
}
lang = "JavaScript";
s = func`Hello ${lang}!!`;
console.log(s);

function func2() {
    return "JavaScript"
}
s = func2`abc`;
console.log(s);

lang = "JavaScript";
s = func2`Hello ${lang}!!`;
console.log(s);
