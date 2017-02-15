

/**
 * Class comment goes here.
 *
 * @author Rich Vogt
 */
public class Elevator {

  private int position;

  public Elevator() {
    this.position = 0;
  }

  public int getPosition() {
    return this.position;
  }

  public void call(int targetFloor) {
    this.position = targetFloor;
  }
}
