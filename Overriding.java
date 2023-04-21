package wiley_java_core;

class A {
    void show()
    {
        System.out.println("A");
    }
}
 
class B extends A {

    void show()
    {
        System.out.println("B");
    }
}
public class Overriding {
    public static void main(String[] args) {
    
        A obj1 = new A();
        obj1.show();
 
        A obj2 = new B();
        obj2.show();
    }
}

