import java.util.Random;
import java.util.Scanner;

public class Guessing_game {

    public static void main(String[] args){

        int guessCount = 0;

        while (true){
            Scanner reader = new Scanner(System.in);
            System.out.print("Please guess a number: ");
            int numberGuessed = Integer.parseInt(reader.nextLine());
            guessCount++;
            Random rand = new Random();
            int randomNumber = rand.nextInt(40) + 1;

            if (randomNumber < numberGuessed){
                System.out.println("Too high, guess again");
                System.out.println("Guess count: " + guessCount);
            }else if (randomNumber > numberGuessed){
                System.out.println("Too low, guess again!");
                System.out.println("Guess count: " + guessCount);
            }else {
                System.out.println("Congratulation you guessed right!");
                break;
            }

        }

    }
}
