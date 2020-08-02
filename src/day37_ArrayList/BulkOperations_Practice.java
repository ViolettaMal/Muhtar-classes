package day37_ArrayList;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        //verify that the names Ulku, Busra are contained in students list

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));
        System.out.println(r1);
        System.out.println("===========================");

        ArrayList<Integer> numbers = new ArrayList<>();

        // add: 30, 25, 40, 15, 55, 65, 75, 85, 95, 100
        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};
        numbers.addAll(Arrays.asList(nums));
        System.out.println(numbers);
        System.out.println("====================");

        ArrayList<String> group1 = new ArrayList<>();
        //add all student names in your group
        group1.addAll(Arrays.asList("Ahmet Asik", "Aigerim Kadyrbaeva", "Beyza Ozer", "Bledar Dakaj", "Edward Rojas",
                "Gelila Woldie Woldie", "guljannat", "Kamol Nizomov", "mike", "Nurshat Naibi", "Olesea Codru",
                "Omer Uslu","Ramazan Adam Sevindik", "Roman Boyko", "Said Ibrahimli", "Uladzislau Ihnatau", "Violetta Malakhovskaya", "Zulfiyya Moylamova" ));

        // verify your mentor and one of your closest friend's name are contained in the list

            boolean mentors = group1.containsAll(Arrays.asList("Bledar Dakaj", "Kamol Nizomov"));
            boolean closeFriends = group1.containsAll(Arrays.asList("@Cristina Tiscenco", "@likavlasenko"));
        System.out.println(mentors);
        System.out.println(closeFriends);




    }
}
