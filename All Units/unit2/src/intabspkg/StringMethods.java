package intabspkg;

public class StringMethods extends StrAbsMethods{
    public StringMethods(String fName,String lName){
        this.fName = fName;
        this.lName = lName;
    }
    public String salutationName(){
        name = "Prof. " + name + "\n";
        return name;
    }
    public void setVersion(){
        System.out.println("Value of version inherited from interface: " + version + "\n");
    }
}
