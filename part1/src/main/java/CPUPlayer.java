// YOUR CODE GOES HERE

import java.util.Random;

/**
 * CPUPlayer is the child class of Player
 */

public class CPUPlayer extends Player{

    /**
     * Class constructor that creates the object, the CPU monster
     * @param monster inherited from the parent class 'Player'
     */

    public CPUPlayer(Monster monster) {
        super(monster);
    }

    /**
     * This method will randomly generate an integer between 1 and 4 inclusive
     * @return int This return the integer generated
     */

    public int chooseMove() {
        Random ran = new Random();
        int move = ran.nextInt(4) + 1;
        return move;
    }

    /**
     * This method checks whether the monster has a hp lower than or equal to 0 or not
     * @return boolean This returns true if the hp is lesser than or equal to zero. Else, it returns false
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
     * This method checks whether the CPU's monster has a larger speed than the monster passed as the parameter pl
     * @param pl The enemy player's monster with which the CPU monster's speed is being compared
     * @return boolean This returns true if the CPU's monster has a faster speed than the enemy player's monster.
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

        System.out.println(monster.name + " hit for " + damage + " points of damage");
    }
}
