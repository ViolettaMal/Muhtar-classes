package day41_toString;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
         Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(4.5,3.5,17.5,false);
        carpets[1].customOrder(5.5,3.5,18.5,true);
        carpets[2].customOrder(4.5,5.5,19.5,false);
        carpets[3].customOrder(3.5,4.5,20.5,true);
        carpets[4].customOrder(6.5,5.5,21.5,true);


        /*for (Carpet each : carpets){
             each.getCarpetInfo();
         }*/
        ArrayList<Carpet> listPersian = new ArrayList<>();
        ArrayList<Carpet> listNonPersian = new ArrayList<>();

       /* for (int i = 0; i <= carpets.length-1; i++){
            if (carpets[i].isPersian == true){
                listPersian.add(carpets[i]);
            }else {
                listNonPersian.add(carpets[i]);
            }
        }*/
        for (Carpet each : carpets){
            if (each.isPersian){
                listPersian.add(each);
            }else {
                listNonPersian.add(each);
            }
        }

        System.out.println("Number of persian carpets: " + listPersian.size());
        System.out.println("Number of regular carpets: " + listNonPersian.size());





    }
}
