                    // 1 
// Print the pattern://1 2
                    // 1 2 3 
                    // 1 2 3 4
                    // 1 2 3 4 5
//Half Pyramid with Numbers
import java.util.*;
public class pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}