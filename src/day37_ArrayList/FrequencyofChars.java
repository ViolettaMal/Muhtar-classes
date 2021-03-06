package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyofChars {
    public static void main(String[] args) {
        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();

        /*for (String each : str.split("")){
            list.add(each);
        }*/
        list.addAll(Arrays.asList(str.split("")));

        String nonDup = Util.removeDup(str); // to avoid duplication
        for (String each : nonDup.split("")){
            int count = Collections.frequency(list,each);
            System.out.print(each + count);
        }

    }
}
