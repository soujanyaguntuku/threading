package com.soujanya.threads.simplethreading;


import java.time.Instant;
import java.util.concurrent.CountDownLatch;

public class MainClass{
  public static int count = 0;

  public static void main(String[] args) throws InterruptedException {
    CountDownLatch countDownLatch = new CountDownLatch(4);
    IncCountThread thread1 = new IncCountThread(countDownLatch);
    IncCountThread thread2 = new IncCountThread(countDownLatch);
    IncCountThread thread3 = new IncCountThread(countDownLatch);
    IncCountThread thread4 = new IncCountThread(countDownLatch);

    Instant before = Instant.now();

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    countDownLatch.await();
    Instant after = Instant.now();

//    thread1.join();
//    thread2.join();
//    thread3.join();
//    thread4.join();

    System.out.println("Count value is : " +count);
    System.out.println("The time difference is " +(after.getNano()-before.getNano()) + " nano seconds");
  }
}
class IncCountThread extends Thread{
  private final CountDownLatch countDownLatch;
  public IncCountThread(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  @Override
    public void run() {
      for(int i = 0; i < 1000000; i++){
          MainClass.count++;
      }
    countDownLatch.countDown();
    }
  }

