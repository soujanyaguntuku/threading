package com.soujanya.threads.atomaicInteger;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {


  public static void main(String[] args) throws InterruptedException {


    IncCountThread thread1 = new IncCountThread();
    IncCountThread thread2 = new IncCountThread();
    IncCountThread thread3 = new IncCountThread();
    IncCountThread thread4 = new IncCountThread();

    Instant before = Instant.now();

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    thread1.join();
    thread2.join();
    thread3.join();
    thread4.join();

    Instant after = Instant.now();

    System.out.println("Count value is : " + IncCountThread.count);
    System.out.println("The time difference is " +(after.getNano()-before.getNano()) + " nano seconds");
  }
}
class IncCountThread extends Thread{
  public static AtomicInteger count = new AtomicInteger(0);

  @Override
  public void run() {
    for(int i=0; i<10000000 ; i++){
      count.incrementAndGet();
    }
  }
}
