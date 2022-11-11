import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;

public class File_Writer {
    public static void main(String args[])throws IOException{
        FileWriter fw=new FileWriter("cricket.txt");
        PrintWriter out=new PrintWriter(fw);
        out.write(99);
        out.println(100);
        out.println(true);
        out.println('c');
        out.println("bhaskar");
        out.flush();

        // InputStreamReader r=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(r);
        // String name = br.readLine();
        // System.out.println(name);


        // Console c = System.console();
        // String s = c.readLine();
        // char[] s = c.readPassword();
        // System.out.println(Arrays.toString(s));

    }    
}
