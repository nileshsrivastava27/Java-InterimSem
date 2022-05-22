package collex;
import socpkg.SingletonSocket;
import tspkg.Product;

public class Demo6 {
    public static void main(String[] args){
//8.Singleton

        try{
            SingletonSocket s = SingletonSocket.allocateSocket();
            s.displaySocket();
            System.out.println(s.hashCode());
            SingletonSocket s2 = SingletonSocket.allocateSocket();
            s2.displaySocket();
            System.out.println(s2.hashCode());
            Product p = new Product(1,"Pen",10);
            System.out.println(p.hashCode());
            Product p2 = new Product(2,"Pencil",20);
            System.out.println(p2.hashCode());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
