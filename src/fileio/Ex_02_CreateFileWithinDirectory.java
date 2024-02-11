package fileio;

import java.io.File;
import java.io.IOException;

public class Ex_02_CreateFileWithinDirectory {
    public static void main(String[] args) throws IOException {

        // write code to create a directory named with durga123 in current working directory, and create a file named with demo.txt in that directory
        File f = new File("durga123");
        f.mkdir();

        // File f1 = new File("durga123", "demo.txt");
        File f1 = new File(f, "demo.txt");
        f1.createNewFile();
    }
}
