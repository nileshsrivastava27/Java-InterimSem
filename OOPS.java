import java.util.*;
import Bank;


class Pen {
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
class Student {
    String name;
    int age;
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
    // public void printInfo() {
    // Student(){

    // }

    //POLYMORPHISM:-- FUNCTION OVERLOADING

    // public void printInfo(String name) {
    //     System.out.println(name);
    // }
    // public void printInfo(int age) {
    //     System.out.println(age);
    // }
    // public void printInfo(String name,int age) {
    //     System.out.println(name + " " + age);
    // }

    class Shape  {
        public void area(){
            System.out.println("display area");
        }
    }

    class Triangle extends Shape {
        public void area(int length, int height){             //DERIVED CLASS OF SHAPE AND CAUSING SINGLE LEVEL INHERITANCE
            System.out.println(1/2*length*height);
        }
    }

    class Circle extends Shape {
        public void area(float r) {                          // DERIVED CLASS OF SHAPE CLASS AND CAUSING HIERARCHIAL INHERITANCE
            System.out.println((3.14)*r*r);
        }
    }
    class EquilateralTriangle extends Triangle {
        public void area (int length, int height){          //DERIVED CLASS OF TRIANGLE CLASS AND CAUSING MULTILEVEL INHERITANCE
            System.out.println(1/2*length*height);
        }
    }
}


public class OOPS
{
    public static void main(String[] args){
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Ballpoint";
        // pen1.printColor();
        // pen2.printColor();


        //POLYMORPHISM CODE BELOW

        // Student s1 = new Student();
        // s1.name = "Nilesh";
        // s1.age = 20;

        // // Student s2 = new Student(s1);
        // // s2.printInfo();
        // s1.printInfo(s1.name, s1.age);

        // Triangle t1 = new Triangle();
        // t1.color = "red";

        Bank.Account account1 = new Bank.Account();
        account1.name = "customer1";








    }
}
