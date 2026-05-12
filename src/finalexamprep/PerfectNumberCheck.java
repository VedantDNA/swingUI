package finalexamprep;

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check: ");
        int num = sc.nextInt();
        int sum = 0;

        if(num > 0){
            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    sum += i;
                }
            }
        }

        if(sum == num) System.out.println("Number is Perfect");
        else System.out.println("Number is Imperfect");

        sc.close();
    }
}
