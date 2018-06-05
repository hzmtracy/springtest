package com.tk.othertools.threads.sync;

/**
 * synchronized 的使用
 */
public class Thread1 implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "  Test  " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread ta = new Thread(t1,"A");
        Thread tb = new Thread(t1, "B");
//        ta.setDaemon(true);
        ta.start();
        tb.start();
    }
}
