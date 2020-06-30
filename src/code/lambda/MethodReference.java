
package code.lambda;

interface Vehicle{
    void car();
}

public class MethodReference {
    public static void property(){
        System.out.println("I have a car");    
    }
    
    static Vehicle vehicle= MethodReference::property;
    
    public static void main(String[] args) {
        vehicle.car();
    }
}

