// 912. Sort an Array
// Solved
// Medium
// Topics
// Companies
// Given an array of integers nums, sort the array in ascending order and return it.

// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

// Example 1:

// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
// Example 2:

// Input: nums = [5,1,1,2,0,0]
// Output: [0,0,1,1,2,5]
// Explanation: Note that the values of nums are not necessairly unique.

public class SortanArray {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) return new int[]{0};
        int mid=nums.length/2;
        int[] left=new int[mid];
        int[] right=new int[nums.length-mid];
        for(int i=0;i<mid;i++)
        left[i]=nums[i];
        for(int i=mid;i<nums.length;i++)
        right[i-mid]=nums[i];
        sortArray(left);
        sortArray(right);
        return merge(nums,left,right);        
    }
    public int[] merge(int[] nums,int[] left,int[] right)
    {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
                nums[k++]=left[i++];
            else
            nums[k++]=right[j++];
        }
        while(i<left.length)
        nums[k++]=left[i++];
        while(j<right.length)
        nums[k++]=right[j++];
        return nums;
    }
}
