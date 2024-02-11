package fileio;

import java.io.File;

public class Ex_04_DisplayFileNamesAndDirectoryNames {
    public static void main(String[] args) {

        // write a program to display all files and directories present in /Users/bala/development/workspace/junit
        int count = 0;
        File f= new File("//Users//bala//development//workspace//junit//1.00-starting-project");
        String[] s = f.list();
        for(String s1: s){
            count ++;
            System.out.println(s1);
        }
        System.out.println("Total no: "+count);
    }
}
