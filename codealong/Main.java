package codealong;

public class Main {
  public static void main(String[] args) {

    Car n = new Car("Nissan", "350Z", 2013, 23000, "Red");
    Car d = new Car("Dodge", "Stealth", 2001, 500, "Red");

    System.out.println(
        "\nThis " + n.make + "\s" + n.model + " is worth $" + n.price
            + " was built in " + n.year + ". It is "
            + n.color + ".\n");

    System.out.println(
        "\nThis " + d.make + "\s" + d.model + " is worth $" + d.price
            + " was built in " + d.year + ". It is "
            + d.color + ".\n");
  }
}