public class HandleError {
    public static void main(String[] args) {
        int a = 0;
        int b = 22;
        try {
            int c = b / a;
            System.out.println("c = "+c);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}
