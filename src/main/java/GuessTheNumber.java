import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int userNumber = 0;
        int iterations = 0;

        //System.out.println(number);

        System.out.println("Guess the number between 1-100 \nEnter your choice:");

        while(number != userNumber) {
            try {
                userNumber = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a valid digit next time you silly.");
                break;
            }

            if(userNumber > 100 || userNumber < 0) {
                System.out.println("Please enter a number from 1-100 range!");
                continue;
            }
            iterations++;
            if (userNumber > number) System.out.println("Try smaller number.");
            else if (userNumber < number) System.out.println("Try higher number.");
            else {
                System.out.println("You guessed right! It took you " + iterations + " guesses.");
                break;
            }
        }
    }
}
