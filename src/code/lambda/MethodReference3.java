
package code.lambda;

interface Reference{
    public String referMe();
}

public class MethodReference3 {
    String refer(){
        return ("i am refering a method ");
    }
}

class MethodReferenceTry {
    public static void main(String[] args) {
        MethodReference3 methodReference3=new MethodReference3();
        
        Reference reference= methodReference3::refer;
        Reference reference1= new MethodReference3()::refer;
        
        System.out.println(reference.referMe());
        System.out.println(reference1.referMe());
    }
}


