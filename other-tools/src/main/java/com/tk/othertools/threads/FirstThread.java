package com.tk.othertools.threads;

public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 10; i++) {
            System.out.println(getName() + "   " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        firstThread.setName("firstThread");
        firstThread.setDaemon(true);
        firstThread.start();
        firstThread.setPriority(MIN_PRIORITY);

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "------ " + i);
            if (i == 5) {
                FirstThread thread1 = new FirstThread();
                thread1.setName("1");
                thread1.start();
                thread1.setPriority(MAX_PRIORITY);
                FirstThread thread2 = new FirstThread();
                thread2.setName("2");
                thread2.start();
                thread2.join();
//                new FirstThread().start();
            }
        }
    }
}
