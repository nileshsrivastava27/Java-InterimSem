package emppkg;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.HashMap;
public class Demo7 {
    private static Scanner in = null;
    public static void main(String[] args) {
        try {
            ArrayList<Employee> A = new ArrayList<Employee>();
            Vector<Employee> V = new Vector<Employee>();
            TreeSet<Employee> T = new TreeSet<Employee>();
            HashMap<String, Integer> hs = new HashMap<String, Integer>();
            in = new Scanner(System.in);
            System.out.println("Enter the number of Employee");
            int noEmp = in.nextInt();
            for (int n = 0; n < noEmp; n++) {
                System.out.println("Enter the Employee name");
                String name = in.next();
                System.out.println("Enter the Employee age");
                int age = in.nextInt();
                Employee d = new Employee(name, age);
                A.add(d);
                V.add(d);
                T.add(d);
                hs.put(name, age);
            }

            Iterator<Employee> i = A.iterator();
            while (i.hasNext()) {
                Employee p = i.next();
                p.displayEmployee();
            }
            Iterator<Employee> j = V.iterator();

            while (j.hasNext()) {
                Employee p = j.next();
                p.displayEmployee();
            }
            Iterator<Employee> k = T.iterator();
            while (k.hasNext()) {
                Employee p = k.next();
                p.displayEmployee();
            }

            for (String key : hs.keySet()) {
                System.out.println(key);
            }
            for (Integer values : hs.values()) {
                System.out.println(values);
            }

        }finally{
            in.close();
        }
    }
}