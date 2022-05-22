import java.util.*;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(24);
        l2.add(48);
        l2.add(79);
        l2.add(67);
        l1.add(6);
        l1.add(2);
        l1.add(8);
        l1.add(4);
        l1.add(0,7);
        l1.addAll(0,l2);        //adding elements of l2 from begining but as default it will come after l1 list
        l1.addAll(l2);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(6));
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
