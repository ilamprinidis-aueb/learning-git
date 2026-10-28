public class Car {
    private static int nextCarID;
    private int id;
    private double maxSpeed;
    private String name;

    static {
        nextCarID = 0;
    }

    {
        id = nextCarID++;
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
        return id + " " + name + " " + maxSpeed;
    }

    public static void main(String[] args) {
        Car[] car = new Car[5];
        car[0] = new Car();
        car[1] = new Car("mitsos", 314);
        car[2] = new Car("babis", 512.2);

        for(int i = 0; i < 3; i++) {
            System.out.println(car[i].toString());
        }
    } 
}

