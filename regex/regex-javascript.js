// 正規表現によるチェック
str = "Hello JavaScript!!";
regex = /javascript/gi;

console.log(regex.test(str));
console.log(str.search(regex));
console.log(str.match(regex));

// 正規表現による置換
str = "Hello World!!";
rep = "JavaScript";
regex = /World/g;
console.log(str.replace(regex, rep));

// 正規表現による抽出
str = "Hello JavaScript!!";
regex = /(\w+)\s(\w+)/;
matches = str.match(regex);
console.log(matches[1]);
console.log(matches[2]);

regex = /(\w+)\s(\w+)/;
rep = str.replace(regex, "$2 $1");
console.log(rep);

// エスケープ
str = "Hello+JavaScript.";
regex = /^\w+\+\w+\.$/;
console.log(regex.test(str));

