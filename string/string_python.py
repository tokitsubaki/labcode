# coding: utf-8

# +演算子による結合
s1 = "Hello"
s2 = "Python"
r = s1 + s2
print(r) # HelloPython

# 配列を結合
a = ["Python","Hello","World"]
r = " ".join(a)
print(r) # Python Hello World

# printf形式による文字列の埋め込み
s1 = "Python"
s2 = "Hello"
r = "%s %sWorld!!" % (s1, s2)
print(r) # Python HelloWorld!!

# formatメソッドによる文字列の埋め込み
s1 = "Python"
s2 = "Hello"
r = "{0} {1}World!!".format(s1, s2)
print(r) # Python HelloWorld!!

# フォーマット済み文字列リテラルによる文字列の埋め込み
s1 = "Python"
s2 = "Hello"
r = f"{s1} {s2}World!!"
print(r) # Python HelloWorld!!

# 文字列の抽出
s = "Hello Python!!"
r = s[6:12]
print(r) # Python

s = "Hello Python!!"
r = s[-8:-2]
print(r) # Python

# 文字列の長さを求める
s = "1234567890"
r = len(s)
print(r) # 10

s = "あいうえお"
r = len(s)
print(r) # python2で実行すると10、python3で実行すると5

# findによる検索
s = "Hello Python!!"
r = s.find("!")
print(r) # 12

# rfindによる検索
s = "Hello Python!!";
r = s.rfind("!");
print(r); # 13

# countによる文字列のカウント
s = "Hello Python!!"
r = s.count("!")
print(r) # 2

# in文による存在確認
s = "Hello Python!!"
r = "!" in s
print(r) # True

# startswithによる存在確認
s = "Hello Python!!"
r = s.startswith("Hello")
print(r) # True

# endswithによる存在確認
s = "Hello Python!!"
r = s.endswith("!!")
print(r) # True

# replaceによる置換
s = "Hello Java!!"
r = s.replace("Java", "Python")
print(r); # Hello Python!!

# translateによる置換
s = "Hello Python!!"
r = s.translate(str.maketrans({
    '!':'?'
}))
print(r); # Hello Python??

# replaceによる文字列削除
s = "Hello Python!!"
r = s.replace("!", "")
print(r); # Hello Python

# translateによる文字列削除
s = "Hello Python!!"
r = s.translate(str.maketrans({
    '!':''
}))
print(r); # Hello Python

# splitによる分割
s = "JavaScript,Python,Java,Ruby,Go"
r = s.split(",")
print(r) # [ "JavaScript", "Python", "Java", "Ruby", "Go" ]

# stripによるトリミング
s = "  Hello Python!!  "
r = s.strip()
print("--")
print(r) # Hell Pythn!!

# lstripによるトリミング
s = "Hello Python!!"
r = s.lstrip("Hello ")
print(r) # Python!!

# rstripによるトリミング
s = "Hello Python!!"
r = s.rstrip("!")
print(r) # Hello Python!

# zfillによる0埋め
s = "123"
r = s.zfill(10)
print(r) # 0000000123

# ljustによる0埋め
s = "123"
r = s.ljust(10, "0")
print(r) # 1230000000

# centerによる0埋め
s = "123"
r = s.center(10, "0")
print(r) # 0001230000

# rjustによる0埋め
s = "123"
r = s.rjust(10, "0")
print(r) # 0000000123

# formatによる書式変換
s = "123"
r = format(s, "0>10")
print(r) # 0000000123

# upperによる大文字変換
s = "Python"
r = s.upper()
print(r) # PYTHON

# lowerによる小文字変換
s = "Python"
r = s.lower()
print(r) # python

# intによる文字列からintへの変換
s = "123"
r = int(s)
print(r) # 123
print(type(r)) # <class 'int'>

# strによるintから文字列への変換
n = 123
r = str(n)
print(r) # 123
print(type(r)) # <class 'str'>
 
# 文字列の一致確認
s1 = "123"
s2 = "123"
r = (s1 == s2)
print(r) # True







