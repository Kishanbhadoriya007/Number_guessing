import java.util.Scanner;
import java.util.Random;

public class Number_guessing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        while (play.equals("yes")) 
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            
            System.out.println("chose a number between 0 and 100.          !");
            while (guess != randNum) 
            {
                
                guess = reader.nextInt();
                tries++;

                if (guess < randNum) 
                {
                    System.out.println("Your guess is too low");
                } 
                else if (guess > randNum) 
                {
                    System.out.println("Your guess is too high");
                } 
                else 
                {
                    System.out.println("You guessed the number!");
                    System.out.println("It took you " + tries + " tries");
                    System.out.println("Would you like to play again? (yes/no)");
                    play = reader.next();
        }       }
            if (play.equals("no")) 
            {
                System.out.println("Thanks for playing!");
                break;
            }
            else if (!play.equals("yes")) 
            {
                while (!play.equals("yes")) 
                {
                    System.out.println("Please enter yes or no");
                    play = reader.next();
                }
        

        
    }


            }
        }
    }

