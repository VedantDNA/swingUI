package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Hello Therer \n");
            writer.write("These are my notes !!!\n");
            writer.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt", true));
            bw.write("This is coming from BufferWriter");
            bw.newLine();
            bw.write("We have a test today\n");
            bw.close();

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
