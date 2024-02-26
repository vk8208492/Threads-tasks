package Thread_priorities;

public class Threads extends Thread{

    public static void main(String[] args){

        Threads threads01 = new Threads();
        Threads threads02 = new Threads();
        Threads threads03 = new Threads();
        threads01.start();


        System.out.println("Threads01 priority : " +
                threads01.getPriority());
        System.out.println("Threads02 priority : " +
                threads02.getPriority());
        System.out.println("Threads03 priority : " +
                threads03.getPriority());
    }

    public void run() {
        System.out.println("Thread Running...");


    }
}
