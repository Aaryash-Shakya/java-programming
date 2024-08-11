// A Simple demonstration of abstract.
abstract class AbstractA {
    abstract void callMe();
    // concrete methods are still allowed in abstract classes
    void callMeToo() {
        System.out.println("This is a concrete method.");
    }
}
class AbstractB extends AbstractA {
    void callMe() {
        System.out.println("B's implementation of callMe.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        AbstractB b = new AbstractB();
        b.callMe();
        b.callMeToo();
    }
}