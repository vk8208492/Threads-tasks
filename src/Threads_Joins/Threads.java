package Threads_Joins;

public class Threads implements Runnable{


    @Override
    public void run() {

        Thread threads = Thread.currentThread();
        System.out.println("Thread started: " + threads.getName());
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: " + threads.getName());
    }
}
