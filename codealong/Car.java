import java.util.Arrays;

public class Car {
  private String make;
  private String model;
  private int year;
  private String color;
  private double price;
  private String[] parts;

  public Car(String make, String model, double price, int year, String color, String[] parts) {
    System.out.println("\n Car constructor executing\n");
    this.make = make;
    this.model = model;
    this.price = price;
    this.year = year;
    this.color = color;
    this.parts = Arrays.copyOf(parts, parts.length);
  }

  public Car(Car originCar) {
    this.make = originCar.make;
    this.model = originCar.model;
    this.price = originCar.price;
    this.year = originCar.year;
    this.color = originCar.color;
    this.parts = Arrays.copyOf(originCar.parts, originCar.parts.length);
  }

  public Car() {
  }

  public static Car copyCar(Car originCar) {
    Car newCar = new Car();
    newCar.make = originCar.make;
    newCar.model = originCar.model;
    newCar.price = originCar.price;
    newCar.year = originCar.year;
    newCar.color = originCar.color;
    newCar.parts = Arrays.copyOf(originCar.parts, originCar.parts.length);
    return newCar;
  }

  public void drive() {
    System.out.println("You bought the " + this.year + " " + this.color + " " + this.make + " for $" + this.price);
    System.out.println("Please drive to the nearest exit.");
  }

  /**
   * 
   * @return
   */
  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public String getColor() {
    return this.color;
  }

  public int getYear() {
    return this.year;
  }

  public double getPrice() {
    return this.price;
  }

  public String[] getParts() {
    return this.parts;
  }

  /// setters
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setParts(String[] parts) {
    this.parts = Arrays.copyOf(parts, parts.length);
  }

}
