# 基本
a = 0b1010
puts a
printf("%08b\n", a)

a = -0b1010
puts a
printf("%08b\n", a)
printf("%08b\n", a & 0b11111111)

# AND演算
a = 0b1010
b = 0b0110

result = a & b
puts result
printf("%08b\n", result)


# OR演算
a = 0b1010
b = 0b0110

result = a | b
puts result
printf("%08b\n", result)


# XOR演算
a = 0b1010
b = 0b0110

result = a ^ b
puts result
printf("%08b\n", result)


# NOT演算
a = 0b1010

result = ~a
puts result
printf("%08b\n", result)
printf("%08b\n", result & 0b11111111)


# 左シフト演算
a = 0b1010

result = a << 2
puts result
printf("%08b\n", result)


# 右シフト演算
a = 0b1010

result = a >> 2
puts result
printf("%08b\n", result)


# ビット確認
a = 0b1010
puts a[0]
puts a[1]
puts a[2]
puts a[3]


# Arrayでのビット演算
a = [1, 3, 5]
b = [1, 2, 3]

result = a & b
p result

result = a | b
p result