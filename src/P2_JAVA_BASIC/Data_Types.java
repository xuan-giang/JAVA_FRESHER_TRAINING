package P2_JAVA_BASIC;

public class Data_Types {
    /*
    - Kiểu dữ liệu nguyên thuỷ (Primitive): byte, short, int, long, double, float, String
    - Kiểu dữ liệu tham chiếu (Reference): array, class, interface
     */

    public void testDataTypes()
    {
        System.out.println("Min của Int = " + Integer.MIN_VALUE);
        System.out.println("Max của Int = " + Integer.MAX_VALUE);
        System.out.println("Min của Long = " + Long.MIN_VALUE);
        System.out.println("Max của Long = " + Long.MAX_VALUE);
        System.out.println("Min của Double = " + Double.MIN_VALUE);
        System.out.println("Max của Double = " + Double.MAX_VALUE);
    }

    public void testTypeCasting()
    {
        // Widening
        int a = 1;
        int b = 2;
        double x = (double)a/b;
        System.out.println("x = " + x);

        // Narrowwing
        int y = (int)1.0/2;
        System.out.println("y = "+ y);
    }


}
