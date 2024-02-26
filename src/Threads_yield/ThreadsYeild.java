package Threads_yield;

public class ThreadsYeild {

    public static void main(String[] args){

        Threads threads = new Threads();
        threads.start();

        for (int i = 0; i < 6; i++) {
            System.out.println("fruits");
        }
    }
}
