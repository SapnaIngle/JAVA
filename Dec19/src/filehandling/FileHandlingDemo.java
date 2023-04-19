package filehandling;

import java.io.*;

// fileoutputstream to write a file
// fileinputstream to read

public class FileHandlingDemo {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sample.txt");
        try {
            FileOutputStream obj = new FileOutputStream(file);
            String str = "Welcome";
            obj.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream obj = new FileInputStream(file);
            int i = obj.read();
            while (i > 0) {
                System.out.println((char) i);
                i = obj.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
