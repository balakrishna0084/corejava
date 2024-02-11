package fileio;

import java.io.File;
import java.io.IOException;

public class Ex_01_CreateFileWIthinCurrentWorkingDirectory {
    public static void main(String[] args) throws IOException {

        // write code to create a file named with abc.txt in current working directory
        File f = new File("abc.txt");
        f.createNewFile();
    }
}
