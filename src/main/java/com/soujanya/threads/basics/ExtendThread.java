package com.soujanya.threads.basics;

public class ExtendThread{
  public static void main(String args[]){
    System.out.println(String.format("Thread name %s", Thread.currentThread()));

    MyThread thread1 = new MyThread();
    MyThread thread2 = new MyThread();

    thread1.start();
    thread2.start();

  }
}
  class MyThread extends Thread{
    public void run(){
       System.out.println(String.format("Thread name %s", currentThread()));
     }
  }

