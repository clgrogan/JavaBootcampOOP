import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Car[] cars = new Car[] {
                                new Car("Ford", "Mustang", 29000, 2021, "Hot Pink",
                                                new String[] { "All Season Tires", "two sets keys" }),
                                new Car("Nissan", "Maxima", 34998, 2023, "Gold",
                                                new String[] { "Performance Tires", "Advanced Keys" }),
                                new Car("Jeep", "Wrangler", 43000, 2021, "Graphite",
                                                new String[] { "Muddin' Tires", "18\" Star Rims", "Keys" }),
                                new Car("BMW", "M4", 92000, 2022, "Imola Red",
                                                new String[] { "Z Rated Summer Tires", "Two Sets Keys" }),
                                new Car("Porsche", "911", 43000, 1971, "Yellow",
                                                new String[] { "Drag Radials", "Curb Cutters", "Keys" }),
                                new Car("Ford", "F-150", 5000, 2021, "Baby Blue",
                                                new String[] { "Offroad Tires", "18\" Star Rims", "Keys" }) };
                Dealership dealership = new Dealership(cars);

                for (int i = 0; i < cars.length; i++) {
                        dealership.setCar(cars[i], i);
                }

                dealership.sell(2);

                System.out.println("Search results:\n" + dealership.search("Nissan", 100000));

                System.out.println(dealership);

        }

        public static void oldMain(String[] args) {
                String[] parts = { "Tires", "Keys" };

                Car car01 = new Car("Nissan", "350Z", 23000, 2011, "Red", parts);
                Car car02 = car01;

                System.out.println(
                                "Create a car01 and then another Car object, car02, by setting it = to the first: "
                                                + "\n\tCar car01 = new Car(\"Nissan\", \"350Z\", 2013, 23000, \"Red\");"
                                                + "\n\tCar car02 = n;");

                System.out.println();
                System.out.println("Let's print using the values from the two variables.");
                System.out.println(
                                " Output for the 'car01' variable:"
                                                + "\n   The " + car01.getMake() + "\s" + car01.getModel()
                                                + " is worth $" + car01.getPrice()
                                                + " was built in " + car01.getYear() + ". It is "
                                                + car01.getColor() + ".");
                System.out.println(
                                " Output for the 'car02' variable:"
                                                + "\n   The " + car02.getMake() + "\s" + car02.getModel()
                                                + " is worth $" + car02.getPrice()
                                                + " was built in " + car02.getYear() + ". It is "
                                                + car02.getColor() + ".");
                System.out.println();
                System.out.println("The output from the two variables matches. Great!\n\t...right?");

                System.out.println("It turns out car01 is actually a different color, which affects the price.");
                System.out.println("We update the color and price of car01 with:");
                System.out.println("\tcar01.color = \"Hot Pink\"; and car01.price = 33333");
                car01.setColor("Hot Pink");
                car01.setPrice(33333);

                System.out.println();
                System.out.println("Again, let's print using the values from the two variables.");
                System.out.println(
                                " Output for the 'car01' variable:"
                                                + "\n   The " + car01.getMake() + "\s" + car01.getModel()
                                                + " is worth $" + car01.getPrice()
                                                + " was built in " + car01.getYear() + ". It is "
                                                + car01.getColor() + ".");
                System.out.println(
                                " Output for the 'car02' variable:"
                                                + "\n   The " + car02.getMake() + "\s" + car02.getModel()
                                                + " is worth $" + car02.getPrice()
                                                + " was built in " + car02.getYear() + ". It is "
                                                + car02.getColor() + ".");
                System.out.println();
                System.out
                                .println(
                                                "The values for car02 also changed, that occurs because the two variables have the same reference");
                System.out.println("\tcar01 reference value = " + car01);
                System.out.println("\tcar02 reference value = " + car02);

                System.out.println(
                                "This is called the reference trap. With objects, we can \navoid the trap by using the \"new\" keyword when creating the variable.");
                System.out.println();
                System.out.println("We create a car03 variable using this code: ");
                System.out.println(
                                "   Car car03 = new Car(car01.make, car01.model, car01.price, car01.year, car01.color);");
                Car car03 = new Car(car01);
                System.out.println("car03 is not hot pink, so of course it is cheaper so let's update car03 with:");
                System.out.println("\tcar03.color = \"Silver\"; and car03.price = 6022.15");
                car03.setColor("Silver");
                car03.setPrice(6022.15);

                System.out.println();
                System.out.println("Finally, let's print and compare the values of car01, car02, and car03");
                System.out.println(
                                " Output for the 'car01' variable:"
                                                + "\n   The " + car01.getMake() + "\s" + car01.getModel()
                                                + " is worth $" + car01.getPrice()
                                                + " was built in " + car01.getYear() + ". It is "
                                                + car01.getColor() + ".");
                System.out.println(
                                " Output for the 'car02' variable:"
                                                + "\n   The " + car02.getMake() + "\s" + car02.getModel()
                                                + " is worth $" + car02.getPrice()
                                                + " was built in " + car02.getYear() + ". It is "
                                                + car02.getColor() + ".");
                System.out.println(
                                " Output for the 'car03' variable:"
                                                + "\n   The " + car03.getMake() + "\s" + car03.getModel()
                                                + " is worth $" + car03.getPrice()
                                                + " was built in " + car03.getYear() + ". It is "
                                                + car03.getColor() + ".");
                System.out.println();
                System.out
                                .println(
                                                "We can see that car03 has been updated, and the price and color of the other two cars is unchanged.");

                System.out.println();
                System.out.println(
                                "As confirmation that car03 is truely independent from car01 and car02, here are"
                                                + "\nthe reference values of all three variables:");
                System.out.println("\tcar01 reference value = " + Integer.toHexString(System.identityHashCode(car01)));
                System.out.println("\tcar02 reference value = " + Integer.toHexString(System.identityHashCode(car02)));
                System.out.println("\tcar03 reference value = " + Integer.toHexString(System.identityHashCode(car03)));
                System.out.println();

                System.out.println("Let's drive the car!!! \n\tWe do that by using the drive method we just added...");
                car03.drive();
                System.out.println();
                System.out.println("Let's print the parts for each car");
                System.out.println("car01 parts: " + Arrays.toString(car01.getParts()));
                System.out.println("car02 parts: " + Arrays.toString(car02.getParts()));
                System.out.println("car03 parts: " + Arrays.toString(car03.getParts()));
                System.out.println();
                car03.setParts(new String[] { "22 Inch Dubs", car03.getParts()[1] });
                System.out.println(
                                "Change the value of one part for one car with: \n\tcar03.parts[0] = \"22 inch Dubs\";");
                System.out.println();
                System.out.println("For extra fun, use a static copyCar function to create a fourth car from car03.");
                Car car04 = Car.copyCar(car03);
                System.out.println("\tcar02 reference value = " + Integer.toHexString(System.identityHashCode(car02)));
                System.out.println("\tcar03 reference value = " + Integer.toHexString(System.identityHashCode(car03)));
                System.out.println(
                                "Print the parts for each car again to ensure all cars \nare impacted as appropriate.");
                System.out.println("car01 parts: " + Arrays.toString(car01.getParts()));
                System.out.println("car02 parts: " + Arrays.toString(car02.getParts()));
                System.out.println("car03 parts: " + Arrays.toString(car03.getParts()));
                System.out.println("car04 parts: " + Arrays.toString(car04.getParts()));
                System.out.println();
                System.out.println(
                                "We added the toString() method to the Car class\nwe will use it with: \"System.out.println(car##);\"");
                System.out.println(car01);
                System.out.println(car02);
                System.out.println(car03);
                System.out.println(car04);
                System.out.println(
                                "Result if we use \"System.out.println(car01.toString());\"");
                System.out.println(car01.toString());

                Dealership dealership = new Dealership();

                dealership.setCar(car01, 0);
                dealership.setCar(car02, 1);
                dealership.setCar(car03, 2);
                dealership.setCar(car04, 3);
        }
}