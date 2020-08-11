package day38_JavaRecap;


import java.util.*;

class Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int days = 0;
        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));

        do {

            if (inhabitants[0] !=0 && inhabitants[1]==0){
                inhabitants[0] /=2;
            }

            for (int i = 1; i < inhabitants.length; i++) {

                if (inhabitants[i] !=0){
                    if (inhabitants[i-1] ==0 || inhabitants[i+1]==0){
                        inhabitants[i] /=2;
                    }
                }
            }

            days++;
            System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
        } while (!(inhabitants[0]==0 && inhabitants[1] ==0 && inhabitants[2] ==0 && inhabitants[3] == 0 && inhabitants[4] ==0
                && inhabitants[5] ==0 && inhabitants[6] ==0 && inhabitants[7] ==0));

        System.out.println("---- EXTINCT ----");
    }
}

