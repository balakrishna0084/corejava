package fileio;

import java.io.File;
import java.io.IOException;

public class Ex_03_CreateFileInSpecifiedLocation {
    public static void main(String[] args) throws IOException {

        // write code to create a file named with abc.txt in E://xyz folder

       // File f= new File("E://xyz", "abc.txt");
        File f= new File("//Users//bala//Documents", "abc.txt");

        f.createNewFile();
    }
}
