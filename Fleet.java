import java.util.Random;

public class Fleet {
    private static final int MAX_RESOURCES = 30;
    private static final int MAX_NUMBER_OF_BATTLEGROUPS = 3;
    private static Random random = new Random();

    private String name;
    private BattleGroup groups[];

    public Fleet(String name) {
        this.name = name;
        createBattleGroups();
    }

    private void createBattleGroups() {
        groups = new BattleGroup[random.nextInt(MAX_NUMBER_OF_BATTLEGROUPS) + 1];

        for (int i = 0; i < groups.length; i++)
            groups[i] = new BattleGroup(name + "-" + i, MAX_RESOURCES / groups.length);
    }

    public void printFleetDetails() {
        System.out.println("\n***************************************************\n");
        System.out.println("The name of this Fleet is:\t" + name + "\t and it consists of the following Battlegroups:");
        for (int i = 0; i < groups.length; i++)
            groups[i].printGroupDetails();
        System.out.println("\n***************************************************\n");
    }
}


