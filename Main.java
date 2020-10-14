import java.util.Scanner;
/**
 * prints random amount of astericks between 1 and 5
 * @author Jaden Ramcharan
 */
public class Main {
  //prints astericks
  public static void chaotic(int userNum){
    //gets first random number
    int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
    for(int i = 0; i < userNum; i++){
      for(int j = 0; j < randNum; j++){
        //prints the astericks on same line
        System.out.print("*");
      }
    //chooses new amount of asterics and goes to next line
     randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
     System.out.println("");
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    int userNum = input.nextInt();

    //prints astericks
    chaotic(userNum);
  }
}
