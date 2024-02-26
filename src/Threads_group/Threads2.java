package Threads_group;

public class Threads2 extends Thread {

        Threads2(String vegetables, ThreadGroup food){
            super(food,vegetables);
        }
        public void run(){
            for (int i = 0; i < 12; i++) {
                try {
                    Threads2.sleep(12);
                } catch (InterruptedException ex){
                    System.out.println(Threads2.currentThread().getName());
                }
            }
            System.out.println(Threads2.currentThread().getName());
        }
}
