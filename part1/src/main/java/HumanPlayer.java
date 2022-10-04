// YOUR CODE GOES HERE

import java.util.Random;
import java.util.Scanner;

/**
 * HumanPlayer is a child class of Player
 */

public class HumanPlayer extends Player{

    /**
     * Class constructor that creates the object, the CPU monster
     * @param monster inherited from the parent class 'Player'
     */

    public HumanPlayer(Monster monster) {
        super(monster);
    }

    /**
     * This method will list all the possible moves for the player's monster and prompts the user to choose a move.
     * @return int This return the move number chosen by the player
     */

    public int chooseMove() {

        System.out.println("1. " + monster.move1.powName);
        System.out.println("2. " + monster.move2.powName);
        System.out.println("3. " + monster.move3.powName);
        System.out.println("4. " + monster.move4.powName);

        Scanner userInput = new Scanner(System.in);
        System.out.print("Which move? ");
        int move = userInput.nextInt();

        return move;
    }

    /**
     * This method checks whether the monster has a hp lower than or equal to 0 or not
     * @return boolean This returns true if the monster's hp is lesser than or equal to zero. Else, it returns false
     */

    public boolean hasLost() {
        if(monster.hp <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method checks whether the player's monster's speed is larger than the monster passed as the parameter pl
     * @param pl The enemy monster with which the player's monster's speed is being compared to
     * @return boolean This returns true if the player's monster has a larger speed than the enemy player's monster.
     * Else, it returns false
     */

    public boolean isFasterThan(Player pl) {
        if (monster.speed > pl.getMonster().speed) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method stores the accuracy and power of the move chosen in the variables moveAccuracy and moveNum.
     * It then generates a random float number between 0 and 1 and compares the value of the float with the
     * accuracy of the move chosen. If the float is larger than the move's accuracy, then the move is a miss and
     * 0 damage is done to the enemy monster. If the float is smaller than  the accuracy, then the move is not a
     * miss and the damage is calculated. The damage is calculated by subtracting the enemy monster's defense stat
     * from the sum of the CPU's monster attack stat and the chosen move's power. The damage done to enemy monster
     * is subtracted from the hp of the enemy monster and the enemy monster's hp is updated.
     * @param pl The enemy monster attacking the CPU player
     * @param moveNum The move number generated for the CPU player
     */

    public void attack(Player pl, int moveNum) {

        int movePower;
        float moveAccuracy;

        if(moveNum == 1) {
            movePower = monster.move1.power;
            moveAccuracy = monster.move1.accuracy;
            System.out.println(monster.name + " uses " + monster.move1.powName);
        }
        else if (moveNum == 2) {
            movePower = monster.move2.power;
            moveAccuracy = monster.move2.accuracy;
            System.out.println(monster.name + " uses " + monster.move2.powName);
        }
        else if (moveNum == 3) {
            movePower = monster.move3.power;
            moveAccuracy = monster.move3.accuracy;
            System.out.println(monster.name + " uses " + monster.move3.powName);
        }
        else {
            movePower = monster.move4.power;
            moveAccuracy = monster.move4.accuracy;
            System.out.println(monster.name + " uses " + monster.move4.powName);
        }

        int damage;

        Random rand = new Random();
        float f = rand.nextFloat();

        if(f > moveAccuracy) {
            damage = 0;
        }
        else {
            damage = monster.attack + movePower - pl.getMonster().defense;
            pl.getMonster().hp = pl.getMonster().hp - damage;
        }

        System.out.println(getMonster().getName() + " hit for " + damage + " points of damage");


    }
}
