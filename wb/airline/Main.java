package wb.airline;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person p01 = new Person("Ryan Slim", "Canadian", "01/01/1111", 5);

    System.out.println(
        "\n\nName: " + p01.getName() + "\nNationality: " + p01.getNationality()
            + "\nDate of Birth: " + p01.getDateOfBirth()
            + "\nSeat Number: " + p01.getPersonNumber() + "\n");
  }
}
