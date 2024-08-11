class WeightBox {
    int width;
    int height;
    int depth;
    int weight;

    // This is the constructor for Box.
    WeightBox() {
    }

    WeightBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    int volume() {
        return width * height * depth;
    }
}

public class RefDemo {
    public static void main(String[] args) {
        WeightBox weightBox = new WeightBox(3, 5, 7, 10);
        WeightBox plainBox = new WeightBox();
        double vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        // assign WeightBox reference to Box reference
        plainBox = weightBox;
        System.out.println("Volume of plainBox is " + plainBox.volume());
        System.out.println("Weight of plainBox is " + plainBox.weight);
    }
}
