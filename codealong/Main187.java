public class Main187 {
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
    System.out.println(dealership);
  }
}