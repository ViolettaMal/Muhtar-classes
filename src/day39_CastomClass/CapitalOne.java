package day39_CastomClass;

import java.util.*;


public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setEmployeeInfo("Roman", 'M', 124559871, "QA", 100000);
        employee2.setEmployeeInfo("Veronica", 'F', 134669881, "QA", 105000);
        employee3.setEmployeeInfo("Edgar", 'M', 434555800, "Developer", 150000);
        employee4.setEmployeeInfo("Violetta", 'F', 1240098111, "Developer", 160000);
        employee5.setEmployeeInfo("Cristina", 'F', 1245577716, "Lead QA", 130000);


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3,employee4,employee5 ));

        double max = Integer.MIN_VALUE;
        String name = "";
        for (Employee each : employeeList){
            double eachSalary = each.salary;

            if (eachSalary>max){
                max = eachSalary;
                name = each.name;
            }
        }
        System.out.println("Maximum salary: " + max);
        System.out.println("Name: " + name);
        System.out.println("==========================");

        //employeeList.removeIf(p -> p.salary < 150000);
       // employeeList.removeIf(p -> p.jobTitle.equals("QA"));
        employeeList.removeIf(p -> p.name.toLowerCase().contains("m"));
        for (Employee each : employeeList){
           // each.getEmployeeInfo();
            System.out.println(each.name + ": $" + each.salary);
        }


     /*   employee1.getEmployeeInfo();
        employee2.getEmployeeInfo();
        employee3.getEmployeeInfo();
        employee4.getEmployeeInfo();
        employee5.getEmployeeInfo();*/




    }
}
