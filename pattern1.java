                    //***** 
//Print the pattern://****
                    //***
                    //** 
                    //*
//Inverted Half Pyramid
import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int m=sc.nextInt();
        for(int i=m;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
