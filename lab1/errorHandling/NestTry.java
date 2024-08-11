public class NestTry {
    public static void main(String[] args) {
        int a = 0;
        int b = 22;
        int[] z = { 1, 2 };
        try {
            try {
                int c = b / a;
                System.out.println("c = " + c);
            } catch (ArithmeticException e) {
                System.out.println("Divide by 0: " + e);
            }
            System.out.println("z[5]" + z[5]);
        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
