package list12_8;

public class SynchronizedThreadsDemo {
    public static void main(String[] args) {
        int n = 100, count = 5, time = 1000, dt = 200;
        MyNumber obj = new MyNumber();
        obj.number = n;
        MyThread Alpha  = new MyThread("Alpha", obj,time+dt, count, true);
        MyThread Bravo  = new MyThread("Bravo", obj,time-dt, count, false);
        try{
            if(Alpha.isAlive()) Alpha.join();
            if(Bravo.isAlive()) Bravo.join();
        }
        catch (InterruptedException ex){
            System.out.println(ex);
        }
    }
}
