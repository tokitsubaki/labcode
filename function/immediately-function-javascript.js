// 即時関数基本形
(function() {
    console.log("Hello JavaScript!!");
}());

// 引数
(function(a, b) {
    console.log(a + b);
}(1, 2));

// 戻り値
let result = (function(a, b) {
    return a + b;
}(1, 2));
console.log(result);

// 変数のスコープ
let str = "global scope string";
(function(str) {
    console.log(str);
    str = "change string";
    console.log(str);

    let str2 = "local scope string";
    console.log(str2);
}(str));
console.log(str);
console.log(str2);

// アロー関数との組み合わせ
let result2 = ((a, b) => {
    return a + b;
})(1, 2);
console.log(result2);