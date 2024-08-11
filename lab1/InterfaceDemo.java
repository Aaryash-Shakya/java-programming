interface A {
    void print();
}
interface B {
    void sum();
}

class InterfaceClass implements A, B {
    public void print() {
        System.out.println("Hello, World!");
    }
    public void sum() {
        System.out.println(5 + 6);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceClass obj = new InterfaceClass();
        obj.print();
        obj.sum();
    }
}