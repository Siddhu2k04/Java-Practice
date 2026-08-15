import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Maximum is "+max(nums));
    }
    static int max(int[] nums){
        int Maximum = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]>Maximum){
                Maximum = nums[i];
            }else{
                i++;
            }
        }
        return Maximum;
    }
}



