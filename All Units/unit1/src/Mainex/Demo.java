package Mainex;

import Staticex.*;
import Finalex.*;
import Basicex.*;

public class Demo {

public static void main(String args[]){ 
//2.Final
    Finalex.FinalClass fc = new Finalex.FinalClass();

System.out.println("Final class value:"+fc.VALUE); 

fc.modifyFinalValue(); 

fc.modifyFinalValue("Harshu");

    Finalex.ChildFinalClass cfc = new Finalex.ChildFinalClass();

System.out.println("Child Final class value:"+cfc.VALUE); 

cfc.modifyFinalValue("Harshu"); 

//3. static members 

System.out.println("Static demo"); 

//3.a Windows office application 

    Staticex.ProcessorAllocator pa = new Staticex.ProcessorAllocator();

if(pa.allocateProcessor()==0) 

System.out.println("No more processor left out, please wait..."); 

else 

System.out.println("Processor " + (Staticex.ProcessorAllocator.count+1) +" is allocated");

  

//3.b Chrome browser 

    Staticex.ProcessorAllocator paa = new Staticex.ProcessorAllocator();

if(paa.allocateProcessor()==0) 

System.out.println("Count value from second instance " + paa.count); 

else 

System.out.println("Processor " + (Staticex.ProcessorAllocator.count+1) +" is allocated");

  

//3.c Media player 

    Staticex.ProcessorAllocator paaa = new Staticex.ProcessorAllocator();

if(paaa.allocateProcessor()==0) 

System.out.println("Count value from second instance " + paaa.count); 

else 
System.out.println("Processor " + (Staticex.ProcessorAllocator.count+1) +" is allocated");

 

} 

} 