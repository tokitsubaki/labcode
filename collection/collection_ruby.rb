require 'set'

# Arrayの作成
a = ["Hello", "Ruby"]
puts a.inspect # -> ["Hello", "Ruby"]

# Hashの作成
h = {1 => "Hello", 2 => "Ruby"}
puts h # -> {1=>"Hello", 2=>"Ruby"}

# Setの作成
s = Set["Hello", "Ruby"]
puts s # -> #<Set: {"Hello", "Ruby"}>

# Arrayから要素の取得
a = ["Hello", "Ruby"]
r = a[1]
puts r # -> Ruby

# Hashから要素の取得
h = {1 => "Hello", 2 => "Ruby"}
r = h[2]
puts r # -> Ruby

# Hashから要素の取得
h = {1 => "Hello", 2 => "Ruby"}
r = h.fetch(2)
puts r # -> Ruby

# Setから要素の取得
s = Set["Hello", "Ruby"]
r = s.to_a[1]
puts r # -> Ruby

# Arrayの長さを取得
a = ["Hello", "Ruby"]
r = a.size
puts r # -> 2

# Hashの長さを取得
h = {1 => "Hello", 2 => "Ruby"}
r = h.size
puts r # -> 2

# Setの長さを取得
s = Set["Hello", "Ruby"]
r = s.size
puts r # -> 2

# pushによるArrayへの要素の追加
a = ["Hello", "Ruby"]
r = a.push("!!")
puts r.inspect # -> ["Hello", "Ruby", "!!"]

# <<によるArrayへの要素の追加
a = ["Hello", "Ruby"]
r = a << "!!"
puts r.inspect # -> ["Hello", "Ruby", "!!"]

# insertによるArrayへの要素の追加
a = ["Hello", "Ruby"]
r = a.insert(1, "World")
puts r.inspect # -> ["Hello", "World", "Ruby"]

# unshiftによるArrayへの要素の追加
a = ["Hello", "Ruby"]
r = a.unshift("ABC")
puts r.inspect # -> ["ABC", "Hello", "Ruby"]

# Hashへの要素の追加
h = {1 => "Hello", 2 => "Ruby"}
h[3] = "!!"
puts h # -> {1=>"Hello", 2=>"Ruby", 3=>"!!"}

# storeによるHashへの要素の追加
h = {1 => "Hello", 2 => "Ruby"}
h.store(3, "!!")
puts h # -> {1=>"Hello", 2=>"Ruby", 3=>"!!"}

# Setへの要素の追加
s = Set["Hello", "Ruby"]
s.add("ABC")
puts s # -> #<Set: {"Hello", "Ruby", "ABC"}>

# Setへの要素の追加
s = Set["Hello", "Ruby"]
s << "ABC"
puts s # -> #<Set: {"Hello", "Ruby", "ABC"}>

# Arrayから末尾の要素を削除
a = ["Hello", "World", "Ruby"]
a.pop
puts a.inspect # -> ["Hello", "World"]

# Arrayから先頭の要素を削除
a = ["Hello", "World", "Ruby"]
a.shift
puts a.inspect # -> ["World", "Ruby"]

# Arrayから指定した要素を削除
a = ["Hello", "World", "Ruby"]
a.delete("World")
puts a.inspect # -> ["Hello", "Ruby"]

# Arrayから指定した位置の要素を削除
a = ["Hello", "World", "Ruby"]
a.delete_at(1)
puts a.inspect # -> ["Hello", "Ruby"]

# Arrayからすべての要素を削除
a = ["Hello", "World", "Ruby"]
a.clear
puts a.inspect # -> []

# ハッシュからkeyを指定して要素を削除
h = {1 => "Hello", 2 => "Ruby"}
h.delete(1)
puts h # -> {2=>"Ruby"}

# ハッシュから先頭の要素を削除
h = {1 => "Hello", 2 => "Ruby"}
h.shift
puts h # -> {2=>"Ruby"}

# ハッシュからすべての要素を削除
h = {1 => "Hello", 2 => "Ruby"}
h.clear
puts h # -> {}

# Setから要素を削除
s = Set["Hello", "Ruby"]
s.delete("Hello")
puts s # -> #<Set: {"Ruby"}>

# Setからすべての要素を削除
s = Set["Hello", "Ruby"]
s.clear
puts s # -> #<Set: {}>

# dupを使ったArrayのコピー
a = ["Hello", "World", "Ruby"]
r = a.dup
puts a.inspect # -> ["Hello", "World", "Ruby"]

# cloneを使ったArrayのコピー
a = ["Hello", "World", "Ruby"]
r = a.clone
puts a.inspect # -> ["Hello", "World", "Ruby"]

# dupを使ったHashのコピー
h = {1 => "Hello", 2 => "Ruby"}
r = h.dup
puts r # -> {1=>"Hello", 2=>"Ruby"}

# cloneを使ったHashのコピー
h = {1 => "Hello", 2 => "Ruby"}
r = h.clone
puts r # -> {1=>"Hello", 2=>"Ruby"}

# dupを使ったSetのコピー
s = Set["Hello", "Ruby"]
r = s.dup
puts r # -> #<Set: {"Hello", "Ruby"}>

# cloneを使ったSetのコピー
s = Set["Hello", "Ruby"]
r = s.clone
puts r # -> #<Set: {"Hello", "Ruby"}>

# for-inを使ったArrayのループ
a = ["Hello", "World", "Ruby"]
for r in a do
    puts r # -> Hello -> World -> Ruby
end

# eachを使ったArrayのループ
a = ["Hello", "World", "Ruby"]
a.each do |r|
    puts r # -> Hello -> World -> Ruby
end

# each_indexを使ったArrayのループ
a = ["Hello", "World", "Ruby"]
a.each_index do |r|
    puts r # -> 0 -> 1 -> 2
end

# each_with_indexを使ったArrayのループ
a = ["Hello", "World", "Ruby"]
a.each_with_index do |value, index|
    puts "#{index} #{value}" # -> 0 Hello -> 1 World -> 2 Ruby
end

# reverse_eachを使ったArrayのループ
a = ["Hello", "World", "Ruby"]
a.reverse_each do |r|
    puts r # -> Ruby -> World -> Hello
end

# eachを使ったHashのループ
h = {1 => "Hello", 2 => "Ruby"}
h.each do |key, value|
    puts "#{key} #{value}" # -> 1 Hello -> 2 Ruby
end

# for-inを使ったSetのループ
s = Set["Hello", "Ruby"]
for r in s do
    puts r # -> Hello -> Ruby
end

# eachを使ったSetのループ
s = Set["Hello", "Ruby"]
s.each do |r|
    puts r # -> Hello -> Ruby
end

# sortを使ったArrayの並び替え
a = ["Hello", "World", "Ruby"]
r = a.sort
puts r.inspect # -> ["Hello", "Ruby", "World"]

# rotateを使ったArrayの並び替え
a = ["Hello", "World", "Ruby"]
r = a.rotate
puts r.inspect # -> ["World", "Ruby", "Hello"]

# shuffleを使ったArrayの並び替え
a = ["Hello", "World", "Ruby"]
r = a.shuffle
puts r.inspect # -> ["World", "Hello", "Ruby"]

# reverseを使ったArrayの並び替え
a = ["Hello", "World", "Ruby"]
r = a.reverse
puts r.inspect # -> ["Ruby", "World", "Hello"]

# invertを使ったHashの変換
h = {1 => "Hello", 2 => "Ruby"}
r = h.invert
puts r # -> {"Hello"=>1, "Ruby"=>2}

# concatを使ったArrayの結合
a1 = ["Hello", "World"]
a2 = ["Ruby", "!!"]
r = a1.concat(a2)
puts r.inspect # -> ["Hello", "World", "Ruby", "!!"]

# concatを使ったArrayの結合
a1 = ["Hello", "World"]
a2 = ["Ruby", "!!"]
r = a1 + a2
puts r.inspect # -> ["Hello", "World", "Ruby", "!!"]

# mergeを使ったHashの結合
h1 = {1 => "Hello", 2 => "World"}
h2 = {3 => "Ruby", 4 => "!!"}
r = h1.merge(h2)
puts r # -> {1=>"Hello", 2=>"World", 3=>"Ruby", 4=>"!!"}

# mergeを使ったSetの結合
s1 = Set["Hello", "World"]
s2 = Set["Ruby", "!!"]
r = s1.merge(s2)
puts r # -> #<Set: {"Hello", "World", "Ruby", "!!"}>

# include?を使ったArrayの検索
a = ["Hello", "World", "Ruby"]
r = a.include?("Ruby")
puts r # -> true

# indexを使ったArrayの検索
a = ["Hello", "World", "Ruby"]
r = a.index("Ruby")
puts r # -> 2


