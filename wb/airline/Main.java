
public class Main {
  public static void main(String[] args) {
    Person p01 = new Person("Ryan Slim", "Canadian", "01/01/1111", 5);

    System.out.println(
        "\n\nName: " + p01.getName() + "\nNationality: " + p01.getNationality()
            + "\nDate of Birth: " + p01.getDateOfBirth()
            + "\nSeat Number: " + p01.getPersonNumber() + "\n");

    p01.chooseSeat();

    System.out.println(
        "\nthis.executes 'p01.setSeatNumber(10);'\n  Then..."
            + "\nName: " + p01.getName() + "\nNationality: " + p01.getNationality()
            + "\nDate of Birth: " + p01.getDateOfBirth()
            + "\nSeat Number: " + p01.getPersonNumber() + "\n");

    printPassportApplicationResult(p01);
    /**
     * Using the copy constructor, set a person2 variable
     * equal to a copy of the first object.
     * 
     * Change person2's name & seatNumber to something else.
     * 
     * Use println() to print person2's fields.
     */
    Person p02 = new Person(p01);
    p02.setName("George Washington");
    p02.setSeatNumber(3);

    System.out.println(
        "Using p02 created via constructor copy of p01..."
            + "\nName: " + p02.getName() + "\nNationality: " + p02.getNationality()
            + "\nDate of Birth: " + p02.getDateOfBirth()
            + "\nSeat Number: " + p02.getPersonNumber() + "\n");

    printPassportApplicationResult(p02);
  }

  private static void printPassportApplicationResult(Person passenger) {

    if (passenger.applyPassport()) {
      System.out.println("Congratulations, " + passenger.getName() + ". Your passport was approved!");
    } else {
      System.out.println("We are sorry, " + passenger.getName() + ". We cannot process your passport application.");
    }
    System.out.println();

  }
}
