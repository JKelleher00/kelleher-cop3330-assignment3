package ex43;
import java.io.*;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Kelleher
 */
public class FileCreator {//no return, no testing required.
    /*
    send name/author to be made
    if they want a js, send for that too
    if they want css, that too
     */
    public void create(String name, String author, boolean js, boolean css)throws IOException{//created in project directory
        createFirst(name,author);
        if(js)
            createJS(name);
        if(css)
            createCSS(name);
    }
    private void createFirst(String name, String author)throws IOException{
        File f = new File(name);
        boolean b = f.mkdir();
        FileWriter fw1 = new FileWriter(name+"/index.html");
        PrintWriter output = new PrintWriter(fw1);
        output.print("<title> "+name+"</title\n<meta name=\"Author Name\" Content = \""+author+"\" />");//Im not an html guy I hope this is right
        fw1.close();
    }
    private void createJS(String name)throws IOException{
        FileWriter fw = new FileWriter(name+"/js/");
        fw.close();
    }
    private void createCSS(String name)throws IOException{
        FileWriter fw = new FileWriter(name+"/css/");
        fw.close();
    }
}
