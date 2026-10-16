public class InsectClient {
    public static void main(String[] args) {
        System.out.println(Insect.produceRandomFact()); //call the random fact method from the Insect class
            // Create new insect object/instance
            Insect bug1 = new Insect(5, 10, 15);
        System.out.printf("Bug 1 weight: %.2f \n", bug1.getWeight());
        System.out.printf("Bug 1 x: %d \n", bug1.getX());
        System.out.printf("Bug 1 y: %d \n", bug1.getY());

        System.out.printf("Current Insect population: %d\n", Insect.getPopulation());

        System.out.printf("Bug 1 current x value: %d\n", bug1.getX());
        System.out.println("Atempt to set x to a negative value:\n");
        bug1.setX(-10);
        System.out.printf("Bug 1 current x value: %d\n", bug1.getX());
        System.out.println("Attempt to set x to an acceptable positive value:\n");
        bug1.setX(25);
        System.out.printf("Bug 1 current x value: %d\n", bug1.getX());

    }
}

