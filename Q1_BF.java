package Q1;
public class Q1_BF{
public static void FindPair(int [] nums ,int target){
        //		consider each element except last
                for(int i=0;i<nums.length;i++) {
                    for(int j=i+1;j<nums.length;j++) {
                        if(nums[i]+nums[j]== target ) {
                             System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                            return;
                            
                        }
                    }
                    
                }
                 System.out.println("pair is not found");
                
                
            }
            
            
            
        
            public static void main(String[] args) {
                int nums[]= {1,3,4,2,5,6,7,8,9};
                int target =10;
                FindPair(nums,target);
                 
            }
        }
        
        
