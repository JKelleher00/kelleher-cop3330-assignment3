package ex42;
import java.util.*;
import java.io.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class CSVReader {
    public static void main(String args[]) throws IOException{
        File input = new File("exercise42_input.txt");
        Scanner s = new Scanner(input);
        ArrayList FirstArray = new ArrayList();
        /*
        get input
        send to be parsed
        print
         */
        while(s.hasNextLine()){
            FirstArray.add(s.nextLine());
        }
        String RealArray[] = new String[FirstArray.size()];
        for(int i = 0;i<FirstArray.size();i++)
            RealArray[i] = (String)FirstArray.get(i);
        CSVParser c = new CSVParser();
        String finalArray[][] = c.parseFile(RealArray);
        System.out.println("Last\t\tFirst\t\tSalary");
        System.out.println("------------------------------------");
        for(int i = 0;i<RealArray.length;i++){
            for(int j = 0;j<3;j++){
                System.out.print(finalArray[i][j]+"\t\t");
            }
            System.out.print("\n");
        }
    }
}
