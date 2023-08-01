package CreationalDP.PrototypeDP;

public class PrototypeDemo {
    public static void main(String[] args) {

        // Create a soldier, that is ready to fight.
        Soldier soldier1 = new Soldier(100, 50, 25, 70, 60, 1, "Sword", true);
        soldier1.showSoldierStats();

        System.out.println("\n*****************\n");

        // Create a soldier, that is not ready to fight.
        Soldier soldier2 = new Soldier(100, 50, 20, 50, 15, 2, "Sword", false);
        soldier2.showSoldierStats();

        System.out.println("\n*****************\n");

        // Create a soldier, that is not ready to fight. (With cloning)
        Soldier soldier3 = soldier1.clone();
        soldier3.setReadyForBattle(false);
        soldier3.showSoldierStats();


    }
}