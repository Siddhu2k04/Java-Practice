import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int[n];
         for(int i = 0;i<n; i++){
            arr[i] = sc.nextInt();
         }
         RMD(arr, n);
        
    }
    static void RMD(int[] arr , int n){
    
        Arrays.sort(arr);
        int non = 0 ;
      
        for(int i = 1;i<n;i++){
            if(arr[i-1] != arr[i]){
                arr[non++]= arr[i-1];
            }
        }
        arr[non++] = arr[n-1];
         int [] a = Arrays.copyOf(arr, non);

        System.out.println(Arrays.toString(a));
    }
}
