package com.tk.othertools.threads.sync;

public class TextThread {
    public static void main(String[] args) {
        TxtThread textThread = new TxtThread();
        new Thread(textThread).start();
        new Thread(textThread).start();
        new Thread(textThread).start();
        new Thread(textThread).start();
    }


}

class TxtThread implements Runnable {
    int num = 10;
    String str = new String();

    @Override
    public void run() {
        synchronized (str) {
            while (num > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "  this is " + num--);
            }
        }
    }
}
