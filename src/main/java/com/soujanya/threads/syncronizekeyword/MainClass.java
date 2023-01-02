package com.soujanya.threads.syncronizekeyword;

public class MainClass {

public static void main(String[] args) throws InterruptedException {
  IncThread thread1 = new IncThread();
  IncThread thread2 = new IncThread();
  IncThread thread3 = new IncThread();
  IncThread thread4 = new IncThread();

  thread1.start();
  thread2.start();
  thread3.start();
  thread4.start();

  thread1.join();
  thread2.join();
  thread3.join();
  thread4.join();

  System.out.println("number of count " + IncThread.count);

}

}

class IncThread extends Thread{
 public static int count = 0;
  private static Object lock = new Object();
  @Override
  public void run() {

      for (int i = 0; i< 100000; i++){
        synchronized (lock) {
          count ++;
    }
  }

  }
}
