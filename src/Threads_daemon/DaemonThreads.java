package Threads_daemon;

import Thread_priorities.Threads;

public class DaemonThreads extends Thread{

    public DaemonThreads(String name){
        super(name);
    }

    public void run(){
        if ( Threads.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon threads");
        } else {
            System.out.println(getName() + " is Users threads");
        }
    }
}
