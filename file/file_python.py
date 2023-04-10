
# ファイル読み込み
try:
    with open('./files/testfile.txt', 'r') as f:
        s = f.read()
        print(s)
except Exception as e:
    print(e)

# 1行ずつファイル読み込み
try:
    with open('./files/testfile.txt', 'r') as f:
        s = f.readline()
        print(s)
except Exception as e:
    print(e)

# 新規ファイルに書き込み
s = "新規にファイルを作成するテスト"
try:
    with open('./files/writefile.txt', 'w') as f:
        f.write(s)
except Exception as e:
    print(e)

# ファイルに追記
s = "既存にファイルに追記するテスト"
try:
    with open('./files/writefile.txt', 'a') as f:
        f.write(s)
except Exception as e:
    print(e)

# ファイルを削除
import os
try:
    os.remove('./files/writefile.txt')
except Exception as e:
    print(e)

# ファイルの存在確認
print(os.path.exists('./files/testfile.txt'))
print(os.path.exists('./files/notexistsfile.txt'))
print(os.path.exists('./files'))

# ファイルとディレクトリの判別
print(os.path.isfile('./files/testfile.txt'))
print(os.path.isdir('./files/testfile.txt'))
print(os.path.isfile('./files'))
print(os.path.isdir('./files'))

# ファイルのコピー
import shutil
try:
    shutil.copy('./files/testfile.txt', './files/copyfile.txt')
except Exception as e:
    print(e)

try:
    shutil.copy2('./files/testfile.txt', './files/copyfile.txt')
except Exception as e:
    print(e)

# ディレクトリ一覧取得
try:
    print(os.listdir('./files'))
except Exception as e:
    print(e)

import glob
try:
    print(glob.glob('./files/**', recursive=True))
except Exception as e:
    print(e)

# ディレクトリ作成
try:
    os.mkdir('./files/testdir1')
except Exception as e:
    print(e)

try:
    os.makedirs('./files/testdir2/testdir2', exist_ok=True)
except Exception as e:
    print(e)

# 一時ディレクトリの作成
import tempfile
try:
    with tempfile.TemporaryDirectory() as tempdir:
        print(tempdir)
        print(os.path.exists(tempdir))
    print(os.path.exists(tempdir))
except Exception as e:
    print(e)

# ディレクトリの削除
try:
    os.rmdir('./files/testdir1')
except Exception as e:
    print(e)

try:
    os.removedirs('./files/testdir2/testdir2')
except Exception as e:
    print(e)

# ファイルとディレクトリの一括削除
try:
    shutil.rmtree('./files/testdir3', ignore_errors=True)
except Exception as e:
    print(e)
