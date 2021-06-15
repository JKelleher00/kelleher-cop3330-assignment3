package ex44;

import com.google.gson.Gson;
import java.io.*;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class jsonReader {
    Gson g = new Gson();
    /*
    get list from gson and fill a 2d array with it
    send to be searched
    return string to be printed
     */
    public String search(String index) throws IOException{
        String values[][] = {{"","",""},{"","",""},{"","",""}};
        Reader r = new FileReader("exercise44_input.json");
        Object json = g.fromJson(r,Object.class);
        String s = json.toString();
        values[0][0] = s.substring(17,23);
        values[0][1] = s.substring(31,35);
        values[0][2] = s.substring(46,49);
        values[1][0] = s.substring(58,63);
        values[1][1] = s.substring(71,75);
        values[1][2] = s.substring(86,89);
        values[2][0] = s.substring(98,104);
        values[2][1] = s.substring(112,115);
        values[2][2] = s.substring(126,130);
        return actualSearch(values,index);
    }
    private String actualSearch(String[][] terms, String index){
        String toPrint = "";
        for(int i = 0;i<terms.length;i++){
            if(terms[i][0].equalsIgnoreCase(index))
                toPrint = "Name: "+terms[i][0]+"\nPrice: "+terms[i][1]+"\nQuantity: "+terms[i][2];
        }
        if(toPrint.equals(""))
            toPrint = "Sorry, that product is not found in our inventory";
        return toPrint;
    }
}
