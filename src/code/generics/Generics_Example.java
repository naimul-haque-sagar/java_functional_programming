package code.generics;

class Employee<String> {
    void printEmployee(String[] s){
        for(String x:s){
            System.out.println(x);
        }
    }
}

public class Generics_Example {
    public static void main(String[] args) {
        String[] list=new String[4];
        list[0]="sagar";
        list[1]="sourab";
        list[2]="navin";
        list[3]="nahid";

        Employee ep=new Employee();
        ep.printEmployee(list);
    }
}
