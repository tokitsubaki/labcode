public class LambdaJava {
    public static void main(String[] args) {

        // 従来の実装方法（ローカルクラス）
        class CalcImpl implements Calc {
            public int add(int a, int b) {
                return a + b;
            }
        }
        Calc c = new CalcImpl();
        System.out.println(c.add(1, 2));

        // 従来の実装方法（匿名クラス）
        Calc c2 = new Calc() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c2.add(1, 2));

        // ラムダ式による実装
        Calc c3 = (a, b) -> a + b;
        System.out.println(c3.add(1, 2));

        int result = 0;
        Calc c4 = (a, b) -> {
            // result = a + b;
            return result;
        };

        final int[] results = {0};
        System.out.println(results[0]);

        Calc c5 = (a, b) -> {
            results[0] = a + b;
            return results[0];
        };
        c5.add(1, 2);
        System.out.println(results[0]);

        Calc c6 = (int a, int b) -> a + b;
        Integer inta = 1;
        Integer intb = 2;
        System.out.println(c6.add(inta, intb));

    }

    @FunctionalInterface
    interface Calc {
        int add(int a, int b);
    }
}