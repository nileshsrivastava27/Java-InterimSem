interface Bicycle{
     int a = 45;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{

    void HornSTH();
    void HornSEC();
}


class AvonCycle implements Bicycle, HornBicycle{
    public void blowHorn(){
        System.out.println("pee pee poo poo...");
    }

    public void applyBrakes(int decrement){

        System.out.println("function for applying brakes");
    }
   public void speedUp(int increment){
        System.out.println("function for speeding up");
    }
    public void HornSTH(){
        System.out.println("Her hao oo eeee");
    }
    public void HornSEC(){
        System.out.println("Hee aha hahia jaha");
    }

}

public class Interface {
    public static void main(String[] args) {
    AvonCycle cycleNilesh = new AvonCycle();
    cycleNilesh.applyBrakes(1);
    //you can create properties via interfaces
        System.out.println(cycleNilesh.a);
        // you cannot modify any of the properties in the interface as it is FINAL

        cycleNilesh.HornSEC();
        cycleNilesh.HornSTH();
    }
}
