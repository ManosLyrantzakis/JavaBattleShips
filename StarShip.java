public class StarShip {
    private String name;
    private int speed;
    private int firePower;

    public StarShip(String name, int speed, int firePower) {
        this.name = name;
        this.speed = speed;
        this.firePower = firePower;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFirePower() {
        return firePower;
    }

    public void printShipDetails() {
        System.out.println("The name of this ship is: " + name);
        System.out.println("Its speed is: " + speed);
        System.out.println("And its firepower is: " + firePower);
    }
}

