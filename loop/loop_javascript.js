
a = 3;
b = 5;
if ( a < b ) {
    console.log("a より b の方が大きい");
} else if ( a > b ) {
    console.log("b より a の方が大きい");
} else {
    console.log("a と b は同一");
}

console.log("------------------------------------------");

a = "JavaScirpt";
switch (a) {
    case "JavaScript":
        console.log(a); // 標準出力に「JavaScript」と表示される
        break;
    case "Java":
        console.log(a); // 標準出力に「Java」と表示される
        break;
    default:
        console.log(a); // 標準出力に「JavaScript」「Java」でない変数aに入っている文字列が表示される
}

console.log("------------------------------------------");

i = 0;
while (i < 10) {
    console.log(i);
    i++;
}

console.log("------------------------------------------");

i = 0;
do {
    console.log(i);
    i++;
} while (i < 10);

console.log("------------------------------------------");

for (i = 0; i < 10; i++) {
    console.log(i);
}

console.log("------------------------------------------");

const obj = {
    "a" : 1,
    "b" : 2,
    "c" : 3
};
for (value in obj) {
    console.log(value); // 「a」、「b」、「c」が表示される
}

console.log("------------------------------------------");

const arr = [1, 2, 3];
for (value of arr) {
    console.log(value); // 「1」、「2」、「3」が表示される
}

