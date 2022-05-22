package intabspkg;

public abstract class StrAbsMethods implements StringInterface{
    protected String fName = "Nilesh";
    protected String lName = "Srivastava";
    protected String name = null;

    public abstract void setVersion();
    public String fullName()
    {
        name = fName + " " + lName;
        return name;
    }
    public abstract String salutationName();
}
