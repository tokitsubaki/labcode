import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.stream.Stream;

public class FileJava {
    
    public static void main(String[] args) {
        
        // ファイルの読み込み
        try {
            Path path = Paths.get("./files/testfile.txt");
            String s = Files.readString(path);
            System.out.println(s);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ストリームを使った読み込み
        try (Stream<String> s = Files.lines(Paths.get("./files/testfile.txt"))){
            s.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        // ファイルの書き込み
        try {
            String s = "新規にファイルを作成するテスト";
            Path path = Paths.get("./files/writefile.txt");
            Files.writeString(path, s);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ストリームを使ったファイルの書き込み
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get("./files/writefile.txt"))) {
            String s = "ストリームを使って新規にファイルを作成するテスト";
            bw.write(s);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ファイルの追記
        try {
            String s = "既存にファイルに追記するテスト";
            Path path = Paths.get("./files/writefile.txt");
            Files.writeString(path, s, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        // ストリームを使ったファイルの追記
        try(BufferedWriter bw = Files.newBufferedWriter(
                                Paths.get("./files/writefile.txt"),
                                StandardOpenOption.APPEND,
                                StandardOpenOption.CREATE)) {
            String s = "ストリームを使って既存ファイルに追記するテスト";
            bw.write(s);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ファイルの削除
        try {
            Path path = Paths.get("./files/writefile.txt");
            Files.delete(path);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ファイルが存在したら削除
        try {
            Path path = Paths.get("./files/writefile.txt");
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ファイルの存在確認
        System.out.println(Files.exists(Paths.get("./files/testfile.txt")));
        System.out.println(Files.exists(Paths.get("./files/notexists.txt")));
        System.out.println(Files.exists(Paths.get("./files")));

        // ファイルとディレクトリの判別
        System.out.println(Files.isRegularFile(Paths.get("./files/testfile.txt")));
        System.out.println(Files.isDirectory(Paths.get("./files/testfile.txt")));
        System.out.println(Files.isRegularFile(Paths.get("./files")));
        System.out.println(Files.isDirectory(Paths.get("./files")));

        // ファイルのコピー
        try {
            Path src = Paths.get("./files/testfile.txt");
            Path dst = Paths.get("./files/copyfile.txt");
            Files.copy(src, dst, StandardCopyOption.COPY_ATTRIBUTES);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ディレクトリの一覧を取得
        try (Stream<Path> s = Files.list(Paths.get("./files"))){
            s.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ディレクトリの配下すべてを取得
        try (Stream<Path> s = Files.walk(Paths.get("./files"))){
            s.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ディレクトリの配下を指定した条件で取得
        try (Stream<Path> s = Files.find(Paths.get("./files"), Integer.MAX_VALUE, (p, a) -> a.isRegularFile())){
            s.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ディレクトリ作成
        try {
            Path path = Paths.get("./files/testdir1");
            Files.createDirectory(path);
        } catch (IOException e) {
            System.out.println(e);
        }

        // 親ディレクトリを含めて作成
        try {
            Path path = Paths.get("./files/testdir2/testdir2");
            Files.createDirectories(path);
        } catch (IOException e) {
            System.out.println(e);
        }

        // 一時ディレクトリの作成
        try {
            Path path = Paths.get("./files/");
            Path tempdir = Files.createTempDirectory(path, "prefix-");
            System.out.println(tempdir.toString());
        } catch (IOException e) {
            System.out.println(e);
        }

        // ディレクトリの削除
        try {
            Path path = Paths.get("./files/testdir1");
            Files.delete(path);
        } catch (IOException e) {
            System.out.println(e);
        }

        // ディレクトリの一括削除
        try (Stream<Path> s = Files.walk(Paths.get("./files/testdir2"))){
            s.sorted(Comparator.reverseOrder()).forEach(p -> {
                try {
                    Files.delete(p);
                } catch (IOException e) {
                    System.out.println(e);
                }
            });
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}