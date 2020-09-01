import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String arg[]){
        System.out.println("Welcome To The Game");
        System.out.println("Enter your name: ");

        Scanner input = new Scanner(System.in);
        String userName = input.next();

        System.out.println("Presenting you the RandomGuessing Game "+userName+" !");
        System.out.println("Shall we begin.?");
        System.out.println("\t1. Yessss.!");
        System.out.println("\t2. Nope.");

        int userInput = input.nextInt();

        while(userInput != 1)
        {
            System.out.println("Shall we begin.?");
            System.out.println("\t1. Yessss.!");
            System.out.println("\t2. Nope.");

            userInput = input.nextInt();
        }

        Random x = new Random();
        int number = x.nextInt(20)+1;

        System.out.println("Guess the Random number: ");
        int userNumber = input.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean isOver = false;

        while(!isOver)
        {
            timesTried++;
            if(timesTried<=5)
            {
                if(userNumber == number)
                {
                    hasWon = true;
                    isOver = true;
                }
                else if(userNumber > number){
                    System.out.println("Try a smaller value.!");
                    userNumber = input.nextInt();
                }
                else{
                    System.out.println("Try a greater value.!");
                    userNumber = input.nextInt();
                }
            }
            else{
                isOver = true;
            }
        }

        if(hasWon){
            System.out.println("WINNERRRRRR.!!!");
            System.out.println("You've guessed the Random number "+number+" in just "+timesTried+" guess.!");
        }
        else{
            System.out.println("GAME OVER.");
            System.out.println("You've exceeded the trial limit.");
            System.out.println("The number was "+number);
        }
    }
    
}