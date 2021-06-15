package ex41;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class NameSorter {
    public String[] nameSort(String[] names){
        /*
        for every name
            reset index and lowest possible value of swap
            for every name past the current one
                compare current name to each one past it
                if current name is alphabetically later more than current value of swap
                    change swap value to how much
                    change index value to where the new name is
            if index was changed from its initial reset
                swap current  name and one alphabetically farthest from it
         */
        for(int i = 0;i<names.length;i++){
            String temp = "";
            int swap = 0, index = 0;
            for(int j = i;j<names.length;j++){
                if(names[i].compareTo(names[j])>swap){
                    swap = names[i].compareTo(names[j]);
                    index = j;
                }
            }
            if(index!=0){
                temp = names[i];
                names[i] = names[index];
                names[index] = temp;
            }
        }
        return names;
    }
}
