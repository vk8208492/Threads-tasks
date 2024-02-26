package Threads_group;

public class Threads1 extends Thread {

    Threads1(String fruits, ThreadGroup food){
        super(food,fruits);
    }
    public void run(){
        for (int i = 0; i < 12; i++) {
            try {
                Threads1.sleep(12);
            } catch (InterruptedException ex){
                System.out.println(Threads1.currentThread().getName());
            }
        }
        System.out.println(Threads1.currentThread().getName());
    }
}
