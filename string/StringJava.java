import java.util.Arrays;

public class StringJava {
    public static void main(String[] args) {

        String s = "";
        String s1 = "";
        String s2 = "";
        String r = "";
        int n = 0;
        int rn = 0;
        boolean rb = false;

        // +演算子による結合
        s1 = "Hello";
        s2 = "Java";
        r = s1 + s2;
        System.out.println(r); // -> HelloJava

        s1 = "Hello";
        s2 = "Java";
        n = 1234;
        r = s1 + s2 + n;
        System.out.println(r); // -> HelloJava1234

        // concatによる結合
        s1 = "Hello";
        s2 = "Java";
        r = s1.concat(s2);
        System.out.println(r); // -> HelloJava

        // joinによる結合
        String[] a = {"Java", "Hello", "World"};
        r = String.join(" ", a);
        System.out.println(r); // -> Java Hello World

        // formatによる文字列の埋め込み
        s1 = "Hello";
        s2 = "Java";
        r = String.format("%s %s!!", s1, s2);
        System.out.println(r); // -> Hello Java!!

        // StringBuilderによる結合
        s1 = "Hello";
        s2 = "Java";
        StringBuilder builder = new StringBuilder();
        builder.append(s1).append(s2);
        r = builder.toString();
        System.out.println(r); // -> HelloJava

        // substringによる抽出
        s = "Hello Java!!";
        r = s.substring(6, 10);
        System.out.println(r); // -> Java
        
        // lengthによる文字列長の取得
        s = "1234567890";
        rn = s.length();
        System.out.println(rn); // -> 10

        // isEmptyによる空文字かどうか判定
        s = "";
        rb = s.isEmpty();
        System.out.println(rb); // -> true

        // containsによる文字列検索
        s = "Hello Java!!";
        rb = s.contains("Java");
        System.out.println(rb); // -> true

        // indexOfによる文字列検索
        s = "Hello Java!!";
        rn = s.indexOf("a");
        System.out.println(rn); // -> 7

        // lastIndexOfによる文字列検索
        s = "Hello Java!!";
        rn = s.lastIndexOf("a");
        System.out.println(rn); // -> 9

        // matchesによる文字列検索
        s = "Hello Java!!";
        rb = s.matches(".*Java.*");
        System.out.println(rb); // -> true

        // startsWithによる文字列検索
        s = "Hello Java!!";
        rb = s.startsWith("Hello");
        System.out.println(rb); // -> true

        // endsWithによる文字列検索
        s = "Hello Java!!";
        rb = s.endsWith("!!");
        System.out.println(rb); // -> true

        // replaceによる置換
        s = "Hello Java??";
        r = s.replace("?", "!");
        System.out.println(r); // -> Hello Java!!

        // replaceAllによる置換
        s = "Hello Java??";
        r = s.replaceAll("\\?", "!");
        System.out.println(r); // -> Hello Java!!

        // replaceFirstによる置換
        s = "Hello Java??";
        r = s.replaceFirst("\\?", "!");
        System.out.println(r); // -> Hello Java!?

        // replaceによる文字列削除
        s = "Hello Java!!";
        r = s.replace("Hello ", "");
        System.out.println(r); // -> Java!!

        // splitによる分割
        s = "JavaScript,Python,Java,Ruby,Go";
        String[] rs = s.split(",");
        System.out.println(Arrays.toString(rs)); // -> [JavaScript, Python, Java, Ruby, Go]

        // trimによるトリミング
        s = "   Hello Java!!   ";
        r = s.trim();
        System.out.println(r); // -> 「Hello Java!!」

        // formatによるパディング
        n = 123;
        r = String.format("%010d", n);
        System.out.println(r); // -> 0000000123

        // toUpperCaseによる大文字変換
        s = "Java";
        r = s.toUpperCase();
        System.out.println(r); // -> JAVA

        // toLowerCaseによる大文字変換
        s = "Java";
        r = s.toLowerCase();
        System.out.println(r); // -> java

        // Integer.parseIntによる文字列から数値への変換
        s = "123";
        n = Integer.parseInt(s);
        System.out.println(n); // -> 123
        
        // Integer.valueOfによる文字列から数値への変換
        s = "123";
        Integer nn = Integer.valueOf(s);
        System.out.println(nn); // -> 123
        System.out.println(nn instanceof Integer); // -> true
        
        // String.valueOfによる数値から文字列への変換
        n = 123;
        r = String.valueOf(n);
        System.out.println(n); // -> 123
        System.out.println(r instanceof String); // -> true

        // equalsによる文字列比較
        s = "Java";
        rb = s.equals("Java");
        System.out.println(rb); // -> true

        // equalsIgnoreCaseによる文字列比較
        s = "Java";
        rb = s.equalsIgnoreCase("java");
        System.out.println(rb); // -> true

        // compareToによる文字列比較
        s = "Java";
        rn = s.compareTo("Java");
        System.out.println(rn); // -> 0
        
    }
}