def main
    retry_count = 0
    begin
        puts "before exception."
        raise_test_exception
        puts "after exception."
    rescue => e
        puts e.message
        puts e.backtrace
        retry_count += 1
        retry if retry_count <= 3
    else
        puts "not exception."
    ensure
        puts "ensure."
    end
end

def raise_test_exception
    puts "before raise."
    raise "Test exception."
    puts "after raise."
end

main