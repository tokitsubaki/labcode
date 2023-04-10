# 基本
def func():
    yield "Hello"
    yield "Python"

f = func()
print(type(f))

f1 = func()
s = next(f1)
print(s)
s = next(f1)
print(s)

f2 = func()
for s in f2:
    print(s)

f3 = func()
print(list(f3))

# ファイルの読み込み
def read_line_generator(filepath):
    with open(filepath) as file:
        for line in file:
            yield line

for line in read_line_generator("./large_size_file.txt"):
    print(line)

def odd_number_generator():
    for n in range(10):
        if n % 2 == 1:
            yield n

def even_number_generator():
    for n in range(10):
        if n % 2 == 0:
            yield n

def number_generator():
    yield from odd_number_generator()
    yield from even_number_generator()

for n in number_generator():
    print(n)
print(list(number_generator()))

