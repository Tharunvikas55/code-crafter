// 287. Find the Duplicate Number
// Solved
// Medium
// Topics
// Companies
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
// Example 3:

// Input: nums = [3,3,3,3,3]
// Output: 3

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {

        // Set<Integer> set1=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        // if(!set1.contains(nums[i]))

        // set1.add(nums[i]);
        // else
        // return nums[i];
        // }
        // return -1;

        // int n = 0;
        // int[] count = new int[nums.length];
        // for (int i = 0; i < nums.length; i++)
        //     n = Math.max(n, nums[i]);
        // for (int i = 0; i < n + 1; i++) {
        //     if (count[nums[i]] == 0)
        //         count[nums[i]]++;
        //     else
        //         return nums[i];
        // }
        // return -1;


        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
