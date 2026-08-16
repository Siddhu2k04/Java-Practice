import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc .nextInt();
        int arr[] = new int [n];
        for(int i = 0;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target ");
        int tar = sc.nextInt();

        System.out.println(Arrays.toString(TwoS(arr, n, tar)));

    }

    static int[] TwoS(int arr[], int n , int tar){
        int l =-1  , m = -1;
        for(int i = 0;i<n ;i++){
            for(int j = 0;j<n ;j++){
                if((arr[i] + arr[j] )== tar){
                     l = i ;
                     m = j ;
                     break;
                }
            }
        }
        return new int[]{l , m};
    }
}
