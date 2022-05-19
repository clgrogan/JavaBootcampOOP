import java.util.Arrays;

public class Dealership {
  private Car[] cars;

  public Dealership(Car[] cars) {
    this.cars = new Car[cars.length];
    for (int i = 0; i < cars.length; i++) {
      this.cars[i] = new Car(cars[i]);
    }
  }

  public Dealership() {
    cars = new Car[12];
  }

  public void setCar(Car car, int index) {
    cars[index] = new Car(car);

  }

  public Car getCar(int index) {
    return new Car(cars[index]);
  }

  public void sell(int index) {
    this.cars[index].drive();
    this.cars[index] = null;
  }

  public String search(String make, double budget) {
    for (int i = 0; i < cars.length; i++) {
      System.out.println(this.cars[i]);
      if (this.cars[i] != null && this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget)
        return "We found one in spot " + i + "\n" + this.cars[i] + "\n...are you interested?";
    }
    return "Sorry, we couldn't find any cars.";
  }

  public String toString() {
    String returnString = this.getClass().getSimpleName() + "\n";

    for (int i = 0; i < cars.length; i++) {

      returnString += "Parking Spot: " + i + "\n";
      if (this.cars[i] == null) {
        returnString += "Empty\n";
        continue;
      }
      returnString += this.cars[i].toString() + "\n";
    }

    return returnString;
  }
}