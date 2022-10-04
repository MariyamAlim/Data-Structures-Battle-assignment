// YOUR CODE GOES HERE

/**
 * Player is an abstract class that contains all the constructors / methods that will be inherited by the
 * CPUPlayer and HumanPlayer classes. It also contains the getter for monster variable.
 */
public abstract class Player {

    public Monster monster;

    public Player(Monster monster){
        this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public abstract int chooseMove();

    public abstract boolean hasLost();

    public abstract boolean isFasterThan(Player pl);

    public abstract void attack(Player pl, int moveNum);
}
