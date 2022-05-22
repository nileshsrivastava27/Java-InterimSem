public class Custom_Class {
    static class Employee {
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName(){
            return name;
        }

        public void setName(String n){
            name = n;

        }
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 27;
        e.name  = "nilesh";

        System.out.println(e.name);
        System.out.println(e.salary);

        e.setName("Riya");
        e.getName();
        e.getSalary();

    }


}
