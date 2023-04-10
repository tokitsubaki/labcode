# 基本形
def func
    yield
end

func { puts "Ruby" }
func do
    puts "Ruby"
end

# 引数
def func2
    yield(1, 2)
end
func2 {|a, b| puts a + b}

# 複数回のyield
def func3
    yield 10
    yield 20
    yield 30
end
func3 {|a| puts a * 2}

# ブロック引数の確認
def func4
    puts block_given?
    yield if block_given?
end
func4 { puts "Ruby"}
func4


# 明示的なブロック引数の利用
def func5(&proc)
    proc.call
end
func5 { puts "Ruby"}

# yield文で戻り値を受け取る
def func6
    return yield
end
s = func6 {return "Ruby"}