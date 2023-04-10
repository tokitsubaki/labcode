
# 正規表現によるチェック
str = "Hello Ruby!!"
regex = /Ruby/

puts regex =~ str
puts regex.match?(str)
puts str.match?(regex)
puts regex.match(str)
puts str.match(regex)

regex = /ruby/i
puts regex =~ str
puts regex.match?(str)
puts str.match?(regex)
puts regex.match(str)
puts str.match(regex)


# 正規表現による置換
str = "Hello Ruby!!"
regex = /\w/
rep = "*"

puts str.sub(regex, rep)
puts str.gsub(regex, rep)

# 正規表現による抽出
str = "Hello Ruby!!"
regex = /(\w+)\s(\w+)/

puts regex.match(str).captures.inspect
puts "#{$1} #{$2}"
puts str.scan(regex).inspect

puts str.gsub(regex, "#{$2} #{$1}")

str = "Hello Ruby!!"
regex = /(?<a>\w+)\s(?<b>\w+)/
puts str.gsub(regex, '\k<b> \k<a>')


# エスケープ
str = "Hello+Ruby."
regex = /\w+\+\w+\./
puts regex.match?(str)

puts Regexp.escape(str)
puts str.match?(Regexp.escape(str))
