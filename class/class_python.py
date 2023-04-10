class Person:
    name = "人間"
    def __init__(self, height, weight):
        self.age = 30
        self.height = height
        self.weight = weight
    def walk(self):
        print("歩きます")
    def eat(self):
        print("食べます")
    @classmethod
    def say_classmethod(cls):
        print("classmethod")
    @staticmethod
    def say_staticmethod():
        print("staticmethod")
    @property
    def birthday(self):
        return self.__birthday
    @birthday.setter
    def birthday(self, birthday):
        self.__birthday = birthday

class Child(Person):
    def walk(self):
        print("ハイハイします")
    def eat(self):
        super().eat()
        print(self.height)


# インスタンス化
person = Person(170, 60)

# メソッド
person.walk()
person.eat()

# クラスメソッド
Person.say_classmethod()

# 静的メソッド
Person.say_staticmethod()

# インスタンス変数
print(person.height)
print(person.weight)

person.birthday = "1990/01/01"
print(person.birthday)

# クラス変数
print(Person.name)
print(person.name)
Person.name = "人間2"
print(Person.name)
print(person.name)

person.height = 170

# サブクラス
child = Child(70, 10)
child.walk()
print(child.height)
child.eat()

