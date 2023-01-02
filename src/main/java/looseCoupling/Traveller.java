package looseCoupling;

public class Traveller {

  private Vehicle vehicle;

  public Vehicle getVehicle(){
    return this.vehicle;
  }
  public void setVehicle(Vehicle vehicle){
    this.vehicle = vehicle;
  }

  public void startJourney(){
    if (this.vehicle != null)
    this.vehicle.move();
  }

}
