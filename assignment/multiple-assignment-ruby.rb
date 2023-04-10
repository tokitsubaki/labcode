# 多重代入
# 基本
a, b = 1, 2
p a
p b


# 左辺の要素が多い
a, b, c = 1, 2
p a
p b
p c

# 右辺の要素が多い
a, b = 1, 2, 3
p a
p b

# 残り全部
a, *b = 1, 2, 3
p a
p b

# 残り全部（左辺の要素が多い）
a, *b = 1
p a
p b

# 先頭のみ取得
a, = 1, 2
p a

# 末尾のみ取得
*, b = 1, 2
p b

# 先頭と末尾を取得
a, *, b = 1, 2, 3, 4
p a
p b

# 中を取得
_, a, b, = 1, 2, 3, 4
p a
p b

# 配列
a, b = [1, 2]
p a
p b

# 配列との混在
a, b = [1, 2], 3
p a
p b

# 配列の展開
a, b = *[1, 2], 3
p a
p b

# 空の配列
a, b = [], 1, 2
p a
p b

a, b = *[], 1, 2
p a
p b

# 二重配列
a, b = [[1, 2], [3, 4]]
p a
p b

a, b = *[[1, 2], [3, 4]]
p a
p b

# 二重配列混在
a, b = [[1, 2], [3, 4]], 5, 6
p a
p b

a, b = *[[1, 2], [3, 4]], 5, 6
p a
p b


# ネスト
a, (b, c) = 1, [2, 3]
p a
p b
p c


# ハッシュ
a, b = {x: 1, y: 2}
p a
p b

a, b = *{x: 1, y: 2}
p a
p b

# values_at
a, b = {x: 1, y: 2}.values_at(:x, :y)
p a
p b