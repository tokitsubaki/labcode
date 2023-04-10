class Person
    attr_accessor :age
    @@class_name = "人間"
    def initialize(age)
        @age = age
    end
    def walk
        puts "歩きます"
    end
    def eat
        puts "食べます"
    end
    def say_age
        puts "年齢は#{@age}歳です"
    end
    def self.say_hello
        puts "Hello, #{@@class_name}です"
    end
    def set_class_name(name)
        @@class_name = name
    end
    def get_class_name
        return @@class_name
    end
end

class Child < Person
    def walk
        puts "ハイハイします"
    end
    def eat
        print "たくさん"
        super
    end
end


person = Person.new(30)
person.walk
person.eat
person.say_age

person.age = 20
puts person.age

Person.say_hello
person2 = Person.new(30)
puts person2.get_class_name
person.set_class_name("ロボ")
puts person.get_class_name
puts person2.get_class_name


child = Child.new(1)
child.walk
puts child.age
child.eat