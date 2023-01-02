package looseCoupling;

public class Bike implements Vehicle{

  private int wheels;
  private String name;
  private String model;
  @Override
  public void move(){
    System.out.println("Bike is moving");
  }
}
