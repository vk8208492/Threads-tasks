package Threads_isalieve;

public class Main {

    public static void main(String[] args) {

        Threads threads1 = new Threads();
        Threads threads2 = new Threads();

        threads1.start();
        threads2.start();

        System.out.println("Threads #1 " + threads1.isAlive());
        System.out.println("Threads #2 " + threads2.isAlive());
    }
}