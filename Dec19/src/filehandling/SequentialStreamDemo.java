package filehandling;

import java.io.*;

public class SequentialStreamDemo {


    // read
    // SequenceInputStream : read two files
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sample.txt");
            FileInputStream fileInputStream1 = new FileInputStream("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sampleOne.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream);
            int i = sequenceInputStream.read();
            while(i>0){
                System.out.println((char) i);
                i = sequenceInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // write
        // have to use  ByteArrayOutputStream to write two file together.
        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sapna.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\Dreamo.txt");

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = "Gracias";
            byte[] arr = str.getBytes();

            byteArrayOutputStream.write(arr);
            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            System.out.println("File write successfully");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
