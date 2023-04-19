package filehandling;

import java.io.*;

// BufferedOutputStream :- write
// BufferedInputStream :- read

public class BufferOutputStreamDemo {

    public static void main(String[] args) {
        File file = new File("D:/FULL STACK WEB/JAVA/Dec19/src/filehandling/sample.txt");

        try {
            FileOutputStream obj = new FileOutputStream(file);  //Bytestream
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(obj);
            String str = "Welcome in Pune";
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.close();
            obj.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    // BufferedInputStream
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
