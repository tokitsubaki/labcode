def threadA(name)
    puts "#{name} start."
    sleep(rand(0.0..3.0))
    puts "#{name} end."
end

def threadB(name)
    puts "#{name} start."
    time = rand(0.0..3.0) 
    sleep(time)
    puts "#{name} end."
    return "#{name} #{time}"
end

puts "スレッド開始"
t1 = Thread.new {threadA("スレッドA-1")}
t2 = Thread.start {threadA("スレッドA-2")}
t3 = Thread.fork {threadA("スレッドA-3")}
t1.join
t2.join
t3.join
puts "スレッド終了"

puts "---------------------------------"

puts "スレッド開始"
t4 = Thread.new {threadB("スレッドB-1")}
t5 = Thread.start {threadB("スレッドB-2")}
t6 = Thread.fork {threadB("スレッドB-3")}
puts t4.value
puts t5.value
puts t6.value
puts "スレッド終了"

puts "---------------------------------"

# スレッドプールの実装
queue = Thread::Queue.new
3.times do
    queue.push(:lock)
end

puts "スレッド開始"
Array.new(5) do |i|
    Thread.start do
        lock = queue.pop
        threadB("スレッドC-#{i+1}")
        queue.push(lock)
    end
end.each(&:join)
puts "スレッド終了"

puts "---------------------------------"

queue = Thread::SizedQueue.new(3)

puts "スレッド開始"
Array.new(5) do |i|
    Thread.start do
        queue.push(:lock)
        threadB("スレッドD-#{i+1}")
        queue.pop
    end
end.each(&:join)
puts "スレッド終了"
