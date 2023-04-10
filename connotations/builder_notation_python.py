# これまで
r = []
for i in range(10):
    r.append(i ** 2)
print(r)

# 内包表記
r = [i ** 2 for i in range(10)]
print(r)

# ifを使った内包表記
l = [91, 88, 99, 70, 1, 100, 0]
r = [score for score in l if score >= 90]
print(r)

# 三項演算子を使った内包表記
l = [91, 88, 99, 70, 1, 100, 0]
r = ["合格" if score >= 90 else "不合格" for score in l]
print(r)

# ネストした内包表記
r = [[i, j] for i in range(2) for j in range(2)]
print(r)

limit = 4
r = [[(j+1)+i*limit for j in range(limit)] for i in range(3)]
print(r)

l = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
]
r = [j for inner in l for j in inner]
print(r)

# タプル内包表記
r = tuple(i ** 2 for i in range(10))
print(r)

# 集合内包表記
r = {i ** 2 for i in range(10)}
print(r)

# 辞書内包表記
l = ["hoge", "foo", "bar", "baz"]
r = {s : len(s) for s in l}
print(r)

# 別々のリストから作る辞書内包表記
index = [1, 2, 3, 4]
l = ["hoge", "foo", "bar", "baz"]
r = {i : s for i, s in zip(index, l)}
print(r)

# ジェネレータ式
g = (i ** 2 for i in range(10))
print(type(g))
for n in g:
    print(n)

print("------------------------------------")

l = [91, 88, 99, 70, 1, 100, 0]
g = (score for score in l if score >= 90)
for n in g:
    print(n)










