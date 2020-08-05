package day38_JavaRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,73,35,47,60,87,77,67,57,47,93,83,73,63,53, 43));
        System.out.println(list);


        ArrayList<Integer> gradeA = new ArrayList<>(); // 90-100
        gradeA.addAll(list);
        gradeA.removeIf(p -> p < 90);
        System.out.println("Grade A: " + gradeA);



        ArrayList<Integer> gradeB = new ArrayList<>(); // 80 -89
        gradeB.addAll(list);
        gradeB.removeIf( p -> p <80 || p >89);
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(); // 70 - 79
        gradeC.addAll(list);
        gradeC.removeIf(p -> p < 70 || p >79);
        System.out.println("Grade C: " + gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(p -> p < 60 || p >69);
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(p -> p > 59);
        System.out.println("Grade F: " + gradeF);

        System.out.println(gradeA.size() + " made A");
        System.out.println(gradeB.size() + " made B");
        System.out.println(gradeC.size() + " made C");
        System.out.println(gradeD.size() + " made D");
        System.out.println(gradeF.size() + " made F");





    }
}
