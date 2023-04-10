public class AbsJava {
    public static void main(String[] args) {
        
        // int型
        int i1 = 2;
        int i2 = -2;
        System.out.println(Math.abs(i1));
        System.out.println(Math.abs(i2));

        int i3 = 0;
        int i4 = -0;
        System.out.println(Math.abs(i3));
        System.out.println(Math.abs(i4));

        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        System.out.println(Math.abs(i5));
        System.out.println(Math.abs(i6));

        // float型
        float f1 = 1.23f;
        float f2 = -1.23f;
        System.out.println(Math.abs(f1));
        System.out.println(Math.abs(f2));

        float f3 = 0.0f;
        float f4 = -0.0f;
        System.out.println(Math.abs(f3));
        System.out.println(Math.abs(f4));

        float f5 = Float.MAX_VALUE;
        float f6 = Float.MIN_VALUE;
        System.out.println(Math.abs(f5));
        System.out.println(Math.abs(f6));

        float f7 = Float.POSITIVE_INFINITY;
        float f8 = Float.NEGATIVE_INFINITY;
        float f9 = Float.NaN;
        System.out.println(Math.abs(f7));
        System.out.println(Math.abs(f8));
        System.out.println(Math.abs(f9));


        // double型
        double d1 = 1.23;
        double d2 = -1.23;
        System.out.println(Math.abs(d1));
        System.out.println(Math.abs(d2));

        double d3 = 0.0;
        double d4 = -0.0;
        System.out.println(Math.abs(d3));
        System.out.println(Math.abs(d4));

        double d5 = Double.MAX_VALUE;
        double d6 = Double.MIN_VALUE;
        System.out.println(Math.abs(d5));
        System.out.println(Math.abs(d6));

        double d7 = Double.POSITIVE_INFINITY;
        double d8 = Double.NEGATIVE_INFINITY;
        double d9 = Double.NaN;
        System.out.println(Math.abs(d7));
        System.out.println(Math.abs(d8));
        System.out.println(Math.abs(d9));


        // long型
        long l1 = 2L;
        long l2 = -2L;
        System.out.println(Math.abs(l1));
        System.out.println(Math.abs(l2));

        long l3 = 0L;
        long l4 = -0L;
        System.out.println(Math.abs(l3));
        System.out.println(Math.abs(l4));

        long l5 = Long.MAX_VALUE;
        long l6 = Long.MIN_VALUE;
        System.out.println(Math.abs(l5));
        System.out.println(Math.abs(l6));

    }
}