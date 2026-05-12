package learnfileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnFileRead {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("notes.txt");
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
            System.out.println();
            reader.close();
        }catch (IOException e){
            System.err.println("File Not Found: " + e.getMessage());
        }

        try {
            System.out.println("======== Buffered File Reader ========");
            FileReader reader = new FileReader("notes.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
            bufferedReader.close();
        }catch (IOException e){
            System.err.println("File Not Found: " + e.getMessage());
        }
    }
}
