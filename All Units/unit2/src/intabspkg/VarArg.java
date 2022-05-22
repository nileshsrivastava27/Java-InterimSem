package intabspkg;

public class VarArg {
    public static void fun(int... a){

        System.out.println("Number of arguments: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

    }
}

