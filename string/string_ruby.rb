# +メソッドによる結合
s1 = "Hello"
s2 = "Ruby"
r = s1 + s2
puts r # -> HelloRuby

# <<メソッドによる結合
s1 = "Hello"
s2 = "Ruby"
r = s1 << s2
puts r # -> HelloRuby

# concatによる結合
s1 = "Hello"
s2 = "Ruby"
r = s1.concat(s2)
puts r # -> HelloRuby

# joinによる結合
a = ["Hello", "Ruby"]
r = a.join(" ")
puts r # -> Hello Ruby

# 式展開による埋め込み
s1 = "Hello"
s2 = "Ruby"
r = "#{s1}#{s2}"
puts r # -> HelloRuby

# sprintfによる書式指定
s1 = "Hello"
s2 = "Ruby"
r = sprintf("%s%s", s1, s2)
puts r # -> HelloRuby

# インデックス指定による文字列の抽出
s = "Hello Ruby!!"
r = s[6..9]
puts r # -> Ruby

# 開始位置と文字数による文字列の抽出
s = "Hello Ruby!!"
r = s[6,4]
puts r # -> Ruby

# 正規表現指定による文字列の抽出
s = "Hello Ruby!!"
r = s[/Ruby/]
puts r # -> Ruby

# sliceの範囲指定による文字列の抽出
s = "Hello Ruby!!"
r = s.slice(6..9)
puts r # -> Ruby

# sliceの正規表現指定による文字列の抽出
s = "Hello Ruby!!"
r = s.slice(/Ruby/)
puts r # -> Ruby

# matchによる文字列の抽出
s = "Hello Ruby"
r = s.match("^.* (.*)$")[1]
puts r # -> Ruby

# sizeによる文字列長の取得
s = "Rubyテスト"
r = s.size
puts r # -> 7

# lengthによる文字列長の取得
s = "Rubyテスト"
r = s.length
puts r # -> 7

# indexによる文字列の検索
s = "Hello Ruby"
r = s.index("l")
puts r # -> 2

# rindexによる文字列の検索
s = "Hello Ruby"
r = s.rindex("l")
puts r # -> 3

# include?による文字列の検索
s = "Hello Ruby"
r = s.include?("Ruby")
puts r # -> true

# =~による文字列の検索
s = "Hello Ruby"
r = s =~ /l/
puts r # -> 2

# countによる文字のカウント
s = "Hello Ruby"
r = s.count("l")
puts r # -> 2

# start_with?による文字のカウント
s = "Hello Ruby"
r = s.start_with?("Hello")
puts r # -> true

# end_with?による文字のカウント
s = "Hello Ruby"
r = s.end_with?("Ruby")
puts r # -> true

# replaceによる文字列置換
s = "Hello Go"
r = s.replace("Hello Ruby")
puts r # -> Hello Ruby

# subによる文字列置換
s = "Hello Go Go"
r = s.sub("Go","Ruby")
puts r # -> Hello Ruby Go

# gsubによる文字列置換
s = "Hello Go Go"
r = s.gsub("Go","Ruby")
puts r # -> Hello Ruby Ruby

# trによる文字列置換
s = "Hello ruby"
r = s.tr("r","R")
puts r # -> Hello Ruby

# deleteによる文字列削除
s = "HelloRuby"
r = s.delete("Hello")
puts r # -> Ruby

# splitによる文字列分割
s = "JavaScript,Python,Java,Ruby,Go"
r = s.split(",")
puts r.inspect # -> [JavaScript,Python,Java,Ruby,Go]

# stripによる空白除去
s = "  Hello Ruby "
r = s.strip
puts r # -> 「Hello Ruby」

# ljustによるパディング
s = "123"
r = s.ljust(10, "0")
puts r # -> 1230000000

# centerによるパディング
s = "123"
r = s.center(10, "0")
puts r # -> 0001230000

# rjustによるパディング
s = "123"
r = s.rjust(10, "0")
puts r # -> 0000000123

# upcaseによる大文字変換
s = "Ruby"
r = s.upcase
puts r # -> RUBY

# downcaseによる小文字変換
s = "Ruby"
r = s.downcase
puts r # -> ruby

# swapcaseによる変換
s = "Ruby"
r = s.swapcase
puts r # -> rUBY

# capitalizeによるキャピタライズ
s = "hello ruby"
r = s.capitalize
puts r # -> Hello ruby

# to_iによる文字列から数値への変換
s = "123"
r = s.to_i
puts r # -> 123
puts r.class # -> Integer

# to_sによる数値から文字列への変換
n = 123
r = n.to_s
puts r # -> 123
puts r.class # -> String

# eql?による文字列の比較
s1 = "123"
s2 = "123"
r = s1.eql?(s2)
puts r # -> true

# ==による文字列の比較
s1 = "123"
s2 = "123"
r = s1 == s2
puts r # -> true

# ===による文字列の比較
s1 = "123"
s2 = "123"
r = s1 === s2
puts r # -> true

# casecmpによる文字列の比較
s1 = "Hello Ruby"
s2 = "hello ruby"
r = s1.casecmp(s2)
puts r # -> 0
