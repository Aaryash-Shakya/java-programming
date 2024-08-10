class BoxCons {
    public int width;
    public int height;
    public int depth;

    BoxCons() {
        width = 0;
        height = 0;
        depth = 0;
    }

    BoxCons(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    int volume() {
        return width * height * depth;
    }
}

public class ConstructorOverLoad {
    public static void main(String[] args) {
        BoxCons box1 = new BoxCons();
        box1.width = 10;
        box1.height = 20;
        box1.depth = 30;
        BoxCons box2 = new BoxCons(5, 10, 15);
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
    }
}