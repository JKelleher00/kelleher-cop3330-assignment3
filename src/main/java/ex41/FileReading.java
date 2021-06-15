package ex41;
import java.util.*;
import java.io.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class FileReading {
    public static void main(String args[])throws IOException{
        File OriginalNames = new File("exercise41_input.txt");
        Scanner s = new Scanner(OriginalNames);
        ArrayList FirstList = new ArrayList();
        /*
        while theres still file left
            get names into the array list
        move array list to a string array
        use NameSorter to sort the names
        print the names
         */

        while(s.hasNextLine()){
            FirstList.add(s.nextLine());//using array list because it is dynamic size and we don't know how many names yet
        }
        String TrueList[] = new String[FirstList.size()];
        for(int i = 0;i<FirstList.size();i++){
            TrueList[i] = (String)FirstList.get(i);
        }
        NameSorter ns = new NameSorter();
        TrueList = ns.nameSort(TrueList);
        System.out.println("There are "+TrueList.length+" Names\n----------------------");
        for(int i = 0;i<TrueList.length;i++){
            System.out.println(TrueList[i]);
        }
        s.close();
    }
}
