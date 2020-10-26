//Program to print the sum of the numbers 1 to n given the value of n by the user
//computes the sum of the range 1 to n
//computes the product of the range 1 to n
//finds multiples of three in the range 1 to n
import java.util.*;

public class PrintSum{

    public  static void main(String[]args){
        System.out.println("Enter the last number of your range: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        //keyboard.close();
        ArrayList<Integer>listNum = new ArrayList<Integer>();
        for (int i=1; i<=num ;i++){
            listNum.add(i);
        }
        threeMultiples(listNum, num);
        System.out.println();


        System.out.println("Would you like to print the sum(S) of the range or the multiples(M)? Type letter and press Enter.");
        String letter=keyboard.next();
        if (letter.equalsIgnoreCase("M")){
            System.out.println("The product of numbers 1 to "+num+" is "+multiple(listNum)+".");
        }
        else if(letter.equalsIgnoreCase("S")){
            System.out.println("The sum of numbers 1 to "+num+" is "+printSum(listNum)+".");
        }
        else {System.out.println("Invalid output");}
        }

        public static void threeMultiples(ArrayList<Integer>tm,int num){

        //prints only multiples of 3 in the above range
            System.out.print("The multiples of 3 in the range 1 to "+ num +" are ");
            for(int number:tm){
                if(number%3==0){
                    System.out.print(number+" ");

            }}
        }

        public static int printSum(ArrayList<Integer>listnum){
        int sum =0;
            for(int n:listnum){
                sum=sum+n;
            }
            return sum;
        }

        public static int multiple(ArrayList<Integer>listnum){
            int product =1;
            for(int n:listnum){
                product=product*n;
            }
            return product;
        }
}