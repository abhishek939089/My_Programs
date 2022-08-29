// import java.util.*;
// public class PrimeOrNot {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number to check prime or not:");
//         int n=sc.nextInt();
//         if(n%2!=0){
//             System.out.println("Prime number");
//         }else{
//             System.out.println("given number is not prime:");
//         }

//     }
// }

import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if(n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
    }
}