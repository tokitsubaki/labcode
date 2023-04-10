# ファイルの読み込み
begin
    File.open("./files/testfile.txt", "r") do |file|
        puts file.read
    end
rescue  => e
    puts e.message
end

# ファイルを1行ずつ読み込み
begin
    File.open("./files/testfile.txt", "r") do |file|
        puts file.gets
    end
rescue  => e
    puts e.message
end

# ファイルの書き込み
begin
    File.open("./files/writefile.txt", "w") do |file|
        file.puts("新規にファイルを作成するテスト")
    end
rescue => e
    puts e.message
end

# 既存ファイルへの追記
begin
    File.open("./files/writefile.txt", "a") do |file|
        file.puts("既存にファイルに追記するテスト")
    end
rescue => e
    puts e.message
end

# ファイルの削除
begin
    n = File.delete("./files/writefile.txt")
    puts n
rescue => e
    puts e
end

# ファイルの存在確認
puts File.exist?("./files/testfile.txt")
puts File.exist?("./files/notexist.txt")
puts File.exist?("./files")

# ファイルかディレクトリかの判別
puts File.file?("./files/testfile.txt")
puts File.file?("./files")
puts File.directory?("./files/testfile.txt")
puts File.directory?("./files")

# ファイルのコピー
require 'fileutils'
begin
    FileUtils.copy("./files/testfile.txt", "./files/copyfile.txt")
rescue => e
    puts e
end

begin
    FileUtils.copy("./files/testfile.txt", "./files/copyfile2.txt", :preserve => true)
rescue => e
    puts e
end

# ディレクトリ一覧の取得
begin
    s = Dir.children("./files")
    puts s.inspect
rescue => e
    puts e
end

# ディレクトリ配下の一覧を取得
begin
    s = Dir.glob("./files/**/*")
    puts s.inspect
rescue => e
    puts e
end

# ディレクトリを作成
begin
    n = Dir.mkdir("./files/testdir1")
    puts n
rescue => e
    puts e
end

# 親ディレクトリも含めてディレクトリを作成
begin
    a = FileUtils.makedirs("./files/testdir2/testdir2")
    puts a
rescue => e
    puts e
end

# 一時ディレクトリを作成
require 'tmpdir'
begin
    Dir.mktmpdir("prefix-", "./files/") {|dir|
        puts dir
    }
rescue => e
    puts e
end

# ディレクトリを削除
begin
    n = Dir.rmdir("./files/testdir1")
    puts n
rescue => e
    puts e
end

# ディレクトリの一括削除
begin
    FileUtils.remove_entry_secure("./files/testdir2")
rescue => e
    puts e
end


