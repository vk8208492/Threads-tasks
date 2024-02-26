package Threads_group;

public class ThreadsGroup1 {

    public static void main(String[] arg) {
        ThreadGroup threadGroup = new ThreadGroup("Parent thread group");

        Threads1 obj1 = new Threads1("Thread 1 is active.", threadGroup);
        Threads1 obj2 = new Threads1("Thread 2 is active.", threadGroup);
        Threads1 obj3 = new Threads1("Thread 2 is active.", threadGroup);
        Threads1 obj4 = new Threads1("Thread 2 is active.", threadGroup);
        Threads1 obj5 = new Threads1("Thread 2 is active.", threadGroup);
        Threads1 obj6 = new Threads1("Thread 2 is active.", threadGroup);


        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();


        System.out.println("Total number of active threads is " +
                threadGroup.activeCount());

    }
}
