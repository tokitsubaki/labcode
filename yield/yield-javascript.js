// 基本
function* funcA() {
    yield "Hello";
    yield "JavaScript";
    return "!!";
}

f1 = funcA();
console.log(f1.next());
console.log(f1.next());
console.log(f1.next());
console.log(f1.next());

f2 = funcA();
for (v of f2) {
    console.log(v)
}

// ジェネレータへの引数渡し
function* funcB(n) {
    yield n;
    n++
    yield n;
    n **= 2;
    yield n;
}

f3 = funcB(3);
console.log(f3.next())
console.log(f3.next())
console.log(f3.next())


// ジェネレータへの値渡し
function* funcC() {
    a = yield 1;
    b = yield 2;
    yield `${a} ${b}`;
}

f4 = funcC();
console.log(f4.next());
console.log(f4.next("Hello"));
console.log(f4.next("JavaScript"));


// ジェネレータ関数まとめ
function* oddNumberGenerator() {
    for (var i = 1; i <= 10; i++) {
        if (i % 2 == 1) {
            yield i;
        }
    }
}

function* evenNumberGenerator() {
    for (var i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            yield i;
        }
    }
}

function* funcD() {
    yield* oddNumberGenerator();
    yield* evenNumberGenerator();
}

f5 = funcD();
for (v of f5) {
    console.log(v);
}


// yieldを使った同期処理
function* funcE() {
    yield new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("5s sleep.");
            resolve();
        }, 5000);
    });
    yield new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("10s sleep.");
            resolve();
        }, 10000);
    });
}

f6 = funcE();
function loop(g) {
    var p = g.next();
    if (p.done) return;
    p.value.then(() => {
        loop(g);
    });
}
loop(f6);


