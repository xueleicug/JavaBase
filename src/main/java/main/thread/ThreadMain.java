package main.thread;

import example.thread.MyThread1;

/**
 * 多线程基础示例
 */
public class ThreadMain {

    public static void main(String[] args) {

//        MyThread0 threadA = new MyThread0();
//        MyThread0 threadB = new MyThread0();
//        MyThread0 threadC = new MyThread0();
//        threadA.start();
//        threadB.start();
//        threadC.start();
        Runnable thread = new MyThread1();
        Thread threadA = new Thread(thread);
        Thread threadB = new Thread(thread);
        Thread threadC = new Thread(thread);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
