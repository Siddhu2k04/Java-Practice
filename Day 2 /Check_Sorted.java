import java.util.*;
class Check_Sorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];

        for(int i = 0;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Check(arr, n));
    }

    static boolean Check(int [] arr , int n ){

        boolean result = false ;

        String  a = Arrays.toString(arr);
        Arrays.sort(arr);
        String  b = Arrays.toString(arr);

        if(a.equals(b)){
            result = true ;
        }
        return result;
    }
}
