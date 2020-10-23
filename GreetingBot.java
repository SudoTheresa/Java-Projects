//program that asks the user for their name and greets them with their name
import java.util.Scanner;

public class GreetingBot{
    public static void main(String[]args){
        System.out.println("Hello. What's your name?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Nice to meet you "+name+"!");
    }
}