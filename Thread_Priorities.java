

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }


    public void run(){
        int i = 34;

        while(true){
//            System.out.println("hello i'm a thread");
            System.out.println("Thanks: "+ getName() );
        }
    }

}


public class Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Nilesh1");
        MyThr1 t2 = new MyThr1("Nilesh2");
        MyThr1 t3 = new MyThr1("Nilesh3");
        MyThr1 t4 = new MyThr1("Nilesh4");
        MyThr1 t5 = new MyThr1("Nilesh5 (most important");

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
