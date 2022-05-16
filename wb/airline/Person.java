
public class Person {
  private String name;
  private String nationality;
  private String dateOfBirth;
  private String[] passport;
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
  }

  public void applyPassport() {

  }

  public void chooseSeat() {

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

}
