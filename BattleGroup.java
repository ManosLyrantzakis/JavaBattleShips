import java.util.Random;

public class BattleGroup {
    private static final int TOP_SPEED = 100;
    private static final int MAX_FIREPOWER = 1000;
    private static final int MAX_NUMBER_OF_STARSHIPS = 10;
    private static int numOfBattleGroups = 0;
    private static Random random = new Random();

    private String name;
    private StarShip sheeps[];
    private int speed;
    private int firePower;

    public BattleGroup(String name, int resources) {
        this.name = name;
        int numOfShips = resources / (random.nextInt(MAX_NUMBER_OF_STARSHIPS) + 1);
        sheeps = new StarShip[numOfShips];

        for (int i = 0; i < numOfShips; i++) {
            sheeps[i] = new StarShip(name + "-" + i, random.nextInt(TOP_SPEED), random.nextInt(MAX_FIREPOWER));
        }

        // Calculate average speed and total firepower
        int totalSpeed = 0;
        int totalFirePower = 0;
        for (StarShip ship : sheeps) {
            totalSpeed += ship.getSpeed();
            totalFirePower += ship.getFirePower();
        }
        speed = totalSpeed / numOfShips;
        firePower = totalFirePower;
    }

    public void printGroupDetails() {
        System.out.println("BattleGroup: " + name);
        System.out.println("Average Speed: " + speed);
        System.out.println("Total Firepower: " + firePower);
    }
}



