
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
}



public class Lambda_Expression {
    public static void main(String[] args) {
    DemoAno obj = (a)->{
        System.out.println("I'm method 1 from lambda function "+a);
    };
    obj.meth1(6);
    }
}
