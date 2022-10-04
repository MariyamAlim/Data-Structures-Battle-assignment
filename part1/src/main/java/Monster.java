// YOUR CODE GOES HERE

/**
 * This class initializes the instance variables name, type, hp, speed, attack, defense, move1, move2, move3 and move4
 * of the monster using the Monster constructor. It also contains getters for every instance variable.
 */

public class Monster{

    public String name, type;
    public int hp, speed, attack, defense;
    public Move move1, move2, move3, move4;

    public Monster(String name, String type, int hp, int speed, int attack, int defense,
                   Move move1, Move move2, Move move3, Move move4) {

        this.name = name;
        this.type = type;
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public Move getMove1() {
        return move1;
    }

    public Move getMove2() {
        return move2;
    }

    public Move getMove3() {
        return move3;
    }

    public Move getMove4() {
        return move4;
    }
}
