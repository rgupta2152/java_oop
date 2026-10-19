// Program to create insects with a weight and location value, that are able to eat and move

// Static: applies to general methods, anything that doesn't directly modify an instance of the class
// public: can be used outside this class
// private: can only be used within the current class
// instance variables: typically initialized by the constructor, vars that apply to each instance of the class
// constructor: builds each individual instance of the class, no return type, same name as class

public class InsectPersonal {
    // instance variables: private so that they can't be changed by client, simply being declared here
    private double weight;
    private int x;
    private int y;

    // constant variables
    public static final double DIST_WEIGHT_LOSS_FACTOR = 0.0001;
    private static int population = 0;
    private static String[] FACTS = {
            "bugs are cool",
            "bugs are small",
            "bugs are good for nature"
    };

    // constructor: public, since you want other classes to be able to build an insect object
    public InsectPersonal(int initWeight, int initX, int initY) {
        weight = initWeight;
        x = initX;
        y = initY;
        population++;
    }

// methods
    // eat
    public void eat(int amount) {
        System.out.println("Nibble nibble");
        weight = weight + amount;
    }

    // move
    public void move()

    // calc distance
    public static double calculateDistance(newX, newY)

    // random fact


    // main


}
