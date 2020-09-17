
a = 3
b = 5
if a < b then
    puts "a より b の方が大きい"
elsif  a > b then
    puts "b より a の方が大きい"
else
    puts "a と b は同一"
end

puts "------------------------------------------"

a = 3
b = 5
unless a < b then
    puts "a は b 以上"
else
    puts "a より b の方が小さい"
end


puts "------------------------------------------"


s = "Ruby"
case s
when "Ruby" then
    puts s # 標準出力に「Ruby」と表示される
when "Go"
    puts s # 標準出力に「Go」と表示される
else
    puts s # 標準出力に「Ruby」「Go」でない変数sに入っている文字列が表示される
end


puts "------------------------------------------"


i = 0
while i < 10 do
    puts i
    i += 1
end


puts "------------------------------------------"


i = 10
until i < 0 do
    puts i
    i -= 1
end


puts "------------------------------------------"


for num in [1,2,3] do
    puts num
end

