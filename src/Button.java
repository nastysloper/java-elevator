/**
 * This class holds functionality used by buttons in an elevator as well as the buttons
 * on a floor used to call an elevator.
 *
 * @author Rich Vogt
 */
public abstract class Button {

  private boolean isLighted;

  public void press() {
    this.isLighted = true;
  }

  public boolean isLighted() {
    return this.isLighted;
  }
}
