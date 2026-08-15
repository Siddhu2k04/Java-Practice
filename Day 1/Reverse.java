import java.util.*;
class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ReverseArray(arr, n);
    }

    static void ReverseArray(int [] arr , int n){
        int temp , left =0, right = n-1;
       
            while (left < right){
                temp = arr[left];
                arr[left] = arr[right] ;
                arr[right] = temp ;

                left ++;
                right --;
        }
        System.out.println(Arrays.toString(arr));
        }
        
        
    }

    
