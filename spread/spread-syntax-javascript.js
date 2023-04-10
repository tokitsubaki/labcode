// 配列

// 配列の複製
arr = ["Hello", "JavaScript"];
result = [...arr];
console.log(result);
console.log(arr === result);

// 配列の要素を追加
arr = ["Hello", "JavaScript"];
result = ["###", ...arr, "###"];
console.log(result);

// 配列をマージ
arr1 = ["Hello", "JavaScript"];
arr2 = [1, 2];
result = [...arr1, ...arr2];
console.log(result);

// 文字列を配列にする
str = "Hello";
result = [...str];
console.log(result);

// 配列から重複を排除する
arr = ['H', 'e', 'l', 'l', 'o'];
result = [...(new Set(arr))];
console.log(result);


// オブジェクト

// オブジェクトの複製
obj = {1: "Hello", 2: "JavaScript"};
result = {...obj};
console.log(result);
console.log(obj === result);

// オブジェクトのプロパティを追加
obj = {1: "Hello", 2: "JavaScript"};
result = {0: "###", ...obj, 3: "###"};
console.log(result);

// オブジェクトのマージ
obj1 = {1: "Hello", 2: "JavaScript"};
obj2 = {1: "GoodMorning", 3: "Python"}
result = {...obj1, ...obj2};
console.log(result);

// 関数への適用
function func(n1, n2, n3) {
    return n1 + n2 + n3;
}

arr = [1, 2, 3];

result = func(arr[0], arr[1], arr[2]);
console.log(result);

result = func(...arr);
console.log(result);
