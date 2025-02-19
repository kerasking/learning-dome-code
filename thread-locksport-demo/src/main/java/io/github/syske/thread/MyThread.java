/* Copyright © 2021 syske. All rights reserved. */
package io.github.syske.thread;

/**
 * @author syske
 * @version 1.0
 * @date 2021-11-09 22:03
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        State state = Thread.currentThread().getState();
        System.out.println("run 方法开始执行了");
        System.out.printf("运行中线程的状态：%s\n", state);
        System.out.println("run 方法运行结束");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.printf("线程新建后的状态：%s\n" ,myThread.getState());
        myThread.start();
        System.out.printf("线程启动后的状态：%s\n", myThread.getState());
        Thread.sleep(1000);
        System.out.printf("线程运行后的状态：%s\n", myThread.getState());
    }
}
