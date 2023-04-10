import datetime
from dateutil.relativedelta import relativedelta
import arrow

# 現在日時の生成
d = datetime.datetime.today()
print(d)
d = datetime.datetime.now()
print(d)

# 任意の日時の生成
d = datetime.datetime(2020, 10, 20, 9, 33, 3)
print(d)
d = datetime.datetime(2020, 10, 20)
print(d)

# 日付と時刻を併せて生成
date = datetime.date(2020, 10, 20)
time = datetime.time(9, 33, 33)
d = datetime.datetime.combine(date, time)
print(d)

# 各属性を取得
d = datetime.datetime(2020, 10, 20, 9, 1, 2)
print(d.year)
print(d.month)
print(d.day)
print(d.hour)
print(d.minute)
print(d.second)
print(d.microsecond)

# 曜日の取得
d = datetime.datetime(2020, 10, 20)
print(d.weekday())
print(d.isoweekday())

# タプルで取得
d = datetime.datetime(2020, 10, 20, 9, 1, 2)
t = d.timetuple()
print(t)

# dateに変換
d = datetime.datetime(2020, 10, 20, 9, 1, 2)
date = d.date()
print(date)

# timeに変換
d = datetime.datetime(2020, 10, 20, 9, 1, 2)
time = d.time()
print(time)

# 日時の加算
d = datetime.datetime(2020, 1, 1)
print(d + datetime.timedelta(days=1))
print(d + datetime.timedelta(hours=2))
print(d + datetime.timedelta(minutes=3))
print(d + datetime.timedelta(seconds=4))
print(d + datetime.timedelta(milliseconds=5))
print(d + datetime.timedelta(microseconds=6))
print(d + datetime.timedelta(weeks=7))

# 日時の減算
d = datetime.datetime(2020, 1, 1)
print(d - datetime.timedelta(days=1))
print(d - datetime.timedelta(hours=2))
print(d - datetime.timedelta(minutes=3))
print(d - datetime.timedelta(seconds=4))
print(d - datetime.timedelta(milliseconds=5))
print(d - datetime.timedelta(microseconds=6))
print(d - datetime.timedelta(weeks=7))

# 日時の差分
d1 = datetime.datetime(2020, 1, 1)
d2 = datetime.datetime(2020, 10, 20, 9, 1, 2)
delta = d2 - d1
print(delta)

# 日時の比較
d1 = datetime.datetime(2020, 1, 1)
d2 = datetime.datetime(2020, 10, 20, 9, 1, 2)
print(d1 > d2)
print(d1 >= d2)
print(d1 == d2)
print(d1 <= d2)
print(d1 < d2)

# 日時から文字列へのフォーマット
d = datetime.datetime(2020, 10, 20, 9, 1, 2)
s = d.strftime("%Y/%m/%d %H:%M:%S")
print(s)

# 文字列から日時への変換
s = "2020/10/20 09:01:02"
d = datetime.datetime.strptime(s, "%Y/%m/%d %H:%M:%S")
print(d)

# dateutilの利用
d = datetime.datetime(2020, 10, 20, 9, 1, 2)
print(d + relativedelta(months=1))
print(d + relativedelta(years=1))

print(d - relativedelta(months=1))
print(d - relativedelta(years=1))

# arrowの利用
d = arrow.get('2020-10-20T09:01:02')
print(d)
print(d.format("YYYY/MM/DD HH:mm:ss"))

