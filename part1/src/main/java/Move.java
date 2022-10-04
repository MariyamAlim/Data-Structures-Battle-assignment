// YOUR CODE GOES HERE

/**
 * This class initializes the instance variables powName, powType, power and accuracy of a given move using the
 * Move constructor. It also contains getters for every instance variables.
 */

public class Move {

    public String powName, powType;
    public int power;
    public float accuracy;

    public Move(String powName, String powType, int power, float accuracy) {
        this.powName = powName;
        this.powType = powType;
        this.power = power;
        this.accuracy = accuracy;
    }

    public String getPowName() {
        return powName;
    }

    public String getPowType() {
        return powType;
    }

    public int getPower() {
        return power;
    }

    public float getAccuracy() {
        return accuracy;
    }
}
