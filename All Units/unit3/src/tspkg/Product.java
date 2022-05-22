package tspkg;
//This is a code of TreeSet
public class Product implements Comparable<tspkg.Product> {
    protected int pID = 0;
    protected String pName = null;
    protected double pPrice = 0.0;
    public Product(int pID,String pName,double pPrice){
        this.pID = pID;
        this.pName = pName;
        this.pPrice = pPrice;
    }
    public void displayProduct(){
        System.out.println("The product " + pName + " details:\n");
        System.out.println("ID " + pID + "\n");
        System.out.println("Price " + pPrice + "\n");
    }

    @Override
    public int compareTo(Product p) {
// TODO Auto-generated method stub
        if(this.pID==p.pID)
            return 1;
        else
            return 0;
    }
}
