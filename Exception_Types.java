import java.util.Scanner;

public class Exception_Types {
    public static void main(String[] args) {
       int [] marks = new int[3];
       marks[0]=92;
       marks[1]=97;
       marks[2]=95;

        Scanner sc=  new Scanner(System.in);
        System.out.println("ENter the array index ");
        int ind = sc.nextInt();

        System.out.println("ENter the number you want to divide ");
        int number = sc.nextInt();

         try{
             System.out.println("VAlue at array index entered is " +marks[ind]);
             System.out.println("The value of ind/number is " +marks[ind]/number);
         }

         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("ArrayIndexOutOfBoundsException occured");
             System.out.println(e);

         }

         catch(ArithmeticException e){
             System.out.println("ArithematicException exception occured");
             System.out.println(e);}


         catch(Exception e){
             System.out.println("Some exception occured");
             System.out.println(e);}







    }
}
