import subprocess

# 基本形
result = subprocess.run(["date"], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(result.returncode)
print(result.stdout)

# シェル形式
result = subprocess.run("date '+%Y%m%d-%H%M%S'", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(result.returncode)
print(result.stdout)

# エラー
result = subprocess.run("notcommand", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(result.returncode)
print(result.stdout)
print(result.stderr)

# プログラムから値を渡す
str = "Hello"
result = subprocess.run("cat", shell=True, input=str, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(result.returncode)
print(result.stdout)

# 非同期実行
proc = subprocess.Popen("sleep 5; date; notcommand", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
result = proc.communicate()
print(result)

# プロセスID取得
proc = subprocess.Popen("sleep 5", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(proc.pid)

# ステータス取得
proc = subprocess.Popen("sleep 5", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(proc.poll())
proc.terminate()
proc.wait()
print(proc.poll())

# kill
proc = subprocess.Popen("sleep 5", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
print(proc.poll())
proc.kill()
proc.wait()
print(proc.poll())
