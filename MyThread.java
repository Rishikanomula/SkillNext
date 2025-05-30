public class MyThread extends Thread {
    int ctr;
    MyThread(String name, int ctr){
        setName(name);
        this.ctr=ctr;
    }

    public void run(){
        // System.out.println("Name of Thread: "+getName());
        for(int i=1; i<=ctr; i++){
            System.out.println(getName()+" I= "+i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("T1",10); // born state
        t1.start(); // ready state

        MyThread t2 = new MyThread("T2",20); // born state
        t2.start(); // ready state

        System.out.println("Main Bye !");
    }
}
