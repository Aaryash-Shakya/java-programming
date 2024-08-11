public class ThrowDemo {
    static void errorFunction() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("In errorFunction: " + e);
            throw e; // rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            errorFunction();
        } catch (NullPointerException e) {
            System.out.println("In main: " + e);
        }
    }
}
