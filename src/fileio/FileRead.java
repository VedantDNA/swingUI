package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("notes.txt");
            int ch;
            while ((ch = reader.read()) != -1){
                System.out.println((char) ch);
            }
            reader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
