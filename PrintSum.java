//Program to print the sum of the numbers 1 to n given the value of n by the user
import java.util.*;

public class PrintSum{

    public  static void main(String[]args){
        System.out.println("Enter the last number: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        ArrayList<Integer>listNum = new ArrayList<Integer>();
        for (int i=1; i<=num ;i++){
            System.out.println(i);
            listNum.add(i);
        }
        threeMultiples(listNum, num);
        }

        public static void threeMultiples(ArrayList<Integer>tm,int num){

        //prints only multiples of 3 in the above range
            System.out.println("The multiples of 3 in the range 1 to "+ num +" are ");
            for(int number:tm){
                if(number%3==0){
                    System.out.println(number);
            }}
        }

}