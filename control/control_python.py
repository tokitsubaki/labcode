# coding: utf-8

a = 3 
b = 5
if a < b:
    print("a より b の方が大きい")
elif a > b:
    print("b より a の方が大きい")
else:
    print("a と b は同一")


print("------------------------------------------")


i = 0
while i < 10:
    print(i)
    i += 1


print("------------------------------------------")


i = 1
num = 0
while i <= 10:
    num += i
    i += 1
else:
    print(num)


print("------------------------------------------")


for num in [1,2,3]:
    print(num)

