// 238. Product of Array Except Self
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]



public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length<2)
        return new int[0];
        int[] left=new int[nums.length];
        left[0]=1;
        int[] right=new int[nums.length];
        right[nums.length-1]=1;
        int[] res=new int[nums.length];
        for(int i=1;i<nums.length;i++)
        left[i]=left[i-1]*nums[i-1];
        for(int i=nums.length-2;i>=0;i--)
        right[i]=right[i+1]*nums[i+1];
        for(int i=0;i<nums.length;i++)
        res[i]=left[i]*right[i];
        return res;
    }
}



// Example 1: Input: nums = [1, 2, 3, 4]
// Initialization:

// arr = [1, 2, 3, 4]
// left = [1, 0, 0, 0] (Initialize the left array with the first element as 1)
// right = [0, 0, 0, 1] (Initialize the right array with the last element as 1)
// Fill the left array:

// left[1] = left[0] * arr[0] = 1 * 1 = 1
// left = [1, 1, 0, 0]
// left[2] = left[1] * arr[1] = 1 * 2 = 2
// left = [1, 1, 2, 0]
// left[3] = left[2] * arr[2] = 2 * 3 = 6
// left = [1, 1, 2, 6]
// Fill the right array:

// right[2] = right[3] * arr[3] = 1 * 4 = 4
// right = [0, 0, 4, 1]
// right[1] = right[2] * arr[2] = 4 * 3 = 12
// right = [0, 12, 4, 1]
// right[0] = right[1] * arr[1] = 12 * 2 = 24
// right = [24, 12, 4, 1]
// Calculate the result using left and right:

// arr[0] = left[0] * right[0] = 1 * 24 = 24
// arr[1] = left[1] * right[1] = 1 * 12 = 12
// arr[2] = left[2] * right[2] = 2 * 4 = 8
// arr[3] = left[3] * right[3] = 6 * 1 = 6
// Result: arr = [24, 12, 8, 6]

// Example 2: Input: nums = [-1, 1, 0, -3, 3]
// Initialization:

// arr = [-1, 1, 0, -3, 3]
// left = [1, 0, 0, 0, 0] (Initialize the left array with the first element as 1)
// right = [0, 0, 0, 0, 1] (Initialize the right array with the last element as 1)
// Fill the left array:

// left[1] = left[0] * arr[0] = 1 * -1 = -1
// left = [1, -1, 0, 0, 0]
// left[2] = left[1] * arr[1] = -1 * 1 = -1
// left = [1, -1, -1, 0, 0]
// left[3] = left[2] * arr[2] = -1 * 0 = 0
// left = [1, -1, -1, 0, 0]
// left[4] = left[3] * arr[3] = 0 * -3 = 0
// left = [1, -1, -1, 0, 0]
// Fill the right array:

// right[3] = right[4] * arr[4] = 1 * 3 = 3
// right = [0, 0, 0, 3, 1]
// right[2] = right[3] * arr[3] = 3 * -3 = -9
// right = [0, 0, -9, 3, 1]
// right[1] = right[2] * arr[2] = -9 * 0 = 0
// right = [0, 0, -9, 3, 1]
// right[0] = right[1] * arr[1] = 0 * 1 = 0
// right = [0, 0, -9, 3, 1]
// Calculate the result using left and right:

// arr[0] = left[0] * right[0] = 1 * 0 = 0
// arr[1] = left[1] * right[1] = -1 * 0 = 0
// arr[2] = left[2] * right[2] = -1 * -9 = 9
// arr[3] = left[3] * right[3] = 0 * 3 = 0
// arr[4] = left[4] * right[4] = 0 * 1 = 0
// Result: arr = [0, 0, 9, 0, 0]