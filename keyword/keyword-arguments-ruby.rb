# 従来
def greet(first_name, last_name, age)
    puts "#{first_name} #{last_name}、#{age}歳です。"
end
greet("山田", "太郎", 20)

# キーワード引数
def greet(first_name:, last_name:, age:)
    puts "#{first_name} #{last_name}、#{age}歳です。"
end
greet(first_name: "山田", last_name: "太郎", age: "20")

# デフォルト値
def greet(first_name:, last_name:, age: 30)
    puts "#{first_name} #{last_name}、#{age}歳です。"
end
greet(first_name: "山田", last_name: "太郎")
greet(first_name: "山田", last_name: "太郎", age: "20")
#greet(first_name: "山田", age: "20")

# 順序入れ替え
def greet(first_name:, last_name:, age: 30)
    puts "#{first_name} #{last_name}、#{age}歳です。"
end
greet(last_name: "太郎", age: "20", first_name: "山田")
greet(last_name: "太郎", first_name: "山田")

# ハッシュとキーワード引数混合
def greet(first_name:, last_name:, age: 30)
    puts "#{first_name} #{last_name}、#{age}歳です。"
end
greet(**{last_name: "太郎", first_name: "山田"}, age: "20")
greet(:last_name => "太郎", :first_name => "山田", age: "20")