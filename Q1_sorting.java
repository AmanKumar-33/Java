package Q1;
import java.util.Arrays;
public class Q1_sorting{
    public static void FindPair(int [] nums ,int target){

        Arrays.sort(nums);

        int low =0;
        int high = nums.length-1;

        // loop till the search space is exhausted
        while(low < high){
            if (nums[low]+nums[high] == target){
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return ;

            }
             if(nums[low]+ nums[high] < target){
                low++;

             }
             else {
             high--;
             }
        }
        System.out.println("pair is not found");



    }
    public static void main(String args[]){
        int nums[]  ={2,4,5,7,7,6,1,3};
        int target = 10;
        FindPair(nums,target);
    }
}