require 'time'

# 現在日時で生成
t = Time.new
puts t

# 任意の日時で生成
t = Time.local(2020, 10, 22)
puts t
t = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t.iso8601(6)

# 日時情報を取得
t = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t.year
puts t.month
puts t.day
puts t.hour
puts t.min
puts t.sec
puts t.usec
puts t.nsec
puts t.yday
puts t.tv_sec

# 曜日情報を取得
t = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t.wday

# 曜日を確認
t = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t.sunday?
puts t.monday?
puts t.tuesday?
puts t.wednesday?
puts t.thursday?
puts t.friday?
puts t.saturday?

# 日時を加算
t = Time.local(2020, 1, 1)
puts t + 1
puts t + (60 * 60 * 24)

# 日時を減算
t = Time.local(2020, 1, 1)
puts t - 1
puts t - (60 * 60 * 24)

# 日時の差分を取得
t1 = Time.local(2020, 1, 1)
t2 = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t2 - t1

# 比較演算子による日時の比較
t1 = Time.local(2020, 1, 1)
t2 = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t1 < t2
puts t1 <= t2
puts t1 == t2
puts t1 >= t2
puts t1 > t2

# <=>による日時の比較
t1 = Time.local(2020, 1, 1)
t2 = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t1 <=> t2

# 日時を文字列にフォーマット
t = Time.local(2020, 10, 22, 9, 1, 2, 3)
puts t.strftime("日時は %Y/%m/%d %T です")

# parseメソッドを使った文字列から日時への変換
t = Time.parse("2020/10/22 09:01:02")
puts t
t = Time.parse("2020-10-22 9:1:2")
puts t
t = Time.parse("20201022 090102")
puts t

# strptimeメソッドを使った文字列から日時への変換
t = Time.strptime("2020/10/22 09:01:02", "%Y/%m/%d %T")
puts t
t = Time.strptime("2020年10月22日 9時1分2秒", "%Y年%m月%d日 %H時%M分%S秒")
puts t

puts "--------------"

require 'active_support/time'

t = Time.local(2020, 10, 22, 9, 1, 2, 3)
# 昨日
puts t.yesterday
# 明日
puts t.tomorrow
# 先週の始め（月曜日）
puts t.prev_week
# 来週の土曜日
puts t.next_week(:saturday)
# 月初
puts t.beginning_of_month
# 月末
puts t.end_of_month
# 1日後
puts t + 1.days
# 2週間後
puts t + 2.week
# 3年前
puts t - 3.years






