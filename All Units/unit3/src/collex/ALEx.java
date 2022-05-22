package collex;
import java.util.ArrayList;
public class ALEx {
    public ArrayList al = null;
    public ALEx(){
        al = new ArrayList();
        for(int i=0;i<10;i++){
            al.add(i);
        }
    }
    public void displayAL(){
        for(int i=0;i<10;i++){
            System.out.println(al.get(i));
        }
    }
}
