//  import java.util.*;
//  public class minicalculator {
//      public static void main(String[] args){
//         Scanner pd=new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int m=pd.nextInt();
//         System.out.println("Enter operator(+,-,/,%)");
//         char operator=pd.next().charAt(0);
//         System.out.println("Enter second number:");
//         int n=pd.nextInt();
//         if(operator=='+'){
//             System.out.println(m+n);
//         }
//         else if(operator=='-'){
//             System.out.println(m-n);
//         }
//         else if(operator=='*'){
//             System.out.println(m*n);
//         }
//         else if(operator=='/'){
//             System.out.println(m/n);
//         }
//         else if(operator=='%'){
//             System.out.println(m%n);
//         }
//         else{
//             System.out.println("Invalid operation");
//         }
//     }
// }      

import java.util.*;
public class minicalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int operator=sc.nextInt(); //char operator=pd.next().charAt(0);
        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a/b);
                    }
            break;
            case 5 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a%b);
                    }
            break;
            default : System.out.println("Invalid Operator");
        }
    }
}
