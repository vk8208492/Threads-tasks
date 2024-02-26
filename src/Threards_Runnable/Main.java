package Threards_Runnable;

public class Main {

    public static void main(String[] args){

        ThreardsRunnable threardsRunnable = new ThreardsRunnable();
        Thread thread = new Thread(threardsRunnable);
        thread.start();
    }
}
