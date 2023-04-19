package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// This do not need to close the stream using obj.close
// no need of "finally"
public class TryWithResources {

    public static void main(String[] args) {
        File file = new File("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sampleTwo.txt");

        try(FileOutputStream obj = new FileOutputStream(file)) {
            String str = "Hello Everyone!";
            obj.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
