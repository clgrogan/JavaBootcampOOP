public class Airline {
  private Person[] seats;

  public Airline() {
    seats = new Person[11];
  }

  public Person getPerson(int index) {

    return new Person(seats[index]);
  }

  public void setPerson(Person person, int index) {

    seats[index] = new Person(person);

  }

  public void createReservation(Person person) {
    if (person.getSeatNumber() == 0)
      return;
    this.seats[person.getSeatNumber() - 1] = new Person(person);

    System.out.println("Thank you, " + this.seats[person.getSeatNumber() - 1].getName()
        + ", for flying with Java airlines. Your seat number is "
        + +this.seats[person.getSeatNumber() - 1].getSeatNumber()
        + ".\n");

  }
}