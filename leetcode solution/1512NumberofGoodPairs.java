// Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.
// Example 1:
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Example 2:
// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
// Example 3:
// Input: nums = [1,2,3]
// Output: 0

//general solution
// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             if(nums[i]==nums[j])
//             count++;
//         }
//         return count++;
//     }
// }

//optimised solution using map
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],0);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int n=entry.getValue();
            count+=(n*(n+1))/2;
        }
        return count;
    }
    
}