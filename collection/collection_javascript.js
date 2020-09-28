// 長さを指定する配列作成
a = new Array(3);
console.log(a.length); // -> 3

// 長さを指定しない配列作成
a = [];
console.log(a.length); // -> 0

// コンストラクタを使った配列作成
a = new Array(1,2,3);
console.log(a); // -> [ 1, 2, 3 ]

// 直接値を指定する配列作成
a = [1,2,3];
console.log(a); // -> [ 1, 2, 3 ]

// ofを使った配列作成
a = Array.of(1, 2, 3);
console.log(a); // -> [ 1, 2, 3 ]

// 連想配列の作成
o = {a:1, b:2, c:3};
console.log(o); // -> { a: 1, b: 2, c: 3 }

// Mapの作成
m = new Map([
    ['a', 1], ['b', 2], ['c', 3]
]);
console.log(m); // -> Map { 'a' => 1, 'b' => 2, 'c' => 3 }

// 配列から要素の値を取得
a = [1,2,3];
r = a[0];
console.log(r); // -> 1

// 連想配列から要素の値を取得
o = {a:1, b:2, c:3};
r = o.a;
console.log(r); // -> 1

// Mapから要素の値を取得
m = new Map([
    ['a', 1], ['b', 2], ['c', 3]
]);
r = m.get('a');
console.log(r); // -> 1

// lengthを使った配列の長さを取得
a = [1,2,3];
r = a.length;
console.log(r); // -> 3

// 連想配列の長さを取得
o = {a:1, b:2, c:3};
r = Object.keys(o).length;
console.log(r); // -> 3

// Mapの長さを取得
m = new Map([
    ['a', 1], ['b', 2], ['c', 3]
]);
r = m.size;
console.log(r); // -> 3

// pushを使った配列への追加
a = [1,2,3];
a.push(4);
console.log(a); // -> [ 1, 2, 3, 4 ]

// unshiftを使った配列への追加
a = [1,2,3];
a.unshift(4);
console.log(a); // -> [ 4, 1, 2, 3 ]

// spliceを使った配列への追加
a = [1,2,3];
a.splice(1,0,4);
console.log(a); // -> [ 1, 4, 2, 3 ]

// 連想配列へ要素を追加
o = {a:1, b:2, c:3};
o.d = 4;
console.log(o); // -> { a: 1, b: 2, c: 3, d: 4 }

// Mapへ要素を追加
m = new Map([
    ['a', 1], ['b', 2], ['c', 3]
]);
m.set('d', 4);
console.log(m); // -> Map { 'a' => 1, 'b' => 2, 'c' => 3, 'd' => 4 }

// shiftを使った配列からの削除
a = [1,2,3];
a.shift();
console.log(a); // -> [ 2, 3 ]

// popを使った配列からの削除
a = [1,2,3];
a.pop();
console.log(a); // -> [ 1, 2 ]

// spliceを使った配列からの削除
a = [1,2,3];
a.splice(1, 1);
console.log(a); // -> [ 1, 3 ]

// 配列の全削除
a = [1,2,3];
a.length = 0;
console.log(a); // -> []

// 連想配列から要素を削除
o = {a:1, b:2, c:3};
delete o.a;
console.log(o); // -> { b: 2, c: 3 }

// Mapから要素を削除
m = new Map([
    ['a', 1], ['b', 2], ['c', 3]
]);
m.delete('a');
console.log(m); // -> Map { 'b' => 2, 'c' => 3 }

// formを使った配列のコピー
a = [1,2,3];
r = Array.from(a);
console.log(r); // -> [ 1, 2, 3 ]

// concatを使った配列のコピー
a = [1,2,3];
r = a.concat();
console.log(r); // -> [ 1, 2, 3 ]

// sliceを使った配列のコピー
a = [1,2,3];
r = a.slice(0);
console.log(r); // -> [ 1, 2, 3 ]

// スプレッド構文を使った配列のコピー
a = [1,2,3];
r = [...a];
console.log(r); // -> [ 1, 2, 3 ]

// assignを使った連想配列のコピー
o = {a:1, b:2, c:3};
r = Object.assign({}, o);
console.log(r); // -> { a: 1, b: 2, c: 3 }

// スプレッド構文を使った連想配列のコピー
o = {a:1, b:2, c:3};
r = {...o};
console.log(r); // -> { a: 1, b: 2, c: 3 }

// for-ofを使った配列のループ
a = [1,2,3];
for(var r of a) {
    console.log(r); // -> 1 -> 2 -> 3
}

// forEachを使った配列のループ
a = [1,2,3];
a.forEach((r) => {
    console.log(r); // -> 1 -> 2 -> 3
});

// entriesを使った連想配列のループ
o = {a:1, b:2, c:3};
for (const [key, value] of Object.entries(o)) {
    console.log(`${key} : ${value}`); // -> a : 1 -> b : 2 -> c : 3
}

// sortによる並び替え
a = [2,3,1];
r = a.sort();
console.log(r); // -> [ 1, 2, 3 ]

// reverseによる並び替え
a = [1,2,3];
r = a.reverse();
console.log(r); // -> [ 3, 2, 1 ]

// spliceによる並び替え
a = [1,2,3];
a.splice(1, 2, a[2], a[1]);
console.log(a); // -> [ 1, 3, 2 ]

// concatによる配列の結合
a1 = [1,2,3];
a2 = [4,5];
r = a1.concat(a2);
console.log(r); // -> [ 1, 2, 3, 4, 5 ]

// assignによる連想配列の結合
o1 = {a:1, b:2, c:3};
o2 = {d:4, e:5};
r = Object.assign(o1, o2);
console.log(r); // -> { a: 1, b: 2, c: 3, d: 4, e: 5 }

// スプレッド構文による連想配列の結合
o1 = {a:1, b:2, c:3};
o2 = {d:4, e:5};
r = {...o1, ...o2};
console.log(r); // -> { a: 1, b: 2, c: 3, d: 4, e: 5 }

// includesによる配列の検索
a = [1,2,3];
r = a.includes(2);
console.log(r); // -> true

// indexOfによる配列の検索
a = [1,2,3];
r = a.indexOf(2);
console.log(r); // -> 1








