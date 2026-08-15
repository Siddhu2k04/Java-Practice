
import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size "); 
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Serach item "); 
        int item = sc.nextInt();
        
        System.out.println("Element fount at "+Serach(arr, item, n)+" Position");
    }

    static int Serach(int[] arr, int item , int n){
        
        int pos = -1;
        for(int i = 0;i<n;i++){ 
            if(arr[i] == item){
                pos = i ;
               break ;
            }
        }

        if(pos == -1){
            System.out.println("Element not found ");
            
        }
        return pos ;
    }
}
