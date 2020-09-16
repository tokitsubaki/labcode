public class ControlJava {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        if ( a < b ) {
            System.out.println("a より b の方が大きい");
        } else if ( a > b ) {
            System.out.println("b より a の方が大きい");
        } else {
            System.out.println("a と b は同一");
        }


        System.out.println("------------------------------------------");


        String s = "Java";
        switch (s) {
            case "Java":
                System.out.println(s); // 標準出力に「Java」と表示される
                break;
            case "Ruby":
                System.out.println(s); // 標準出力に「Ruby」と表示される
                break;
            default:
                System.out.println(s); // 標準出力に「Java」「Ruby」でない変数aに入っている文字列が表示される
        }


        System.out.println("------------------------------------------");


        int num = 0;
        while (num < 10) {
            System.out.println(num);
            num++;
        }


        System.out.println("------------------------------------------");


        num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num < 10);


        System.out.println("------------------------------------------");


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        System.out.println("------------------------------------------");


        String[] arr = {"Java", "Ruby", "Go"};
        for (String str : arr) {
            System.out.println(str); // 「Java」、「Ruby」、「Go」が表示される
        }

    }
}
