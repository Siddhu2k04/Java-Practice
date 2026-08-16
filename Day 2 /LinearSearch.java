import java.util.*;
class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n ;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter target :");
        int tar = sc.nextInt();

        System.out.println("Search element is found at "+Search(arr, n, tar));

    }

    static int Search(int[] arr, int n , int tar){
        for(int i = 0;i<n ;i++){
            if(arr[i]== tar){
                return i ;
            }
        }

        return -1;
    }
}
