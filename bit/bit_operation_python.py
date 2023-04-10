
# 基本
a = 0b1010
print(a)
print(bin(a))
print(format(a, "08b"))

a = -0b1010
print(a)
print(bin(a))
print(format(a, "08b"))


# AND演算
a = 0b1010
b = 0b0110

result = a & b
print(result)
print(format(result, "08b"))

# OR演算
a = 0b1010
b = 0b0110

result = a | b
print(result)
print(format(result, "08b"))

# XOR演算
a = 0b1010
b = 0b0110

result = a ^ b
print(result)
print(format(result, "08b"))


# NOT演算
a = 0b1010

result = ~a
print(result)
print(format(result, "08b"))


# 左シフト演算
a = 0b1010

result = a << 2
print(result)
print(format(result, "08b"))


# 右シフト演算
a = 0b1010

result = a >> 2
print(result)
print(format(result, "08b"))
