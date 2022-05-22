
        package emppkg;
public class Employee implements Comparable<emppkg.Employee>{
    public String name;
    public int age;
    public int ID;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = age;
    }
    public void displayEmployee(){
        System.out.println("Employee name is: " + this.name +"\n");
        System.out.println("Employee age is: " + this.age +"\n");
    }
    @Override
    public int compareTo(Employee p) {
        // TODO Auto-generated method stub
        if(this.ID==p.ID)
            return 1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return name;
    }
}