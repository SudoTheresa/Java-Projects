//Q8 Program prints all prime numbers from 0 to N which is the last number
//
import java.util.*;

public class PrimeNumbers{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the last number (N): ");
        int largestNum = keyboard.nextInt();
        int count; //we are going to count the number of divisions
        System.out.println("The prime numbers from 0 to "+ largestNum+ " are: ");
        for(int i =2; i<=largestNum; i++){ // 0 and 1 are not prime numbers
            count =0;
            for(int j=1; j<=i; j++){
            if((i%j==0)){
                //prime number condition
                count++; //a prime number is only divisible twice i.e by 1 and itself
            }
            }
            if (count==2)//divisible twice i.e by 1 and itself
            {
                System.out.println(i+" ");
            }

        }
    }
}