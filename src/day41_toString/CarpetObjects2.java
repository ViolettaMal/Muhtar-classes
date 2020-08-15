package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(4.5,3.5,17.5,false);
        carpets[1].customOrder(5.5,3.5,18.5,true);
        carpets[2].customOrder(4.5,5.5,19.5,false);
        carpets[3].customOrder(3.5,4.5,20.5,true);
        carpets[4].customOrder(6.5,5.5,21.5,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));

        persianCarpets.removeIf(p -> p.isPersian == false);

        System.out.println("Number of persian carpets: " + persianCarpets.size());

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));

       // regularCarpets.removeIf(p -> p.isPersian);
        regularCarpets.removeAll(persianCarpets);

        System.out.println("Number of regular carpets: " + regularCarpets.size());









    }








}
