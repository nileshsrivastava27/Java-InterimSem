package pack1;
// import required packages

class A {
   private void function1()
   {
      System.out.println("This is private member function");
   }
}

class B {
   protected void function2()
   {
      System.out.println("This is protected member function");
   }
}

class C {
   public void function3() {
      System.out.println("This is public member function");
   }
}
public class variousScope {
   public static void main(String[] args){
      //assigning objects to each class
      A a = new A();
      B b = new B();
      C c = new C();

      //calling all functions through objects
//      a.function1();
      b.function2();
      c.function3();

      //Function1 cannot be called as it is in private function


   }
}
