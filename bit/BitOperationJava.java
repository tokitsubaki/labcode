public class BitOperationJava {

    public static void main(String[] args) {
        
        int n = 0b00001010;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));

        byte b = 0b00000110;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));

        // AND
        int result = n & b;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        // OR
        result = n | b;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        // XOR
        result = n ^ b;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        // NOT
        result = ~n;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        // 左シフト
        result = n << 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        // 右シフト(符号あり)
        result = n >> 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        byte b2 = -0b00000110;
        System.out.println(b2);
        result = b2 >> 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        // 右シフト(符号なし)
        result = n >>> 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));

        result = b2 >>> 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));
    }
}