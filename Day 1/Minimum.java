import java.util.*;
class Minimum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        
        
        System.out.println("Minimum  "+min(arr));
    }

    static int min(int[] arr){
        int minimum = arr[0] ;

        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]< minimum){
                minimum = arr[i];
            }else{
                i++;
            }
        }
        return minimum ;
    }
}