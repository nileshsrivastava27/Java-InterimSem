class MyRunnableThread1 implements Runnable{
    public void run(){
        System.out.println("I'm a a thread 1, not a threat");
    }
}

class MyRunnableThread2 implements Runnable{
    public void run(){
        System.out.println("I'm a a thread 2, not a threat");
    }
}

public class RunnableThreadInJava {
    public static void main(String[] args) {
    MyRunnableThread1 bullet1 = new MyRunnableThread1();
    Thread gun1 = new Thread(bullet1);

    MyRunnableThread2 bullet2 = new MyRunnableThread2();
    Thread gun2 = new Thread(bullet2);
    gun1.start();
    gun2.start();




    }
}
