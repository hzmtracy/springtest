package com.tk.othertools.threads;

public class ThreadTests extends Thread {
    private int i;

    @Override
    public void run() {
        for(i=0;i<10;i++){
            System.out.println(getName() + " " +i);
        }
    }
    public static void main(String[] args){
        ThreadTests xx = new ThreadTests();
        xx.setName("xx");
        xx.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------ " +i);
            if(i==5){
                new ThreadTests().start();
                new ThreadTests().start();
                try {
                    xx.join(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
