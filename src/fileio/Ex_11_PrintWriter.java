package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex_11_PrintWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");
        PrintWriter out = new PrintWriter(fw);

        out.write(100);
        out.println(1000);
        out.println(true);
        out.println('c');
        out.println("durga");
        out.flush();
        out.close();
    }
}
