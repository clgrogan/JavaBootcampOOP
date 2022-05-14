import java.util.Date;

public class Main {
  public static void main(String[] args) {

    Car car01 = new Car("Nissan", "350Z", 23000, 2011, "Red");
    Car car02 = car01;

    System.out.println(
        "Create a car01 and then another Car object, car02, by setting it = to the first: "
            + "\n\tCar car01 = new Car(\"Nissan\", \"350Z\", 2013, 23000, \"Red\");"
            + "\n\tCar car02 = n;");

    System.out.println();
    System.out.println("Let's print using the values from the two variables.");
    System.out.println(
        " Output for the 'car01' variable:"
            + "\n   The " + car01.make + "\s" + car01.model + " is worth $" + car01.price
            + " was built in " + car01.year + ". It is "
            + car01.color + ".");
    System.out.println(
        " Output for the 'car02' variable:"
            + "\n   The " + car02.make + "\s" + car02.model + " is worth $" + car02.price
            + " was built in " + car02.year + ". It is "
            + car02.color + ".");
    System.out.println();
    System.out.println("The output from the two variables matches. Great!\n\t...right?");

    System.out.println("It turns out car01 is actually a different color, which affects the price.");
    System.out.println("We update the color and price of car01 with:");
    System.out.println("\tcar01.color = \"Hot Pink\"; and car01.price = 33333");
    car01.color = "Hot Pink";
    car01.price = 33333;

    System.out.println();
    System.out.println("Again, let's print using the values from the two variables.");
    System.out.println(
        " Output for the 'car01' variable:"
            + "\n   The " + car01.make + "\s" + car01.model + " is worth $" + car01.price
            + " was built in " + car01.year + ". It is "
            + car01.color + ".");
    System.out.println(
        " Output for the 'car02' variable:"
            + "\n   The " + car02.make + "\s" + car02.model + " is worth $" + car02.price
            + " was built in " + car02.year + ". It is "
            + car02.color + ".");
    System.out.println();
    System.out
        .println("The values for car02 also changed, that occurs because the two variables have the same reference");
    System.out.println("\tcar01 reference value = " + car01);
    System.out.println("\tcar02 reference value = " + car02);

    System.out.println(
        "This is called the reference trap. With objects, we can \navoid the trap by using the \"new\" keyword when creating the variable.");
    System.out.println();
    System.out.println("We create a car03 variable using this code: ");
    System.out.println("   Car car03 = new Car(car01.make, car01.model, car01.price, car01.year, car01.color);");
    Car car03 = new Car(car01.make, car01.model, car01.price, car01.year, car01.color);
    System.out.println("car03 is not hot pink, so of course it is cheaper so let's update car03 with:");
    System.out.println("\tcar03.color = \"Silver\"; and car03.price = 6022.15");
    car03.color = "Silver";
    car03.price = 6022.15;

    System.out.println();
    System.out.println("Finally, let's print and compare the values of car01, car02, and car03");
    System.out.println(
        " Output for the 'car01' variable:"
            + "\n   The " + car01.make + "\s" + car01.model + " is worth $" + car01.price
            + " was built in " + car01.year + ". It is "
            + car01.color + ".");
    System.out.println(
        " Output for the 'car02' variable:"
            + "\n   The " + car02.make + "\s" + car02.model + " is worth $" + car02.price
            + " was built in " + car02.year + ". It is "
            + car02.color + ".");
    System.out.println(
        " Output for the 'car03' variable:"
            + "\n   The " + car03.make + "\s" + car03.model + " is worth $" + car03.price
            + " was built in " + car03.year + ". It is "
            + car03.color + ".");
    System.out.println();
    System.out
        .println("We can see that car03 has been updated, and the price and color of the other two cars is unchanged.");

    System.out.println();
    System.out.println(
        "As confirmation that car03 is truely independent from car01 and car02, here are"
            + "\nthe reference values of all three variables:");
    System.out.println("\tcar01 reference value = " + car01);
    System.out.println("\tcar02 reference value = " + car02);
    System.out.println("\tcar03 reference value = " + car03);
    System.out.println();
  }
}