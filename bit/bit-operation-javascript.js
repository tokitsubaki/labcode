a = 0b1010;
b = 0b0110;
console.log(a);
console.log(b);

console.log(a.toString(2));
console.log(b.toString(2));

console.log(a.toString(2).padStart(8, '0'));

// AND演算
a = 0b1010;
b = 0b0110;

result = a & b;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));

// OR演算
a = 0b1010;
b = 0b0110;

result = a | b;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));

// XOR演算
a = 0b1010;
b = 0b0110;

result = a ^ b;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));

// NOT演算
a = 0b1010;

result = ~a;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));

// 左シフト
a = 0b1010;

result = a << 2;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));

// 符号あり右シフト
a = 0b1010;

result = a >> 1;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));

// 符号なし右シフト
a = 0b1010;

result = a >>> 2;
console.log(result);
console.log(result.toString(2).padStart(8, '0'));


