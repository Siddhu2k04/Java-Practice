import java.util.*;
public class CountP_N_Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int [n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Positive count is "+CountP(arr));
        System.out.println("Negitave count is "+CountN(arr));
        System.out.println("Zero count is "+CountZ(arr));

    }

    static int CountP(int[] arr){
        int CountP = 0 ;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]> 0){
                CountP ++;
            }
        }

        return CountP;
    }

    static int CountN(int[] arr){
        int CountN = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]< 0){
                CountN ++;
            }
        }
        return CountN;
    }


    static int CountZ(int[] arr){
        int CountZ = 0 ;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]== 0){
                CountZ ++;
            }
        }

        return CountZ;
    }


}
