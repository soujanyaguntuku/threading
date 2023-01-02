package tightcoupling;

public class Traveller {
  Car c = new Car(); // car is tightly coupled with vehicle
 public void startJourney()
 {
   c.move();
   System.out.println("car object is tightly coupled with vehicle");
 }

}
