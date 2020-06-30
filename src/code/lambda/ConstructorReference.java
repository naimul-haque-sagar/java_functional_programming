
package code.lambda;

interface ConstructorRef{
    Payment isPaid(String payment_status);
}

class Payment{
    Payment(String payment_status){
        System.out.println(payment_status);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        ConstructorRef constructorRef= Payment::new;
        constructorRef.isPaid("Done");
    }
}
