package Threads_daemon;

public class Main {

    public static void main(String[] args){

        DaemonThreads threads1 = new DaemonThreads("fruits");
        DaemonThreads threads2 = new DaemonThreads("vegetables");
        DaemonThreads threads3 = new DaemonThreads("food");

        threads1.setDaemon(true);

        threads1.start();
        threads2.start();

        threads3.setDaemon(true);
        threads3.start();
    }
}
