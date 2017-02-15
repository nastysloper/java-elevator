
/**
 * Class comment goes here.
 *
 * @author Rich Vogt
 */
public class Person {

  private int position;

  private String name;

  public Person(String name) {
    this.position = 1;
    this.name = name;
  }

  public int getPosition() {
    return this.position;
  }

  public String getName() {
    return this.name;
  }

  public void whereAmI() {
    System.out.println(this.getName() + " is on the " + this.getPosition() + " floor.");
  }

  public void callElevator(Elevator elevator) {
    System.out.println("You pressed the call button!");
    elevator.call(this.getPosition());
  }
}
