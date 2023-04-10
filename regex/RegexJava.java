import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexJava {
    public static void main(String[] args) {
        
        String str = "";
        String regex = "";
        String rep = "";
        Pattern p = null;
        Matcher m = null;

        // 正規表現によるチェック
        str = "Hello Java!!";

        regex = ".+Java.+";

        System.out.println(str.matches(regex));

        p = Pattern.compile(regex);
        System.out.println(p.matcher(str).matches());
        System.out.println(p.matcher(str).find());

        regex = ".+java.+";
        p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println(p.matcher(str).matches());
        System.out.println(p.matcher(str).find());

        regex = "\\w+";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group());
        }
        if (m.find()) {
            System.out.println(m.group());
        }


        // 正規表現による置換
        str = "Hello Java!!";
        regex = "\\w";
        rep = "*";

        System.out.println(str.replaceAll(regex, rep));
        System.out.println(str.replaceFirst(regex, rep));

        p = Pattern.compile(regex);
        System.out.println(p.matcher(str).replaceAll(rep));
        System.out.println(p.matcher(str).replaceFirst(rep));

        // 正規表現による抽出
        str = "Hello Java!!";
        regex = "(\\w+)\\s(\\w+)!!";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if (m.matches()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
        
        str = "Hello Java!!";
        regex = "(\\w+)\\s(\\w+)!!";
        System.out.println(str.replaceAll(regex, "$2 $1"));
        System.out.println(p.matcher(str).replaceAll("$2 $1"));

        // エスケープ
        str = "Hello+Java.";
        regex = "\\w+\\+\\w+\\.";
        System.out.println(str.matches(regex));

        p = Pattern.compile(regex);
        System.out.println(p.matcher(str).matches());

    }
}