                    //    *
//Print the pattern://   **
                    //  *** 
                    // ****
                    //*****
//Inverted Half Pyramid(rotated by 180 deg) 
import java.util.*;
public class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}