import java.util.Scanner;

class ElevatorRunner {

  public static void main(String[] args) {
    System.out.println("Welcome to Elevator!");
    System.out.println("Would you like to call the elevator? Please enter 'yes' or 'no':");
    Scanner userInput = new Scanner(System.in);
    String answer = userInput.next();
      if (answer.equals("yes")) {
          System.out.println("The elevator will be here shortly!");
          startGame();
      } else {
          System.out.println("You chose the stairs!");
      }
  }

  private static void startGame() {
    Elevator elevator = new Elevator();
    Person rich = new Person("Rich");
    rich.whereAmI();
    rich.callElevator(elevator);
    if (elevator.hasArrived(rich)) {
      rich.getInElevator();
      elevator.moveToTargetFloor();
      while(elevator.isMoving()) {
        System.out.println("The elevator is moving.");
      }
      rich.getOutOfElevator();
    } else {
      System.out.println("Still waiting!");
    }
  }
}
