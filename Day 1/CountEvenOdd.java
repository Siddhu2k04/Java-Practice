import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int arr[] = new int[n];

      for(int i = 0;i<n ;i++){
        arr[i] = sc.nextInt();
      }

System.out.println("Even Count is "+countE(arr));
System.out.println("Odd Count is "+CountO(arr));
    }

    static int countE(int[] arr){
        int Ceven  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                Ceven ++;
            }
        }

        return Ceven;
    }

    static int CountO(int[] arr){
        int Codd = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]% 2 != 0){
                Codd++;
            }
        }
        return Codd;
    }
}
