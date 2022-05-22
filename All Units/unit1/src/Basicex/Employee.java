package Basicex;

public class Employee {

    private int ID=0;

    private String name=null;



    public Employee(int ID,String name){

        this.ID = ID;

        this.name = name;

    }

    public void display(){

        System.out.println("Employee ID:"+ID);

        System.out.println("Employee name:"+name);

    }

}