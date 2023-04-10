const fs = require('fs');

// ファイルの読み込み
try {
    f = fs.readFileSync('./files/testfile.txt', 'utf-8');
    console.log(f);
} catch (err) {
    console.log("err");
}

// ファイルを1行ずつ読み込む
const readline = require('readline');
rs = fs.createReadStream('./files/testfile.txt');
rl = readline.createInterface(rs, {});
rl.on('line', function(line) {
    console.log(line);
});

// 新規にファイルに書き込み
s = "新規にファイルを作成するテスト";
try {
    fs.writeFileSync('./files/writefile.txt', s, 'utf-8');
} catch (err) {
    console.log(err);
}

// 既存ファイルに追記
s = "既存にファイルに追記するテスト";
try {
    fs.appendFileSync('./files/writefile.txt', s, 'utf-8');
} catch (err) {
    console.log(err);
}

// ファイルを削除
try {
    fs.unlinkSync('./files/writefile.txt');
} catch (err) {
    console.log(err);
}

// ファイルの存在確認
console.log(fs.existsSync('./files/testfile.txt'));
console.log(fs.existsSync('./files/notexists.txt'));
console.log(fs.existsSync('./files'));

// ファイルかディレクトリかの確認
stats = fs.statSync('./files/testfile.txt');
console.log(stats.isFile());
stats = fs.statSync('./files');
console.log(stats.isDirectory());

// ファイルのコピー（既存ファイル存在時上書き）
try {
    fs.copyFileSync('./files/testfile.txt', './files/copyfile.txt');
    console.log(fs.existsSync('./files/copyfile.txt'));
} catch (err) {
    console.log(err);
}

// ファイルのコピー（既存ファイル存在時エラー）
try {
    fs.copyFileSync('./files/testfile.txt', './files/copyfile.txt', fs.constants.COPYFILE_EXCL);
} catch (err) {
    console.log(err);
}

// ディレクトリの一覧取得
try {
    d = fs.readdirSync('./files');
    console.log(d);
} catch (err) {
    console.log(err);
}

// ディレクトリの作成
try {
    fs.mkdirSync('./files/testdir');
    fs.mkdirSync('./files/testdir2/testdir2', {recursive: true});
} catch (err) {
    console.log(err);
}

// 一時ディレクトリの作成
try {
    d = fs.mkdtempSync('./files/dir-');
    console.log(d);
} catch (err) {
    console.log(err);
}

// ディレクトリの削除
try {
    fs.rmdirSync('files/testdir');
} catch (err) {
    console.log(err);
}

// ディレクトリの再帰削除
try {
    fs.rmdirSync('files/testdir2', {recursive: true});
} catch (err) {
    console.log(err);
}

// ディレクトリとファイルの一括削除
try {
    fs.rmSync('./files/testdir3', {recursive: true});
} catch (err) {
    console.log(err);
}


