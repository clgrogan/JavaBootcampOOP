import java.util.Arrays;

public class Person {
  private String name;
  private String nationality;
  private String dateOfBirth;
  private String[] passport = new String[3];
  private int personNumber;

  public Person(String name,
      String nationality,
      String dateOfBirth,
      int personNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.personNumber = personNumber;
  }

  public Person(Person source) {
    this.name = source.getName();
    this.nationality = source.getNationality();
    this.dateOfBirth = source.getDateOfBirth();
    this.personNumber = source.getPersonNumber();
    this.passport = Arrays.copyOf(source.passport, source.passport.length);
  }

  /**
   * Function name: applyPassport
   * 
   * @return (boolean)
   *
   *         Inside the function:
   *         1. Returns a random boolean of true or false.
   */
  public boolean applyPassport() {
    return (((int) (Math.random() * 10))) % 2 == 0;
  }

  /**
   * Function name: chooseSeat
   *
   * Inside the function:
   * 1. Sets this.seat to a random number between 1 -- 11.
   */
  public void chooseSeat() {
    this.setSeatNumber((int) (Math.random() * 11 + 1));

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public void setSeatNumber(int seatNumber) {
    this.personNumber = seatNumber;
  }

  public String getName() {
    return name;
  }

  public String getNationality() {
    return nationality;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public int getPersonNumber() {
    return personNumber;
  }

  public String[] getPassport() {
    return Arrays.copyOf(this.passport, this.passport.length);
  }

  public void setPassport() {
    this.passport[0] = this.name;
    this.passport[01] = this.nationality;
    this.passport[02] = this.dateOfBirth;
  }

  public String toString() {
    String returnString;
    returnString = "Name: " + name + "\n" + "Nationality: " +
        nationality + "\n" + "Date of Birth: " +
        dateOfBirth + "\n" + "Seat Number: " +
        personNumber + "\n" + "Passport: " +
        Arrays.toString(passport) + "\n";
    return returnString;
  }

  public int getSeatNumber() {
    return this.personNumber;
  }
}
