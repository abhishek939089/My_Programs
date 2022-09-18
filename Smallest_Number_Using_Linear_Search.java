import java.util.*;
// Smallest number in Array--------->>>>>
public class Smallest_Number_Using_Linear_Search {
    public static int getSmallest(int numbers[]){
        int Smallest = Integer.MAX_VALUE; //+Infinity....

        for(int i=0 ; i<numbers.length ;i++){
            if(Smallest>numbers[i]){
                Smallest = numbers[i];
            }
        }
        return Smallest;

    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("Smallest value is  :"+getSmallest(numbers));
    }    
}
