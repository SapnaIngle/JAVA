package filehandling;

import java.io.*;

public class BufferWriteDemo {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            fileWriter = new FileWriter("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sampleOne.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello Mumbai");
            System.out.println("File write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }   finally{
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        try {
            fileReader = new FileReader("sampleOne.txt");
            bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while(i>0){
                System.out.print((char) i);
                i = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
