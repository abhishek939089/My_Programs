import java.util.*;
public class AllEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The Even Numbers are:");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }    
}
