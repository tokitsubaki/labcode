import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalJava {
    public static void main(String[] args) {
        
        // Optionalではない
        String result1 = getHello("Java");
        System.out.println(result1 + "Java");

        String result2 = getHello("Python");
        System.out.println(result2 + "Python");
        if (result2 == null) {
            System.out.println("Python");
        }

        // Optionalを使う
        Optional<String> result3 = getOptionalHello("Java");
        System.out.println(result3.orElseGet(() -> "" ) + "Java" );

        Optional<String> result4 = getOptionalHello("Python");
        System.out.println(result4.orElseGet(() -> "" ) + "Python" );

        // Optionalを作成する
        Optional<String> v1 = Optional.empty();
        Optional<String> v2 = Optional.of("value");
        Optional<String> v3 = Optional.ofNullable("value");

        // 値を取得する
        System.out.println(v2.get());

        // 値がない時にデフォルト値を指定する
        System.out.println(v1.orElse("Java"));
        System.out.println(v3.orElseGet(() -> "Java"));

        // 値の存在を確認する
        System.out.println(v2.isPresent());
        System.out.println(v1.isPresent());
        System.out.println(v2.isEmpty());
        System.out.println(v1.isEmpty());

        // 値がある時だけ処理をする
        v1.ifPresent(System.out::println);
        v2.ifPresent(System.out::println);

        v1.ifPresentOrElse(System.out::println, () -> System.out.println("値が存在しない"));
        v2.ifPresentOrElse(System.out::println, () -> System.out.println("値が存在しない"));

        // 値がある時だけ処理をして結果を返す
        System.out.println(v2.map(s -> s.length()));

        // 2つのOptionalを処理して結果を返す
        System.out.println(v2.flatMap(s1 -> v3.flatMap(s2 -> {
            return Optional.of(s1 + s2);
        })));

        // 条件に一致する場合にOptionalを返す
        System.out.println(v2.filter(s -> s.equals("value")));
        System.out.println(v2.filter(s -> s.equals("Java")));

        // 値のストリームを作成する
        Optional<List<String>> arr = Optional.of(Arrays.asList("Java", "Python", "Ruby"));
        arr.stream().flatMap(v -> v.stream()).forEach(System.out::println);
    }

    public static String getHello(String word) {
        return "Java".equals(word) ? "Hello" : null;
    }

    public static Optional<String> getOptionalHello(String word) {
        return "Java".equals(word) ? Optional.of("Hello") : Optional.empty();
    }
}