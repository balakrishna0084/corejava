package fileio;

import java.io.*;

public class Ex_14_FileExtraction {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("output.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
        String line1 = br1.readLine();

        while(line1 != null){
            boolean available = false;
            BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
            String target = br2.readLine();

            while(target != null){
                if(line1.equals(target)){
                    available = true;
                    break;
                }
                target = br2.readLine();
            }

            if(available == false){
                pw.println(line1);
            }
            line1 = br1.readLine();
        }
        pw.flush();
    }
}
