package ex46;
import java.util.*;
import java.io.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class WordGetter {
    public static void main(String args[])throws IOException{
        /*
        while theres still words left
            add that word to arraylist
        give to word counter
        print the returned arraylist
         */
        File f = new File("exercise46_input.txt");
        Scanner s = new Scanner(f);
        ArrayList Words = new ArrayList();
        while(s.hasNext()){
            Words.add(s.next());
        }
        WordCounter wc = new WordCounter();
        ArrayList counted = wc.counter(Words);
        for(int i = 0;i<counted.size();i+=2)
            System.out.println((String)counted.get(i)+(String)counted.get(i+1));
    }
}
