package Threads_stop;

import Thread_priorities.Threads;

public class Main {

    public static void main(String[] args) {

        Runnables runnables = new Runnables();
        Thread thread = new Thread(runnables);
        thread.start();

        try {
            Thread.sleep(12L * 2500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runnables.doStop();
    }
}
