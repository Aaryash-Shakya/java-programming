interface A {
    void print();
}
interface B {
    void sum(int a, int b);
}

class InterfaceClass implements A, B {
    public void print() {
        System.out.println("Hello, World!");
    }
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceClass obj = new InterfaceClass();
        obj.print();
        obj.sum(4,5);
    }
}