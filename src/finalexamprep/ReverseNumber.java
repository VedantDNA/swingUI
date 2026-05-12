package finalexamprep;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 223463222;
        int org = num;
        int reverse = 0;

        while (num > 0){
            int last = num % 10;
            reverse = (reverse * 10) + last;
            num = num / 10;
        }

        System.out.println(reverse);
    }
}
