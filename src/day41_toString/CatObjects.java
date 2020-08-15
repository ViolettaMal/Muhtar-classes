package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setInfo("Cass", 1, 'F', "Black", "Persian");
        System.out.println(cat1);
        System.out.println("==================================");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        catPark[1].setInfo("Musa", 1, 'M', "Black", "Persian");
        catPark[2].setInfo("Jessy", 3, 'F', "Gray", "Scottish Fold");
        catPark[3].setInfo("Angel", 5, 'F', "White", "Scottish Fold");
        catPark[4].setInfo("Demon", 5, 'M', "Black", "Scottish Fold");
        catPark[5].setInfo("Alisa", 7, 'F', "Ginger", "Russian");

        for (Cat each : catPark){
            System.out.println(each);
        }
        System.out.println(Arrays.toString(catPark));
        System.out.println("========================");

        ArrayList<Cat> femaleCats = new ArrayList<>();
        ArrayList<Cat> maleCats = new ArrayList<>();

        for (Cat each : catPark){
            if (each.gender == 'F'){
                femaleCats.add(each);
            }else {
                maleCats.add(each);
            }
        }
        System.out.println("Female cats: " + femaleCats.size());
        System.out.println("Male cats: " + maleCats.size());
        System.out.println("==============================");

        System.out.println(femaleCats);
        System.out.println(maleCats);



    }
}
