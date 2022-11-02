//Soultion-1(Brute Force)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[]=new int[2];
        
        for(int i=0;i<nums.length;i++){   
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        
        return ans;
    }
}


//Soultion-2(Optimized)
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[]=new int[2];
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){   
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
                break;
            }
        }
        
        return ans;
    }
}
