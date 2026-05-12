package finalexamprep;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(num <= 1){
            System.out.println("Neither Prime nor Composite");
        }else {
            boolean isPrime = true;
            for(int i = 2; i < num / 2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Number is Prime");
            }else {
                System.out.println("Number is not Prime");
            }
        }
    }
}
