class Person {
    String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class AccessDemo {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        // p.age = 30; // This will cause an error
        p.setAge(30);
        p.display();
    }
}
