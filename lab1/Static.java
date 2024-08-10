class StaticDemo {
    static int a;

    static void display() {
        System.out.println("a = " + a);
    }
}

public class Static {
    public static void main(String[] args) {
        StaticDemo.a = 42;
        StaticDemo.display();
    }
}
