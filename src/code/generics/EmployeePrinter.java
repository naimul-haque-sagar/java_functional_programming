
package code.generics;

public class EmployeePrinter<String> {
    void printEmployee(String[] s){
        for(String x:s){
            System.out.println(x);
        }
    }
}
class Result{
    public static void main(String[] args) {
        String[] list=new String[4];
        list[0]="sagar";
        list[1]="sourab";
        list[2]="navin";
        list[3]="nahid";
        
        EmployeePrinter ep=new EmployeePrinter();
        ep.printEmployee(list);
    }
}
