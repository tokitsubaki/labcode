class Person {
    constructor(age, height, weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    walk() {
        console.log("歩きます");
    }
    eat() {
        console.log("食べます");
    }
    get name() {
        return this._name;
    }
    set name(n) {
        this._name = n;
    }
    static of(person) {
        return new Person(person.age, person.height, person.weight);
    }
}

const person = new Person(30, 170, 60);
person.walk();
person.eat();
console.log(person.age);
console.log(person.height);
console.log(person.weight);
person.name = "名前";
console.log(person.name);

const clone = Person.of(person);
console.log(clone.age);
console.log(clone.height);
console.log(clone.weight);

class Child extends Person {
    walk() {
        console.log("ハイハイをします");
    }
    eat() {
        super.eat();
    }
}

const child = new Child(1, 70, 10);
child.walk();
child.eat();
console.log(child.age);
console.log(child.height);
console.log(child.weight);
child.name = "赤ちゃん";
console.log(child.name);













