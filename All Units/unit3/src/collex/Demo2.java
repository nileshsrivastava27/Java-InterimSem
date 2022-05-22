package collex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Vector;

import deptpkg.Department;
public class Demo2 {
    private static Scanner in=null;

    public static void main(String[] args){

        try{
            Vector<Department> v = new Vector<Department>();
            in = new Scanner(System.in);
            System.out.println("Enter the number of departments to be created");
            int noDepts = in.nextInt();
            for(int n=0;n<noDepts;n++){
                System.out.println("Enter the department ID");
                int tDID = in.nextInt();
                System.out.println("Enter the department name");
                String tDName = in.next();
                System.out.println("Enter the department manager's ID");
                int tDMID = in.nextInt();
                Department d = new Department(tDID,tDName,tDMID);
                v.add(d);
            }
            Iterator<Department> it = v.iterator();
            while(it.hasNext()){
                Department tD = it.next();
                tD.displayDepartment();
            }
        }finally{
            in.close();
        }
    }
}
