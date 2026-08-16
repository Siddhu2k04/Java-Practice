import java.util.*;
public class Move_Negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Move(arr, n));
    }

    static ArrayList<Integer> Move(int [] arr ,int n ){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0 ;i<n ;i++){
            if(arr[i] < 0){
                a.add(arr[i]);
            }
        }
        for(int i =0 ;i<n ;i++){
            if(arr[i] >= 0){
                a.add(arr[i]);
            }
        }


        return a ;
    }
}
