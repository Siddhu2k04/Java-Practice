import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of 1 st arr :");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        for(int i = 0;i<n ;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter side of 2 nd arr :");
        int m = sc.nextInt();

        int arr2[] = new int[m];
        for(int i = 0;i<m ;i++){
            arr2[i] = sc.nextInt();
        }



        System.out.println(Find_Comman(arr1, arr2, m, n));
        
    }

    static ArrayList<Integer> Find_Comman(int[] arr1, int [] arr2 , int m , int n){
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0;i<m;i++){
            for(int j= 0;j<n;j++){
                if(arr1[i] == arr2[j]){
                  
                        a.add(arr1[i]);
                  
                }
            }
        }

        return a;
    }

}
