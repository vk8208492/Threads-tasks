package Threads_interrupt;

public class Threads extends Thread{

    public void run(){
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("vegetables: " + i);
                Threads.sleep(3500);
            }
        } catch (InterruptedException e){
            System.out.println("I got interrupted");
        }
    }
}
