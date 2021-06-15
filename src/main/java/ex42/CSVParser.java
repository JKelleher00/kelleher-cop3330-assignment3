package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class CSVParser {
    public String[][] parseFile(String[] old){
        /*
        for each line
            for length of the string
                add each char to new string last name until comma
                then do the same, skipping the comma, for first name
                then skip the next comma and do the same for salary
                whos getting paid 14k a year? the hell?
         */
        String[][] next = new String[old.length][3];
        for(int i = 0;i<old.length;i++){
            int counter = 0;
            next[i][0] = "";
            next[i][1] = "";
            next[i][2] = "";
            for(int j = 0;j<old[i].length();j++){
                if(counter == 0){
                    if(old[i].charAt(j)==','){
                        counter = 1;
                        continue;
                    }
                    else next[i][0] = next[i][0] + old[i].charAt(j);
                }
                else if(counter == 1){
                    if(old[i].charAt(j)==','){
                        counter = 2;
                        continue;
                    }
                    else next[i][1] = next[i][1] + old[i].charAt(j);
                }
                else if(counter == 2) next[i][2] = next[i][2] + old[i].charAt(j);
            }
        }
        return next;
    }
}
