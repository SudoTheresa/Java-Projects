import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[]args){
        System.out.println("Which multiplication table do you want to print?");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("The multiplication table for "+number+" is:");
        for(int i=1;i<=10;i++){
            System.out.println(number*i);
        }
    }
}