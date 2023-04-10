import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionJava {
    public static void main(String[] args) {
        
        String r = "";
        int rn = 0;
        boolean rb = false;

        // 配列の作成
        String[] a = {"Hello", "Java"};
        System.out.println(Arrays.asList(a)); // -> [Hello, Java]

        // 配列の作成
        String[] a2 = new String[2];
        a2[0] = "Hello";
        a2[1] = "Java";
        System.out.println(Arrays.asList(a2)); // -> [Hello, Java]

        // Listの作成
        List<String> l = new ArrayList<>();
        System.out.println(l); // -> []

        // Listの作成
        List<String> l2 = Arrays.asList();
        System.out.println(l2); // -> []

        // Mapの作成
        Map<Integer, String> m = new HashMap<>();
        System.out.println(m); // -> {}

        // Setの作成
        Set<String> s = new HashSet<>();
        System.out.println(s); // -> []

        // 配列から値を取得する
        a[0] = "Hello";
        a[1] = "Java";
        r = a[1];
        System.out.println(r); // -> Java

        // Listから値を取得する
        l = Arrays.asList("Hello", "Java");
        r = l.get(1);
        System.out.println(r); // -> Java

        // Mapから値を取得する
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        r = m.get(2);
        System.out.println(r); // -> Java

        // 配列の長さを取得する
        a[0] = "Hello";
        a[1] = "Java";
        rn = a.length;
        System.out.println(rn); // -> 2

        // Listの長さを取得する
        l = Arrays.asList("Hello", "Java");
        rn = l.size();
        System.out.println(rn); // -> 2

        // Mapの長さを取得する
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        rn = m.size();
        System.out.println(rn); // -> 2

        // Setの長さを取得する
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        rn = s.size();
        System.out.println(rn); // -> 2

        // Listに要素を追加する
        l = new ArrayList<>();
        l.add("Hello");
        l.add("Java");
        System.out.println(l); // -> [Hello, Java]

        // Mapに要素を追加する
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        System.out.println(m); // -> {1=Hello, 2=Java}

        // Setに要素を追加する
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        System.out.println(s); // -> [Java, Hello]

        // Listから要素を削除する
        l = new ArrayList<>();
        l.add("Hello");
        l.add("Java");
        l.remove(0);
        System.out.println(l); // -> [Java]

        // Mapから要素を削除する
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        m.remove(1);
        System.out.println(m); // -> {2=Java}

        // Setから要素を削除する
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        s.remove("Hello");
        System.out.println(s); // -> [Java]

        // 配列をコピーする
        a[0] = "Hello";
        a[1] = "Java";
        String[] ra = new String[a.length];
        System.arraycopy(a, 0, ra, 0, a.length);
        System.out.println(Arrays.asList(ra)); // -> [Hello, Java]

        // Listをコピーする
        l = new ArrayList<>();
        l.add("Hello");
        l.add("Java");
        List<String> rl = new ArrayList<>(l);
        System.out.println(rl); // -> [Hello, Java]

        // Mapをコピーする
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        Map<Integer, String> rm = new HashMap<>(m);
        System.out.println(rm); // -> {1=Hello, 2=Java}

        // Setをコピーする
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        Set<String> rs = new HashSet<>(s);
        System.out.println(rs); // -> [Java, Hello]

        // 配列をループさせる
        a[0] = "Hello";
        a[1] = "Java";
        for (String item : a) {
            System.out.println(item); // -> Hello -> Java
        }

        // Listをループさせる
        l = new ArrayList<>();
        l.add("Hello");
        l.add("Java");
        for (String item : l) {
            System.out.println(item); // -> Hello -> Java
        }
        
        // forEatchでListをループさせる
        l = new ArrayList<>();
        l.add("Hello");
        l.add("Java");
        l.forEach(item -> {
            System.out.println(item); // -> Hello -> Java
        });
        
        // Mapをループさせる
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); // -> 1 Hello -> 2 Java
        }
                
        // forEachでMapをループさせる
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        m.forEach((key, value) -> {
            System.out.println(key + " " + value); // -> 1 Hello -> 2 Java
        });
        
        // Setをループさせる
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        Iterator<String> iterator = s.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next()); // -> Java -> Hello
        }
        
        // forEachでSetをループさせる
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        s.forEach(item -> {
            System.out.println(item); // -> Java -> Hello
        });
            
        // 配列をソートする
        a[0] = "Java";
        a[1] = "Hello";
        Arrays.sort(a);
        System.out.println(Arrays.asList(a)); // -> [Hello, Java]
        
        // リストをソートする
        l = new ArrayList<>();
        l.add("Java");
        l.add("Hello");
        Collections.sort(l);
        System.out.println(l); // -> [Hello, Java]

        // 配列を結合する
        a[0] = "Java";
        a[1] = "Hello";
        String[] aa = {"A", "B", "C"};
        ra = new String[a.length + aa.length];
        System.arraycopy(a, 0, ra, 0, a.length);
        System.arraycopy(aa, 0, ra, a.length, aa.length);
        System.out.println(Arrays.asList(ra)); // -> [Java, Hello, A, B, C]

        a[0] = "Java";
        a[1] = "Hello";
        String[] aaa = {"A", "B", "C"};
        Stream<String> stream = Stream.concat(Arrays.stream(a), Arrays.stream(aaa));
        String[] raa = stream.toArray(String[]::new);
        System.out.println(Arrays.asList(raa)); // -> [Java, Hello, A, B, C]

        // リストを結合する
        l = new ArrayList<>();
        l.add("Java");
        l.add("Hello");
        List<String> ll = new ArrayList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        l.addAll(ll);
        System.out.println(l); // -> [Java, Hello, A, B, C]

        // Mapを結合する
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        Map<Integer, String> mm = new HashMap<>();
        mm.put(3, "A");
        mm.put(4, "B");
        mm.put(5, "C");
        m.putAll(mm);
        System.out.println(m); // -> {1=Hello, 2=Java, 3=A, 4=B, 5=C}

        // Setを結合する
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        Set<String> ss = new HashSet<>();
        ss.add("A");
        ss.add("B");
        ss.add("C");
        s.addAll(ss);
        System.out.println(s); // -> [Java, A, B, C, Hello]

        // 配列を検索する
        a[0] = "Java";
        a[1] = "Hello";
        rb = Arrays.asList(a).contains("Java");
        System.out.println(rb); // -> true

        // Listを検索する
        l = new ArrayList<>();
        l.add("Java");
        l.add("Hello");
        rn = l.indexOf("Java");
        System.out.println(rn); // -> 0

        // Mapを検索する
        m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Java");
        rb = m.containsKey(1);
        System.out.println(rb); // -> true
        rb = m.containsValue("Java");
        System.out.println(rb); // -> true

        // Setを検索する
        s = new HashSet<>();
        s.add("Hello");
        s.add("Java");
        rb = s.contains("Java");
        System.out.println(rb); // -> true










    }
}