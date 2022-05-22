import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+ "I am toString()\n";
    }

    @Override
    public String getMessage() {
        return super.getMessage() +" I am getMessage()\n";
    }
}


public class ExceptionClass {
    public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    a= sc.nextInt();
    if(a<9){
        try{
            throw new MyException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        finally{        //finally is the block which is exceuted whether the exception is addressed or not...
            // Hindi mien matlab yeh h ki hamesha chelga yeh block.. kuch bhi hojaye
            System.out.println("This is the end of the program ");
        }
    }
    }
}
