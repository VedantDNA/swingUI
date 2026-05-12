package finalexamprep;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int temp = n;
        int temp1 = n;
        int sum = 0;
        int digit = 0;

        while (temp > 0){
            digit++;
            temp = temp / 10;
        }

        while (temp1 > 0){
            int num = temp1 % 10;
            int pow = 1;
            for(int i = 1; i <= digit; i++){
                pow = num * pow;
            }

            sum = sum + pow;
            temp1 = temp1 / 10;
        }

        if(n == sum) System.out.println("Armstrong number");
    }
}
