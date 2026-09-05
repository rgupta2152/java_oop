public class StringOperations {

    // Create the main method
    public static void main(String[] args) {
        // Assign string var my name
        String name1 = "Rohan";
        System.out.println(name1);

        // Replace the first and last letters of my name
        name1 = name1.replace('R', 'A');
        name1 = name1.replace('n', 'Z');
        System.out.println(name1);

        // Create web address var
        String web1 = "www.gatech.edu";
        System.out.println(web1);

        // Concat 1331 to end of web name
        String web2 = web1.substring(4, 10);
        System.out.println(web2 + 1331);
    }
}
