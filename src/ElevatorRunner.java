import java.util.Scanner;

class ElevatorRunner {

  public static void main(String[] args) {
    System.out.println("Welcome to Elevator!");
    System.out.println("Would you like to call the elevator?");
    Scanner userInput = new Scanner(System.in);
    String answer = userInput.next();
      if (answer.equals("yes")) {
          System.out.println("The elevator will be here shortly!");
      } else {
          System.out.println("You chose the stairs!");
      }
  }
}
