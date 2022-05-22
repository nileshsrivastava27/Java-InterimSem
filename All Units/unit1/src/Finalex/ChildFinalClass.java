package Finalex;

public class ChildFinalClass extends FinalClass {



    public ChildFinalClass(){

    }



//    public final void modifyFinalValue(){
//
//        System.out.print("Void version: Final class value is:" + VALUE);
//
//    }

    public void modifyFinalValue(String name){

        System.out.print("String version: Final class name is:" + name);

    }



}
