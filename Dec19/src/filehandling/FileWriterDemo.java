package filehandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileWriter = new FileWriter("sampleOne.txt");
            fileWriter.write("Sapna Ingle");
            System.out.println("File Write Successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            fileReader = new FileReader("sampleOne.txt");
            int i = fileReader.read();
            while(i>0){
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
