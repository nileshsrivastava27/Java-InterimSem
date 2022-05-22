package collex;
import java.util.HashMap;
public class HashMapping {
    public static void main(String[] args){
//6.HashMap
        try{
            HashMap<String,Integer> hs = new HashMap<String,Integer>();
            for(int i=0;i<3;i++){
                hs.put("nileshsrivastava" + i +"@gmail.com", i);
            }
            for(int i=0;i<3;i++){
                System.out.println("Key: nileshsrivastava"+i+"@gmail.com");
                System.out.println("Value: " + hs.get("nileshsrivastava"+i+"@gmail.com"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
