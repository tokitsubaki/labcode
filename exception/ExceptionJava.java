public class ExceptionJava {

    public static void main(String[] args) {
        try {
            System.out.println("before exception.");
            throwTestException();
            System.out.println("after exception.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally.");
        }
    }

    public static void throwTestException() throws Exception {
        System.out.println("before throw.");
        throw new Exception("Test Exception.");
        // System.out.println("after throw."); // -> 到達不能コードとしてコンパイルエラーとなる
    }

}