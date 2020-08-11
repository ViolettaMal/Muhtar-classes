package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Tesla", "Infinity", "Tesla", "WV", "Lamborghini", "Lexus", "Infinity", "Mazda"));
        //                          0       1            2          3       4        5             6
        System.out.println(cars);


      /*  // remove method:
        // remove by using index
        cars.remove(2);
        System.out.println(cars);

        // or remove  by using object
        cars.remove("Tesla");
        System.out.println(cars);

        // or remove all

        cars.removeAll(Arrays.asList("Infinity")); // case sensitive
        System.out.println(cars);

        // removeIf
        System.out.println("===============");
        cars.removeIf(p -> p.toLowerCase().contains("m"));
        System.out.println(cars); */

        cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);
        System.out.println("===================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "PaperTowels", "Mango", "Orange", "Avocado", "Dragon Fruit"));
        System.out.println(groceryList);
        // pepsi
        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(r1);

        System.out.println(groceryList.containsAll(Arrays.asList("Eggs", "Orange", "Milk")));

        // set the dragon fruit to apple

        groceryList.set(groceryList.size() - 1, "Apple");
        System.out.println(groceryList);

        groceryList.set(groceryList.indexOf("PaperTowels"), "Dish Washer");
        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);


    }

}
