package day41_toString;

public class Tester {
    String name;
    double salary;
    String gender;
    int age;


    public void testing(){
        System.out.println(name + " is testing");
    }
    public void findBug(){
        System.out.println(name + " found bug");
    }
    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }
    public String toString(){
        return "Name: " + name + ", Gender: " + gender + ", Age: "+ age + ", Salary: " + salary;
    }
}

class TestersObject{
    public static void main(String[] args) {
        Tester [] testers = {new Tester(),new Tester(),new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Ahmet", 120000,"M", 36);
        testers[1].setInfo("Mamet", 100000,"M", 46);
        testers[2].setInfo("Zelhed", 110000,"M", 28);
        testers[3].setInfo("Durhet", 105000,"M", 33);
        testers[4].setInfo("Fimet", 115000,"M", 37);

       for (Tester each : testers){
           System.out.println(each.toString());
       }

        for (Tester each : testers){
            each.testing();
        }
        System.out.println("===============================");
        for (int i =0; i <testers.length; i++){
            testers[i].findBug();
        }



    }


}
