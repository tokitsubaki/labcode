print <<EOS
ヒアドキュメント1行目
ヒアドキュメント2行目
EOS

print <<~EOS
{
    "str1": "ヒアドキュメント1行目",
    "str2": "ヒアドキュメント2行目"
}
EOS

def print_heredoc
    print <<-EOS
ヒアドキュメント1行目
ヒアドキュメント2行目
    EOS
end

print_heredoc

str = "変数展開"
print <<EOS
#{str}1行目
#{str}2行目
EOS
print <<"EOS"
#{str}3行目
#{str}4行目
EOS

str = "変数展開されない"
print <<'EOS'
#{str}1行目
#{str}2行目
EOS

def print_str(str1, str2, str3)
    print "#{str1}。#{str2}。#{str3}。"
end

str3 = "3つ目"
print_str("1つ目", <<EOS, str3)
2つ目は
ヒアドキュメント
EOS

puts

print <<EOS.upcase
Hello
Ruby
EOS

print <<`EOS`
echo "現在の日時は"
date
echo "です。"
EOS

print <<EOS1, <<EOS2
1つ目のヒアドキュメント1行目
1つ目のヒアドキュメント2行目
EOS1
2つ目のヒアドキュメント1行目
2つ目のヒアドキュメント2行目
EOS2

