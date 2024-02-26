package Threads_Joins;

public class ThreadsJoins {

    public static void main(String[] args){

        Thread thread1 = new Thread(new Threads(), "fruits");
        Thread thread2 = new Thread(new Threads(), "vegetables");


        thread1.start();
        thread2.start();

    }
}
