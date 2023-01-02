package looseCoupling;

public class MainClass {
  public static void main(String args[]){
    Traveller t1 =  new Traveller();
    t1.setVehicle(new Car());
    t1.startJourney();

    t1.setVehicle(new Bike());
    t1.startJourney();
  }

}
