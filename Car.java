import java.util.Random;

public class Car {
    private static int nextCarID;
    private int id;
    private double maxSpeed;
    private String name;

    public static enum Colors {
        GREEN,
        BLUE,
        BLACK,
        WHITE
    }

    private Colors color;

    static {
        nextCarID = 0;
    }

    {
        id = nextCarID++;
        Random random = new Random();
        int c = random.nextInt(5);
        switch (c) {
            case 0:
                color = Colors.GREEN;
                break;
            case 1:
                color = Colors.BLUE;
                break;
            case 2:
                color = Colors.BLACK;
                break;
            case 3:
                color = Colors. WHITE;
                break;
            default:
                color = null;
                break;
        }
    }

    public Car() {
        name = "Not Identified";
        maxSpeed = -1;
    }

    public Car(double maxSpeed) {
        name = "Not Identified";
        this.maxSpeed = maxSpeed;
    }

    public Car(String name) {
        this.name = name;
        maxSpeed = -1;
    }

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + color + " " + maxSpeed + " km/h ";
    }

    public static void main(String[] args) {
        Car[] car = new Car[5];
        car[0] = new Car();
        car[1] = new Car("mitsos", 314);
        car[2] = new Car("babis", 512.2);
        car[3] = new Car("lol", 314.15);

        for(int i = 0; i < 4; i++) {
            System.out.println(car[i].toString());
        }
    } 
}

