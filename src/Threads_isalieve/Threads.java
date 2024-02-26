package Threads_isalieve;

public class Threads extends Thread {

    public void run() {
        System.out.println("fruits");
        try {
            Thread.sleep(450);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("vegetables");
    }
}

