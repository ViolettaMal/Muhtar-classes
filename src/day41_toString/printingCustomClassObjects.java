package day41_toString;

public class printingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("Cybertek");
        System.out.println(str.toString()); // object name
        System.out.println(new String("School").toString()); // object
        // we can give toString or not cuz it called internally (automatically)

        System.out.println(str); // object name
        System.out.println(new String("School"));
        // instance method does not have static
        System.out.println("=================================");

        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19,true);
        System.out.println(c1.toString());






    }
}
