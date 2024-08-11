public class FinallyDemo {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new Exception("No arguments provided");
            }
            System.out.println("Argument: " + args[0]);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
