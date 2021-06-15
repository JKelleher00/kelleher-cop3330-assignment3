package ex43;
import java.io.IOException;
import java.util.*;
public class FileAsker {
    public static void main(String args[])throws IOException {
        /*
        ask questions
        set a boolean for if  they want js and css
        give to FileCreator
        tell them its been made
         */
        Scanner s = new Scanner(System.in);
        System.out.print("Website name: ");
        String website = s.nextLine();
        System.out.print("Author name: ");
        String name = s.nextLine();
        System.out.print("Do you want a js file? ");
        String js = s.nextLine();
        System.out.print("Do you want a css file? ");
        String css = s.nextLine();
        boolean jss, cs;
        if(js.equalsIgnoreCase("y"))
            jss = true;
        else jss = false;
        if(css.equalsIgnoreCase("y"))
            cs = true;
        else cs = false;
        FileCreator fc = new FileCreator();
        fc.create(website,name,jss,cs);
        System.out.println("Created /"+website);
        System.out.println("Created /"+website+"/index.html");
        if(jss)
            System.out.println("Created /"+website+"/js");
        if(cs)
            System.out.println("Created /"+website+"/css");
    }
}
