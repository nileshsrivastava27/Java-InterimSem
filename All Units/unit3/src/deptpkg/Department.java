package deptpkg;
public class Department {
    public int deptID = 0;
    public String deptName = null;
    protected int managerID = 0;
    public Department(int dID,String dName,int mID){
        this.deptID = dID;
        this.deptName = dName;
        this.managerID = mID;
    }
    public void displayDepartment(){
        System.out.println(this.deptName + " department's details:\n");
        System.out.println("Deprtment ID is: " + this.deptID +"\n");
        System.out.println("Deprtment Manager ID is: " + this.managerID +"\n");
    }
}
