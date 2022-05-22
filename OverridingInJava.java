class A{
    public int a;
    public int nilesh(){
        return 4;
    }

    public void meth2(){
        System.out.println("This is method 2 of class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("this is the method 3 of class B");
    }
    @Override
    public void meth2(){
        System.out.println("This is the method 2 of class B");
    }
}




public class OverridingInJava {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}
