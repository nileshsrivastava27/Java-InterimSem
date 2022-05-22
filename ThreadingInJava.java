class MyThread1 extends Thread {

    public void run(){
        int i=0;
        while(i<10){
            System.out.println("My thread is running");
            System.out.println("I'm happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while(i<20){
            System.out.println("My thread2 is running");
            System.out.println("I'm sad");
            i++;
        }
    }
}


