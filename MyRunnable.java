public class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable Interface is running.");
    }
    public static void main(String[] args){

        MyRunnable r1=new MyRunnable();
        Thread t1 = new Thread(r1); // wrap runnable in a thread
        t1.start(); // start the thread, it goes to ready

        MyRunnable r2=new MyRunnable();
        Thread t2 = new Thread(r2);
        t2.start(); 

        System.out.println("Main Bye !");
    }
}
