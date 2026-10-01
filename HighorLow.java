import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random generator = new Random();

        int targetNumber = generator.nextInt(10) + 1;  // val is 1 to 10

        int userGuess = 0;
        String trash = "";
        boolean done = true;

        done = false;
        do {
            IO.print("Guess a number between 1 and 10 (inclusive): ");

            if (in.hasNextDouble()) {
                userGuess = in.nextInt();
                in.nextLine();

                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    IO.println("You entered " + userGuess + ", which is out of range (must be 1-10)");
                }
            } else {
                trash = in.nextLine();
                IO.println("You must enter a done Integer, not " + trash);
            }
        } while (!done);

        IO.println("The target random was: " + targetNumber);

        if (userGuess == targetNumber) {
            IO.println("Your guess was right!");
        } else if (userGuess > targetNumber) {
            IO.println("Your guess was too high!");
        } else {
            IO.println("Your guess was too low!");
        }


    }


}
