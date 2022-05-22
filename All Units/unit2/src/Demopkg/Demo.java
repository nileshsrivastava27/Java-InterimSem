package Demopkg;
import strpkg.StringMethods;
import intabspkg.StringInterface;
import intabspkg.StrAbsMethods;

public class Demo {
    public static void main(String args[]){
        StringMethods sm = new StringMethods("Nilesh","Srivastava");
        System.out.println(sm.fullName());
    }
}
