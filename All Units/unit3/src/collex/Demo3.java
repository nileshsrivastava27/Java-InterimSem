package collex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Vector;

import deptpkg.Department;
public class Demo3 {
    private static Scanner in=null;

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        String[] departments = {"Production","Accounts","R&D","Sales"};
        for(String dName : departments)
            a.add(dName);

        Iterator<String> i = a.iterator();
        System.out.println("Department names are ");
        while(i.hasNext())
            System.out.println(i.next());
    }
}