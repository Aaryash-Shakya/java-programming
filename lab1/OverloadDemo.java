public class OverloadDemo {
    public static void sum(int a) {
        System.out.println(a + a);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sum(3);
        sum(9, 2);
        sum(3.2, 6.8);
    }
}
