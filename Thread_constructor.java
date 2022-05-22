
class MyThr extends Thread{
    public MyThr(String name){
    super(name);
    }


    public void run(){
        int i = 34;
        System.out.println("Thanks");
//        while(true){
//            System.out.println("hello i'm a thread");
//        }
    }
}





public class Thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Nilesh");
        MyThr t2 = new MyThr("Riya");
        t1.start();
        t2.start();
        System.out.println("the id of this thread is "+ t1.getId());
        System.out.println("the name of this thread is "+ t1.getName());
        System.out.println("the id of this thread is "+ t2.getId());
        System.out.println("the name of this thread is "+ t2.getName());


    }
}
