package com.tk.othertools.threads;

public class RunnableThread implements Runnable{
    private int i;
    @Override
    public void run() {
        for (; i<10;i++) {
            System.out.println(Thread.currentThread().getName() + "wwwwwwwwww" + i);
        }
    }

    public static void main(String[] args){
        for (int i= 0; i<10; i++){
            if(i==5){
                RunnableThread st = new RunnableThread();
                st.run();
//                new Thread(st,"新线程1").start();
//                new Thread(st,"新线程2").start();
            }
        }
    }
}
