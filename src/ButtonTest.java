import org.junit.Test;

import static org.junit.Assert.*;

public class ButtonTest {

  @Test
  public void press() throws Exception {
    FloorButton floorButton = new FloorButton();
    floorButton.press();
    assertEquals(floorButton.isLighted(), true);
  }

}