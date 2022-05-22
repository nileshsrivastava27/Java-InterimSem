abstract class Parent {
    public Parent(){
        System.out.println("Hello good morning mai parent ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    }

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}

abstract class Child2 extends Parent{
    public void the(){
        System.out.println("Hello");
    }
}

public class Absract {
    public static void main(String[] args) {

    }
}
