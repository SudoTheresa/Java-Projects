//Program to print the sum of the numbers 1 to n given the value of n by the user
import java.util.Scanner;

public class PrintSum{
    public  static void main(String[]args){
        System.out.println("Enter the last number: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        for (int i=1; i<=num ;i++){
            System.out.println(i);
        }
        }

}