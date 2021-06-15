package ex44;

import java.io.IOException;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class JsonAsker {
    public static void main(String args[])throws IOException{
        /*
        ask for search term
        print
        if rejected
            run it back
        if not
            leave.
         */
        jsonReader jr = new jsonReader();
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(i == 0) {
            System.out.print("Enter a search term: ");
            String out = jr.search(s.nextLine());
            System.out.println(out);
            if(out.equals("Sorry, that product is not found in our inventory")) {
                continue;
            }
            else break;
        }
    }
}
