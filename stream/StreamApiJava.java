import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiJava {
    public static void main(String[] args) {
        
        // 従来
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (int i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // ストリームAPI
        list.stream()
            .filter(i -> i % 2 == 0)
            .forEach(System.out::println);

        // filter
        List<Integer> r1 = list.stream()
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toList());
        System.out.println(r1);

        // 変換
        List<String> r2 = list.stream()
            .map(i -> String.format("#%d", i))
            .collect(Collectors.toList());
        System.out.println(r2);

        // ソート
        List<Integer> r3 = list.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println(r3);

        // 要素数制限（リミット）
        List<Integer> r4 = list.stream()
            .limit(5)
            .collect(Collectors.toList());
        System.out.println(r4);

        // 要素数制限（スキップ）
        List<Integer> r5 = list.stream()
            .skip(5)
            .collect(Collectors.toList());
        System.out.println(r5);

        // 重複排除
        List<Integer> list2 = List.of(1, 2, 1, 4, 2, 3, 3, 4, 5, 1);
        List<Integer> r6 = list2.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(r6);

        // デバッグ用アクション実行
        List<Integer> r7 = list.stream()
            .peek(System.out::println)
            .collect(Collectors.toList());
        System.out.println(r7);


        // 繰り返し処理
        StringBuilder sb = new StringBuilder();
        list.stream()
            .map(i -> "#" + i)
            .forEach(s -> sb.append(s));
        System.out.println(sb);

        // 一致判定
        boolean r8 = list.stream()
            .filter(i -> i % 2 == 0)
            .allMatch(i -> i == 2);
        System.out.println(r8);

        // 一部判定
        boolean r9 = list.stream()
            .filter(i -> i % 2 == 0)
            .anyMatch(i -> i == 2);
        System.out.println(r9);
        
        // 非合致判定
        boolean r10 = list.stream()
            .filter(i -> i % 2 == 0)
            .noneMatch(i -> i == 2);
        System.out.println(r10);

        // 要素数
        long r11 = list.stream()
            .filter(i -> i % 2 == 1)
            .count();
        System.out.println(r11);

        // 集計
        int r12 = list.stream()
            .mapToInt(i -> i)
            .sum();
        System.out.println(r12);

        OptionalInt r13 = list.stream()
            .mapToInt(i -> i)
            .max();
        System.out.println(r13.getAsInt());

        OptionalInt r14 = list.stream()
            .mapToInt(i -> i)
            .min();
        System.out.println(r14.getAsInt());

        // リストや配列として取得
        Set<Integer> r15 = list.stream()
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toSet());
        System.out.println(r15);

        Integer[] r16 = list.stream()
            .filter(i -> i % 2 == 0)
            .toArray(Integer[]::new);
        System.out.println(Arrays.toString(r16));


        // 並列ストリーム
        list.parallelStream()
            .mapToInt(i -> i)
            .forEach(System.out::println);

    }
}