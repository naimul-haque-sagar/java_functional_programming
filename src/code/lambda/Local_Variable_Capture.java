package code.lambda;

public class Local_Variable_Capture {
    public static void main(String[] args) {
        var word="sagar";
        var num=23;

        Example example=(x)->{ System.out.println(x.length()); };
        example.printSomething(word);

        Example1 example1=(x)-> x.toUpperCase();
        System.out.println(example1.printSomething(word));

        Example2 example2=(x)-> x*2;
        System.out.println(example2.printSomething(num));
    }
}

interface Example{
    void printSomething(String value);
}

interface Example1{
    String printSomething(String value);
}

interface Example2{
    Integer printSomething(Integer value);
}