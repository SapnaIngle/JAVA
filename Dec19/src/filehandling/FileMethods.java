package filehandling;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileMethods {
    public static void main(String[] args) {

        File file = new File("D:\\FULL STACK WEB\\JAVA\\Dec19\\src\\filehandling\\sapna.txt");

        try{
            if(file.exists()){
                System.out.println("File is already created");
            } else{
                Boolean b = file.createNewFile();
                System.out.println(b);
            }
            System.out.println(file.isFile());
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.compareTo(new File("sapna.txt")));
            System.out.println(file.getFreeSpace());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getUsableSpace());
            System.out.println(file.getParent());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


