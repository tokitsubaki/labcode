import copy

# リストの作成
a = [1, 'a', 'Hello Python']
print(a) # -> [1, 'a', 'Hello Python']

# タプルの作成
t = (1, 'a', 'Hello Python')
print(t) # -> (1, 'a', 'Hello Python')

# 辞書の作成
d = {1:'One', 'a':2, 'Hello':'Python'}
print(d) # -> {1: 'One', 'a': 2, 'Hello': 'Python'}

# 集合の作成
s = set([1, 'a', 'Hello Python'])
print(s) # -> {1, 'a', 'Hello Python'}

# リストの要素を取得
a = [1, 'a', 'Hello Python']
r = a[2]
print(r) # -> Hello Python

# タプルの要素取得
t = (1, 'a', 'Hello Python')
r = t[2]
print(r) # -> Hello Python

# 辞書の要素を取得
d = {1:'One', 'a':2, 'Hello':'Python'}
r = d['Hello']
print(r) # -> Python

# getによる辞書の要素を取得
d = {1:'One', 'a':2, 'Hello':'Python'}
r = d.get('Hello')
print(r) # -> Python

# 集合の要素を取得
s = set([1, 'a', 'Hello Python'])
r = list(s)[2]
print(r) # -> Hello Python

# リストの長さを取得
a = [1, 'a', 'Hello Python']
r = len(a)
print(r) # -> 3

# タプルの長さを取得
t = (1, 'a', 'Hello Python')
r = len(t)
print(r) # -> 3

# 辞書の長さを取得
d = {1:'One', 'a':2, 'Hello':'Python'}
r = len(d)
print(r) # -> 3

# 集合の要素を取得
s = set([1, 'a', 'Hello Python'])
r = len(s)
print(r) # -> 3

# リストの末尾に要素を追加
a = [1, 'a', 'Hello Python']
a.append(4)
print(a) # -> [1, 'a', 'Hello Python', 4]

# リストの先頭に要素を追加
a = [1, 'a', 'Hello Python']
a.insert(0, 4)
print(a) # -> [4, 1, 'a', 'Hello Python']

# 辞書に要素を追加
d = {1:'One', 'a':2, 'Hello':'Python'}
d[4] = "4"
print(d) # -> {1: 'One', 'a': 2, 'Hello': 'Python', 4: '4'}

# 集合に要素を追加
s = set([1, 'a', 'Hello Python'])
s.add(4)
print(s) # -> {1, 'a', 4, 'Hello Python'}

# リストからインデックスを指定して要素を削除
a = [1, 'a', 'Hello Python']
a.pop(0)
print(a) # -> ['a', 'Hello Python']

# リストから値を指定して要素を削除
a = [1, 'a', 'Hello Python']
a.remove('a')
print(a) # -> [1, 'Hello Python']

# リストからすべての要素を削除
a = [1, 'a', 'Hello Python']
a.clear()
print(a) # -> []

# 辞書から要素を削除
d = {1:'One', 'a':2, 'Hello':'Python'}
d.popitem()
print(d) # -> {1: 'One', 'a': 2}

# 集合から要素を削除
s = set([1, 'a', 'Hello Python'])
s.discard(1)
print(s) # -> {'Hello Python', 'a'}

# copyによるリストのコピー
a = [1, 'a', 'Hello Python']
r = a.copy()
print(r) # -> [1, 'a', 'Hello Python']

# deepcopyによるリストのコピー
a = [1, 'a', 'Hello Python']
r = copy.deepcopy(a)
print(r) # -> [1, 'a', 'Hello Python']

# copyによるタプルのコピー
t = (1, 'a', 'Hello Python')
r = copy.copy(t)
print(r) # -> [1, 'a', 'Hello Python']

# deepcopyによるタプルのコピー
t = (1, 'a', 'Hello Python')
r = copy.deepcopy(t)
print(r) # -> [1, 'a', 'Hello Python']

# copyによる辞書のコピー
d = {1:'One', 'a':2, 'Hello':'Python'}
r = d.copy()
print(r) # -> {1: 'One', 'a': 2, 'Hello': 'Python'}

# deepcopyによる辞書のコピー
d = {1:'One', 'a':2, 'Hello':'Python'}
r = copy.deepcopy(d)
print(r) # -> {1: 'One', 'a': 2, 'Hello': 'Python'}

# fromkeysによる辞書のコピー
d = {1:'One', 'a':2, 'Hello':'Python'}
r = dict.fromkeys(d)
print(r) # -> {1: 'One', 'a': 2, 'Hello': 'Python'}

# copyのよる集合のコピー
s = set([1, 'a', 'Hello Python'])
r = s.copy()
print(r) # -> {1, 'a', 'Hello Python'}

# deepcopyのよる集合のコピー
s = set([1, 'a', 'Hello Python'])
r = copy.deepcopy(s)
print(r) # -> {1, 'a', 'Hello Python'}

# リストのループ
a = [1, 'a', 'Hello Python']
for item in a:
    print(item) # -> 1 -> a -> Hello Python

# enumerateによるリストのループ
a = [1, 'a', 'Hello Python']
for i, item in enumerate(a):
    print(i, item) # -> 0 1 -> 1 a -> 2 Hello Python

# zipによるリストのループ
a = [1, 'a', 'Hello']
b = [2, 'b', 'Python']
for aa, bb in zip(a, b):
    print(aa, bb) # -> 1 2 -> a b -> Hello Python

# reversedによるリストのループ
a = [1, 'a', 'Hello Python']
for item in reversed(a):
    print(item) # -> Hello Python -> a -> 1

# タプルのループ
t = (1, 'a', 'Hello Python')
for item in t:
    print(item) # -> 1 -> a -> Hello Python

# enumerateによるタプルのループ
t = (1, 'a', 'Hello Python')
for i, item in enumerate(t):
    print(i, item) # -> 0 1 -> 1 a -> 2 Hello Python

# zipによるタプルのループ
t1 = (1, 'a', 'Hello')
t2 = (2, 'b', 'Python')
for aa, bb in zip(t1, t2):
    print(aa, bb) # -> 1 2 -> a b -> Hello Python

# reversedによるタプルのループ
t = (1, 'a', 'Hello Python')
for item in reversed(t):
    print(item) # -> Hello Python -> a -> 1

# keysによる辞書のループ
d = {1:'One', 'a':2, 'Hello':'Python'}
for key in d.keys():
    print(key) # -> 1 -> a -> Hello

# valuesによる辞書のループ
d = {1:'One', 'a':2, 'Hello':'Python'}
for value in d.values():
    print(value) # -> One -> 2 -> Python

# itemsによる辞書のループ
d = {1:'One', 'a':2, 'Hello':'Python'}
for key, value in d.items():
    print(key, value) # -> 1 One -> a 2 -> Hello Python

# 集合のループ
s = set([1, 'a', 'Hello Python'])
for item in s:
    print(item) # -> 1 -> Hello Python -> a

# enumerateによる集合のループ
s = set([1, 'a', 'Hello Python'])
for i, item in enumerate(s):
    print(i, item) # -> 0 1 -> 1 Hello Python -> 2 a

# zipによる集合のループ
s1 = set([1, 'a', 'Hello'])
s2 = set([2, 'b', 'Python'])
for aa, bb in zip(s1, s2):
    print(aa, bb) # -> 1 2 -> Hello Python -> a b

# sortによるリストの入れ替え
a = ['c', 'a', 'b']
a.sort()
print(a) # -> ['a', 'b', 'c']

# sortによるリストの逆順の入れ替え
a = ['c', 'a', 'b']
a.sort(reverse=True)
print(a) # -> ['c', 'b', 'a']

# extendによるリストの結合
a1 = ['a', 'b', 'c']
a2 = ['x', 'y', 'z']
a1.extend(a2)
print(a1) # -> ['a', 'b', 'c', 'x', 'y', 'z']

# indexによるリストの検索
a = ['a', 'b', 'c']
r = a.index('c')
print(r) # -> 2

# countによるリストの検索
a = ['a', 'b', 'c']
r = a.count('c')
print(r) # -> 1











