package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setInfo("Cass", 1, 'F', "Black", "Persian");


        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        catPark[1].setInfo("Musa", 1, 'M', "Black", "Persian");
        catPark[2].setInfo("Jessy", 3, 'F', "Gray", "Scottish Fold");
        catPark[3].setInfo("Angel", 5, 'F', "White", "Scottish Fold");
        catPark[4].setInfo("Demon", 5, 'M', "Black", "Scottish Fold");
        catPark[5].setInfo("Alisa", 7, 'F', "Ginger", "Russian");

        ArrayList<Cat> femaleCats = new ArrayList<>();
        ArrayList<Cat> maleCats = new ArrayList<>();

        femaleCats.addAll(Arrays.asList(catPark));
        femaleCats.removeIf(p -> p.gender == 'M');

        maleCats.addAll(Arrays.asList(catPark));
        maleCats.removeAll(femaleCats);
        System.out.println(maleCats);
        System.out.println(femaleCats);











    }
}
