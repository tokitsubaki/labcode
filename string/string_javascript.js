
// +演算子による結合

s1 = "Java";
s2 = "Script";
r = s1 + s2;
console.log(r); // JavaScript

s1 = "Java";
s2 = "Script";
n = 1234;
r = s1 + s2 + n;
console.log(r); // JavaScript1234

// concatによる結合

s1 = "Hello";
s2 = "World";
r = s1.concat(" ", s2);
console.log(r); // Hello World

// 配列を結合

a = ["Java","Script"," ","Hello","World"];
r = a.join("");
console.log(r); // JavaScript HelloWorld

// テンプレートリテラルによる埋め込み

s1 = "Script";
s2 = "Hello";
r = `Java${s1} ${s2}World!!`;
console.log(r); // JavaScript HelloWorld!!

// sliceによる抽出

s = "Hello JavaScript!!";
r = s.slice(0,5);
console.log(r); // Hello

// substrによる抽出

s = "Hello JavaScript!!";
r = s.substr(0,5);
console.log(r); // Hello

// substringによる抽出

s = "Hello JavaScript!!";
r = s.substring(0,5);
console.log(r); // Hello

// 文字列の長さを取得

s = "1234567890";
r = s.length;
console.log(r); // 10

s = "あいうえお";
r = s.length;
console.log(r); // 5

// indexOfによる検索
s = "Hello JavaScript!!";
r = s.indexOf("!");
console.log(r); // 16

// lastIndexOfによる検索
s = "Hello JavaScript!!";
r = s.lastIndexOf("!");
console.log(r); // 17

// searchによる検索
s = "Hello JavaScript!!";
r = s.search(/a/g);
console.log(r); // 7

// matchによる検索
s = "Hello JavaScript!!";
r = s.match(/a/g);
console.log(r); // [ 'a', 'a' ]

// RexExpオブジェクトのtestによる検索
s = "Hello JavaScript!!";
regexp = /a/;
r = regexp.test(s);
console.log(r); // true

// replaceによる置換
s = "Hello Python!!";
r = s.replace(/Python/, "JavaScript");
console.log(r); // Hello JavaScript!!

// replaceによる削除
s = "Hello JavaScript!!";
r = s.replace(/Hello /, "");
console.log(r); // JavaScript!!

// splitによる分割
s = "JavaScript,Python,Java,Ruby,Go";
r = s.split(",");
console.log(r); // [ 'JavaScript', 'Python', 'Java', 'Ruby', 'Go' ]

// trimによるトリミング
s = "  JavaScript ";
r = s.trim();
console.log(r); // 「JavaScript」

// trimLeftによるトリミング
s = "  JavaScript ";
r = s.trimLeft();
console.log(r); // 「JavaScript 」

// trimRightによるトリミング
s = "  JavaScript ";
r = s.trimRight();
console.log(r); // 「  JavaScript」

// padStartによるパディング
s = "123";
r = s.padStart(10, "0");
console.log(r); // 0000000123

// padEndによるパディング
s = "123";
r = s.padEnd(10, "0");
console.log(r); // 1230000000

// toUpperCaseによる大文字への変換
s = "JavaScript";
r = s.toUpperCase();
console.log(r); // JAVASCRIPT

// toLowerCaseによる大文字への変換
s = "JavaScript";
r = s.toLowerCase();
console.log(r); // javascript

// parseIntによる変換
s = "123";
r = parseInt(s);
console.log(r); // 123
console.log(typeof r); // number

// Numberオブジェクトによる変換
s = "123";
r = Number(s);
console.log(r); // 123
console.log(typeof r); // number

// toStringによる変換
n = 123;
r = n.toString();
console.log(r); // 123
console.log(typeof r); // string

// Stringオブジェクトによる変換
n = 123;
r = String(n);
console.log(r); // 123
console.log(typeof r); // string

// 等価演算子による文字列の比較
s = "123";
n = 123;
r = (s == n);
console.log(r); // true

// 同値演算子による文字列の比較
s = "123";
n = 123;
r = (s === n);
console.log(r); // false








