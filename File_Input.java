import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
public class File_Input{
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("C:\\Users\\GLAUME\\Desktop\\Image\\GLA.jpg");
        FileOutputStream fos = new FileOutputStream("NewImage.jpg");
        int i;

        while((i = fis.read()) != -1){
            fos.write(i);
        }

        fis.close();
        fis.close();
    }
}