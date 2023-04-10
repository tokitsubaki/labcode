# Kernel.#system
result = system('date')
p result

# バッククォート
result = `date`
p result

# %x( cmd )
result = %x(date)
p result

# IO.popen
result = IO.popen("cat", "r+") {|io|
    io.puts "Hello"
    io.close_write
    io.gets
}
p result

# Open3.capture3
require "open3"

result, err, status = Open3.capture3("date")
p result
p err
p status

# Open3.popen3
require "open3"

Open3.popen3("cat") do |input, output, err, status|
    input.write "Hello"
    input.close
    output.each do |line| p line end
    err.each do |line| p line end
    p status.value
end

# Kernel#exec
result = exec('date')








