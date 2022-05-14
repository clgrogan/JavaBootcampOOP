public class Car {
  public String make;
  public String model;
  public int year;
  public String color;
  public double price;

  public Car(String make, String model, double price, int year, String color) {
    System.out.println("\n Car constructor executing\n");
    this.make = make;
    this.model = model;
    this.price = price;
    this.year = year;
    this.color = color;
  }
}
