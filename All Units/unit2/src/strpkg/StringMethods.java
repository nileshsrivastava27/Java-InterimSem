package strpkg;

public class StringMethods {private String name = null;
    private String fName = null;
    private String lName = null;

    public StringMethods(String fName,String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public String fullName(){
        name = fName + " " + lName;
        return name;
    }
}
