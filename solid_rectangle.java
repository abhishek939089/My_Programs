                    //*****
//Print the pattern://*****
                    //*****
                    //*****
                    //.....so on    
import java.util.*;
public class solid_rectangle {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter m range:");
         int m=sc.nextInt();
         System.out.println("Enter n range:");
         int n=sc.nextInt();
         for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
}
// import java.util.*;
// public class solid_rectangle {
//     public static void main(String args[]){
//         int m=4;
//         int n=5;
//         for(int i=1 ; i<=m ; i++){
//             for(int j=1 ; j<=n ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
//}

