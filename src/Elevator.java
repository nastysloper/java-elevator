

/**
 * Class comment goes here.
 *
 * @author Rich Vogt
 */
public class Elevator {

  private int position;
  private boolean isMoving;

  public Elevator() {
    this.position = 0;
    this.isMoving = false;
  }

  public int getPosition() {
    return this.position;
  }

  public void call(int targetFloor) {
    this.position = targetFloor;
  }

  public boolean hasArrived(Person person) {
    if (person.getPosition() == this.getPosition()) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isMoving() {
    return this.isMoving;
  }

  public void moveToTargetFloor() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e){
      Thread.currentThread().interrupt();
    }
  }
}
