const func1 = function(a, b) {
    return a + b;
};
console.log(func1(1, 2));

const arrow1 = (a, b) => {
    return a + b;
};
console.log(arrow1(1, 2));

const arrow2 = (a, b) => a + b;
console.log(arrow2(1, 2));

const arrow3 = a => a * 2;
console.log(arrow3(2));

s = "global string";
this.s = "this string";
const func2 = function() {
    console.log(s);
    console.log(this.s);
}
const arrow4 = () => {
    console.log(s);
    console.log(this.s);
}

func2();
arrow4();

const func3 = function(a, b) {
    return a + b;
};
const arrow5 = (a, b) => a + b;

new func3();
new arrow5();

const func4 = function(a, b) {
    return a + b;
};
const arrow6 = (a, b) => a + b;

console.log(func4.prototype);
console.log(arrow6.prototype);


const arguments = "arguments";
const func5 = function(a, b) {
    console.log(arguments);
};
const arrow7 = (a, b) => console.log(arguments);
const arrow8 = (...arguments) => console.log(arguments);

func5(1, 2);
arrow7(1, 2);
arrow8(1, 2);

const arrow9 = (a, b)
 => a + b;

console.log(arrow9(1, 2));