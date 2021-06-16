package ex46;

import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class WordCounter {
    /*
    take arraylist
    for each word in the list
        if word has been repeated
            add an asterisk to the string
        else add the word to the list
    return the arraylist
     */
    public ArrayList counter(ArrayList words){
        ArrayList counted = new ArrayList();
        counted.add(words.get(0));
        counted.add(":\t*");
        for(int i = 1;i<words.size();i++){
            int check = 0;
            for(int j = 0;j<counted.size();j++){
                if(words.get(i).equals(counted.get(j))) {
                    counted.set(j+1, counted.get(j+1) + "*");
                    check = 1;
                }
            }
            if(check==0) {
                counted.add(words.get(i));
                counted.add(":\t*");
            }
        }
        return counted;
    }
}
