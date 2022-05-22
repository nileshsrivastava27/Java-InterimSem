public class Method {
    static void foo(){
        System.out.println("Good Morning bro!! ");
    }
    static void foo(int a){
        System.out.println("Good morning bro " + a);
    }
    static void foo(int a, int b){
        System.out.println("Good morning bro !! "+a +" Have a nice day " +b);
    }



    static void tellJoke(){
        System.out.println("I invented a new word!!!    Plagarism");
    }

    static void change1(int a){
        a=98;

    }

    static void change2(int [] marks){
        marks[0] = 98;

    }
    static int logic(int x, int y)
    { int ans = 0;

        if(x>y)
        {
             ans = x+y;
        }

        else
        {
            ans = (x+y)*10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int z = 0;
        z = logic(5,6);
        System.out.println(z);

        tellJoke();

        int x = 14;
        change1(x);
        System.out.println(x);

        int [] arr = { 34,45,56,67,78};
        change2(arr);
        System.out.println("The value of the array after passing through the function is : " + arr[0]);

        foo();
        foo(3000);
        foo(3000, 6000);
    }
}
