package Threads_yield;

public class Threads extends Thread{

    public void run(){

        for (int i = 0; i < 6; i++) {
            System.out.println("vegetables");
            Thread.yield();
        }
    }
}
