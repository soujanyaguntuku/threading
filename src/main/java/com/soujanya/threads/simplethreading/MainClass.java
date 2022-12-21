package com.soujanya.threads.simplethreading;


import java.time.Instant;

public class MainClass{
  public static int count = 0;
  public static void main(String args[]) throws InterruptedException {
    IncCountThread thread1 = new IncCountThread();
    IncCountThread thread2 = new IncCountThread();
    IncCountThread thread3 = new IncCountThread();
    IncCountThread thread4 = new IncCountThread();

    Instant before = Instant.now();

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
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

    @Override
    public void run() {
      for(int i = 0; i < 1000; i++){
        MainClass.count ++;
      }
    }
  }

