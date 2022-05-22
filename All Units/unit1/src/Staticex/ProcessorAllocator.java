package Staticex;

public class ProcessorAllocator{

    public static int count=0;

    static {

        count = 32;

    }

    public ProcessorAllocator(){

    }



    public int allocateProcessor(){

        if(count>0)

            return count--;

        return count;

    }

}



