package code.generics;

public class Generics_Example3<T,U> {
    T obj1;
    U obj2;

    public Generics_Example3(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void printObj(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class ObjCreator{
    public static void main(String[] args) {
        Generics_Example3<String,Integer> generics_example3=new Generics_Example3<>("sagar",24);
        generics_example3.printObj();
    }
}
