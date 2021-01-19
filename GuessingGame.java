/**Guessing game where the user has to guess a secret number.
After every guess the program tells the user whether
their number was too large or too small.
At the end the number of tries needed should be printed**/
import java.util.*;
import java.lang.*;

public class GuessingGame{
    public static void main(String[]args){
        Random rand = new Random();
        int secretNum = rand.nextInt(50);
        int count=0;
        System.out.println(secretNum);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 50.");
        int guess = keyboard.nextInt();
        while(guess!=secretNum){
            if(guess>secretNum && Math.abs(guess-secretNum)>5){
                System.out.println("Number is too big guess again.");
                count++;
                guess=keyboard.nextInt();
                }
            else if(guess<secretNum && Math.abs(guess-secretNum)>5){
                System.out.println("Number is too small guess again.");
                count++;
                guess=keyboard.nextInt();
            }
            else if(Math.abs(guess-secretNum)<=5){
                System.out.println("You're almost close to the number");
                count++;
                guess=keyboard.nextInt();
                }
        }
        System.out.println("Congrats you've guessed the number correct in "+ count+" tries!");
        }
}