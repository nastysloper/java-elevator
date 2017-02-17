import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

  @Before
  public void doingItBefore() {
    System.out.println("Setting up to run the tests!");
  }

  @After
  public void doingItAfter() {
    System.out.println("Doing it after our tests!");
  }

  @Ignore
  @Test
  public void getPosition() throws Exception {

  }

  @Ignore
  @Test
  public void getName() throws Exception {

  }

  @Ignore
  @Test
  public void whereAmI() throws Exception {

  }

  @Ignore
  @Test
  public void callElevator() throws Exception {

  }

  @Test
  public void getInElevator() throws Exception {
    Person randyRider = new Person("Randy");
    randyRider.getInElevator();
    assertEquals(true, randyRider.isInElevator());
  }

  @Test
  public void getOutOfElevator() throws Exception {
    Person suzyWalker = new Person("Suzy");
    suzyWalker.getOutOfElevator();
    assertEquals(false, suzyWalker.isInElevator());
  }

}