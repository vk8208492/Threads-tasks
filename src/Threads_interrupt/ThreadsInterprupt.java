package Threads_interrupt;

public class ThreadsInterprupt {

    public static void main(String[] args){

        Threads threads = new Threads();
        threads.start();
        threads.interrupt();
        System.out.println("fruits");
    }
}
