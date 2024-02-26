package Threads_Sleeps;

public class ThreadsSleeps {

    public static void main(String[] args) {

        Threads threads01 = new Threads("fruits");
        Threads threads02 = new Threads("vegetables");

        threads01.start();
        threads02.start();

    }
}
