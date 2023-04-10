public class ClassJava {
    public static void main(String[] args) {
        
        Person person = new Person(30);
        person.walk();
        person.eat();
        person.sayAge();
        person.setAge(20);
        System.out.println(person.getAge());
        Person.sayHello();
        System.out.println(Person.CLASS_NAME);

        Child child = new Child(1);
        child.walk();
        System.out.println(child.getAge());
        child.eat();

        Animal animal = new Dog();
        animal.cry();
    }
}

class Person {
    public static String CLASS_NAME = "人間";
    private int age;
    Person(int age) {
        this.age = age;
    }
    public void walk() {
        System.out.println("歩きます");
    }
    public void eat() {
        System.out.println("食べます");
    }
    public void sayAge() {
        System.out.println(String.format("年齢は%d歳です", this.age));
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("年齢は0以上の値を設定してください");
        }
        this.age = age;
    }
    public static void sayHello() {
        System.out.println("Hello");
    }

}

class Child extends Person {
    Child(int age) {
        super(age);
    }
    public void walk() {
        System.out.println("ハイハイします");
    }
    public void eat() {
        super.eat();
    }
}

abstract class Animal {
    public abstract void cry();
}

class Dog extends Animal {
    public void cry() {
        System.out.println("ワン");
    }
}