package ex45;
import java.util.*;
import java.io.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class Replacer {
    /*
    read from file
    replace
     */
    public String ReadnReplace(String old, String neww)throws IOException{
        File f = new File("exercise45_input.txt");
        Scanner s = new Scanner(f);
        String inp = "";
        while(s.hasNextLine()){
            inp = inp + s.nextLine() + "\n";
        }
        inp = inp.replace(old,neww);//this method TECHNICALLY does 2 things but come on the replace is LITERALLY ONE LINE
        return inp;
    }
}
