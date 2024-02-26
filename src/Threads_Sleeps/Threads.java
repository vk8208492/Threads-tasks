package Threads_Sleeps;

public class Threads extends Thread {

    Threads(String str) {
        super(str);
        }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        System.out.println(Thread.currentThread().getName() + " Finished");
    }
}
