class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;

        while(i<20){
//            System.out.println("hello i'm a thread");
            System.out.println("Thanks from my side: ");
            i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 }

class MyNewThr2 extends Thread{
    public void run(){
        int i = 0;

        while(i<10){
            System.out.println("Thanks: ");
            i++;
        }
    }
}





public class Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 thread1 = new MyNewThr1();
        MyNewThr2 thread2 = new MyNewThr2();

        thread1.start();
        try{
            thread1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        thread2.start();



    }
}