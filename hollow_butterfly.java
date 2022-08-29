import java.util.*;
public class hollow_butterfly {
    public static void main(String[] args){
        int n=5;
        // upper half
        for(int i=1;i<=n;i++){
            // 1st part
            for(int j=1;j<=i;j++){
                if(j==1 || j==i ){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            // for(int j=1;j<=i;j++){
            //     if(j==2*n || (i+j))
            //     System.out.print("*");
            }
            System.out.println();
    }
}

