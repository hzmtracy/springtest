package com.tk.othertools.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolT();
    }
    public static void ThreadPoolT(){
        ExecutorService pool = Executors.newFixedThreadPool(4);

        Runnable target = ()->{
          for (int i=0; i<1;i++){
              System.out.println(Thread.currentThread().getName() +" 的i值为： "+ i);
          }
        };

        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.submit(target);
        pool.submit(target);
        pool.shutdown();
    }
}
