package day41_toString;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;


    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixBugs(){
        System.out.println(name + " is crying");
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

class DeveloperObject{
    public static void main(String[] args) {
        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
         developers[0].setInfo("Ahmet", 120000,"M", 36);
        developers[1].setInfo("Mamet", 100000,"M", 46);
        developers[2].setInfo("Zelhed", 110000,"M", 28);
        developers[3].setInfo("Durhet", 105000,"M", 33);
        developers[4].setInfo("Fimet", 115000,"M", 37);

        System.out.println(developers[0]);


        for (Developer each : developers){
            each.coding();
        }
        System.out.println("===============================");
        for (int i =0; i <developers.length; i++){
            developers[i].fixBugs();
        }



    }


}
