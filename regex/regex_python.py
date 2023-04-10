import re

# 正規表現によるチェック
str = "Hello Python!!"


regex = r'Hello'

r = re.match(regex, str)
print(r.group())
r = re.search(regex, str)
print(r.group())
r = re.findall(regex, str)
print(r)

regex = r'python'
r = re.match(regex, str, re.I)
print(r)
r = re.search(regex, str, re.I)
print(r.group())
r = re.findall(regex, str, re.I)
print(r)

regex = r'H.+ P.+!!'
r = re.fullmatch(regex, str)
print(r.group())

# 正規表現による置換

str = "Hello World!!"
regex = r'World'
rep = "Python"

print(re.sub(regex, rep, str))

# 正規表現による抽出
str = "Hello Python!!"
regex = r'(\w+)\s(\w+)'
r = re.match(regex, str)
print(r.groups())
print(r.group(1))
print(r.group(2))

rep = re.sub(regex, r'\2 \1', str)
print(rep)


# エスケープ
str = "Hello+Python."

regex = r'^\w+\+\w+\.$'
r = re.match(regex, str)
print(r.group())

regex = re.escape(str)
r = re.match(regex, str)
print(regex)
print(r.group())