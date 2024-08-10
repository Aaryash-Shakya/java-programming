class Box {
    public int width;
    public int height;
    public int depth;

    int volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width = 10;
        box1.height = 20;
        box1.depth = 30;
        System.out.println("Volume of box1: " + box1.volume());
    }
}