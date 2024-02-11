package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex_08_FileReaderApproach2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();

        while(i != -1){
            System.out.print((char)i);
            i = fr.read();
        }
    }
}
