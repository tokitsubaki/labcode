# %
s = %(Hello Ruby!!)
puts s

# %Q
lang = %(Ruby)
s = %Q(Hello #{lang}!!)
puts s

# %q
s = %q(Hello Ruby!!)
puts s

lang = %(Ruby)
s = %q(Hello #{lang}!!)
puts s

# %x
result = %x(date)
puts result

# %r
s = "Hello Ruby!!"
regex = %r(Ruby)
p regex =~ s

# %w
arr = %w(Ruby Python Java)
p arr
ruby = "Ruby"
arr = %w(#{ruby} Python Java)
p arr

# %W
ruby = "Ruby"
arr = %W(#{ruby} Python Java)
p arr

# %s
symbol = %s(Ruby)
p symbol

# %i
arr = %i(Ruby Python Java)
p arr
arr = %i(#{ruby} Python Java)
p arr

# %I
ruby = "Ruby"
arr = %I(#{ruby} Python Java)
p arr
