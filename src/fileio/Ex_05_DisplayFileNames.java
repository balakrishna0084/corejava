package fileio;

import java.io.File;

public class Ex_05_DisplayFileNames {
    public static void main(String[] args) {

        //To display only file names
        int count = 0;
        File f= new File("//Users//bala//development//workspace//junit//1.00-starting-project");
        String[] s = f.list();
        for(String s1: s){
            File f1 = new File(f, s1);
            if(f1.isFile()){
                count ++;
                System.out.println(s1);
            }
         }
        System.out.println("Total no: "+count);
    }
}

// To display only directory names
// In the above program we have to replace isFile() with isDir()
