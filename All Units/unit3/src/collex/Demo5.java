//this is a code for deque

package collex;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
import tspkg.Product;

//7.Deque by LinkedList
public class Demo5 {
    public static void main(String[] args){
        try{
            Deque<Product> ll = new LinkedList<Product>();
            for(int i=0;i<3;i++){
                Product p = new Product(1,"P"+i,i+1000);
                ll.add(p);
            }
            Iterator<Product> i = ll.iterator();
            while(i.hasNext()){
                Product p = i.next();
                p.displayProduct();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}