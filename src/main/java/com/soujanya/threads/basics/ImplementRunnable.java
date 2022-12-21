package com.soujanya.threads.basics;

public class ImplementRunnable {
    public static void main(String args[]){

    System.out.println(String.format("Thread name %s", Thread.currentThread()));

    Thread t1 = new Thread(new MyRunnableThread());
    t1.start();

      Thread t2 = new Thread(new MyRunnableThread());
      t2.start();

  }
}

 class MyRunnableThread implements Runnable{

  @Override
  public void run() {
    System.out.println(String.format("Thread name %s",this.toString()));
  }
}
