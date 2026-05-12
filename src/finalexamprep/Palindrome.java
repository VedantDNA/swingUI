package finalexamprep;

import javax.sound.midi.Soundbank;

public class Palindrome {
    public static void main(String[] args) {
        String given = "MADAM";
        String org = given.toLowerCase();
        String reverse = "";

        for(int i = org.length() - 1; i >= 0; i-- ){
            reverse += org.charAt(i);
        }


        if(reverse.equals(org)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not A Palindrome");
        }
    }
}
