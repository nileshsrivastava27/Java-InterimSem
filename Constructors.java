
    class MyMainEmployee {
        private int ID=27;
        private String name="Nilesh";
//
//        public MyMainEmployee() {
//            ID =47;
//            name = "your-name-here";
//        }

        public MyMainEmployee(String myName, int id) {
            ID =id;
            name = myName;
        }

        public String getName(){ return name;}
        public int getID() {return ID;}
        public void setID(int i) { this.ID = i;}
        public void setName(String n) {this.name=n;}
    }
    public class Constructors {
    public static void main(String[] args) {

        MyMainEmployee nilesh = new MyMainEmployee("Nilesh Srivastava", 19);
        nilesh.getID();
        nilesh.getName();
//        nilesh.setName("Riya");
//        nilesh.setID(28);
        System.out.println(nilesh.getName());
        System.out.println(nilesh.getID());




    }
}
