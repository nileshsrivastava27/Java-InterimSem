package collex;
import java.util.Iterator;
import java.util.TreeSet;
import tspkg.Product;

public class Demo4 {
    public static void main(String[] args){

//5.TreeSet
        try {
            TreeSet<Product> ts = new TreeSet<Product>();
            for(int i=0;i<3;i++){
                Product p = new Product(1,"P"+i,i+1000);
                ts.add(p);
            }
            Iterator<Product> i = ts.iterator();
            while(i.hasNext()){
                Product p = i.next();
                p.displayProduct();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}