import java.util.HashMap;
import java.util.Map;
public class Q1_Hash{
    public static void FindPair(int nums[] ,int target){
        //create an empty hash map
        HashMap<Integer,Integer> map = new HashMap<>();
        //check the number for each
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                System.out.printf("pair is found(%d %d)",nums[map.get(target-nums[i])],nums[i]);
                return ;

            }
            //store the element in the index
            map.put(nums[i],i);

        }
        System.out.println("pair is not found");


    }
    public static void main(String args[]){
        int[] nums = { 1,2,3,4,5,7,8,9 };
        int target =10;
        FindPair(nums,target);
    }

}