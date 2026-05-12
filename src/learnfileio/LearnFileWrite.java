package learnfileio;

import fileio.FileWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LearnFileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("newNotes.txt");
            writer.write("This is the Beginning of a Journey to the depths of the Appalachian Mountains. \n");
            writer.write("It was dense with fauna, misty as fuck and swampy as shit. \n");
            writer.close();
        }catch (IOException e){
            System.err.println("Unable to Complete Write: " + e.getMessage());
        }

        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("newNotes.txt",true));
            buffWriter.write("Line 1: Buffered Writer is Faster");
            buffWriter.newLine();
            buffWriter.write("Line 2: This is after using buffWriter.newLine() to start on a New Line");

            buffWriter.close();
        }catch (IOException e){
            System.err.println("Unable to Complete Write: " + e.getMessage());
        }
    }
}
