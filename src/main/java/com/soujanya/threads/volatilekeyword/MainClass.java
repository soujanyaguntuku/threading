package com.soujanya.threads.volatilekeyword;

public class MainClass {
  private static int counter = 0;
  public static void main(String[] args) throws InterruptedException {

    Thread t1 = new Thread(()
    -> {
      int local_counter = counter;

      while (local_counter < 10){
        if(local_counter != counter){
          System.out.println(""+Thread.currentThread().getName());
          local_counter = counter;
        }
      }
    });
    Thread t2 = new Thread(()-> {
      int local_counter = counter;

     while(local_counter < 10){
        System.out.println(""+Thread.currentThread().getName());
        counter = ++local_counter;

       try {
         Thread.sleep(500);
       } catch (InterruptedException e) {
         throw new RuntimeException(e);
       }
     }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

  }

}

