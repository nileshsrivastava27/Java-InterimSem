package Basicex;

public class Manager extends Employee{
    private String designation = null;

    public Manager(int ID,String name,String designation){
        super(ID,name);
        this.designation = designation;
    }
    public void display(){
        super.display();
        System.out.println("Employ designation:" + designation);
    }
}
