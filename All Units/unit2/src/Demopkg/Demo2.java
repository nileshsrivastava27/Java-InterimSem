package Demopkg;
import intabspkg.LambdaInt;
public class Demo2 {
    public static void main(String args[]){

        LambdaInt i = ()->System.out.println("EVERYTHING'S FINE");
        i.sayHello();
        LambdaInt li = ()->
        {
            String name = "JAVA: INTELLIJ";
            System.out.println(name);
        };
        li.sayHello();
    }
}
