public class VarArgs {
    static int sum(int ...arr){
        //available as itn [] arr
        int result =0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    static int sum1(int x, int ...arr){         //just a copy to demonstrate the difference between the functions
        // the argument in the first place is the compulsory argument without it can't be compiled
        //available as itn [] arr
        int result =0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial");
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 2, 3, and 4 is : "+ sum(2,3,4));
        System.out.println("The sum of 2,3,4 and 5 is : "+ sum(2,3,4,5));

    }
}
