public class Insect {

    // instance variables
    private double weight;
    private int x;
    private int y;

    // declare constants
        // at the class level: public means constant can be accessed by other classes
            // ie. call constant using Insect.DIST_WEIGHT_LOSS_FACTOR;
        // private at the class level means it cannot be accessed or modified by methods outside this class
    public static final double DIST_WEIGHT_LOSS_FACTOR = 0.0001;
    private static int population = 0;
    private static final String[] FACTS = {
            "Fact 1",
            "Fact 2",
            "Fact 3",
            "Fact 4"};

    // constructor
        // public: we want other classes to be able to constructor insect instances
        // no return type for constructors
    public Insect(double initWeight, int initX, int initY) {
        weight = initWeight;
        x = initX;
        y = initY;
        population++;
    }

    // public so that insect instances can use it
    public void eat(double amount) {
        System.out.println("nibble nibble");
        weight = weight + amount;
    }

    // public so that insect instances can use it
    public void move (int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        } else {
            System.out.println("Staying put");
        }
    }

    // helper method
    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String produceRandomFact() {
        int index = (int) (Math.random() * (FACTS.length - 1) + 1);
        return FACTS[index];
    }

    public static void main(String[] args) {
        System.out.println("Insect population: " + population);
        Insect bug1 = new Insect(5, 10, 20);
        System.out.println("Insect population: " + population);
        Insect bug2 = new Insect(10, 5, 15);
        System.out.println("Insect population: " + population);

        bug1.move(10, 20);
        bug2.move(10, 20);

        System.out.println(produceRandomFact());
    }

}
