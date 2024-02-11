package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class Ex_06_FileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");

        fw.write(100); // adding a single character
        fw.write("urga\nSoftwareSolutions");
        fw.write('\n');

        char[] ch1 = {'a', 'b', 'c'};
        fw.write(ch1);
        fw.write('\n');

        fw.flush();
        fw.close();
    }
}

// In the above program FileWriter can perform overriding of existing data, instead of overriding if we want append operation then
// we have to create FileWriter Object as follows
//  FileWriter fw = new FileWriter("abc.txt", true);

