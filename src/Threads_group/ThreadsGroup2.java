package Threads_group;

public class ThreadsGroup2 {

    public static void main(String[] arg) {
        ThreadGroup threadGroup = new ThreadGroup("Parent thread group");

        Threads2 obj1 = new Threads2("Thread 1 is active.", threadGroup);
        Threads2 obj2 = new Threads2("Thread 2 is active.", threadGroup);
        Threads2 obj3 = new Threads2("Thread 3 is active.", threadGroup);
        Threads2 obj4 = new Threads2("Thread 4 is active.", threadGroup);
        Threads2 obj5 = new Threads2("Thread 5 is active.", threadGroup);
        Threads2 obj6 = new Threads2("Thread 6 is active.", threadGroup);

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
