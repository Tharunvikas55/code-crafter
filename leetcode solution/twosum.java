// 1. Two Sum
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]


import java.util.HashMap;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap < Integer , Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
            return new int[]{map.get(complement),i};
            map.put(nums[i],i);
        }
        return null;
    }
}



// Function Explanation
// Initialize a HashMap:

// map will store each number as a key and its index as the value.
// Iterate through the array:

// For each number, calculate its complement (the number that, when added to the current number, equals the target).
// Check if the complement exists in the map.
// If it does, return the indices of the current number and the complement.
// If it doesn't, add the current number and its index to the map.
// If no solution is found, return null.

// Example 1: Input: nums = [2, 7, 11, 15], target = 9
// Initialization:

// nums = [2, 7, 11, 15]
// target = 9
// map = {}
// First iteration (i = 0):

// current number = 2
// complement = 9 - 2 = 7
// map does not contain 7
// add 2 to map: map = {2: 0}
// Second iteration (i = 1):

// current number = 7
// complement = 9 - 7 = 2
// map contains 2
// Return [map.get(2), 1] which is [0, 1]
// Output: [0, 1]

// Example 2: Input: nums = [3, 2, 4], target = 6
// Initialization:

// nums = [3, 2, 4]
// target = 6
// map = {}
// First iteration (i = 0):

// current number = 3
// complement = 6 - 3 = 3
// map does not contain 3
// add 3 to map: map = {3: 0}
// Second iteration (i = 1):

// current number = 2
// complement = 6 - 2 = 4
// map does not contain 4
// add 2 to map: map = {3: 0, 2: 1}
// Third iteration (i = 2):

// current number = 4
// complement = 6 - 4 = 2
// map contains 2
// Return [map.get(2), 2] which is [1, 2]
// Output: [1, 2]

// Example 3: Input: nums = [3, 3], target = 6
// Initialization:

// nums = [3, 3]
// target = 6
// map = {}
// First iteration (i = 0):

// current number = 3
// complement = 6 - 3 = 3
// map does not contain 3
// add 3 to map: map = {3: 0}
// Second iteration (i = 1):

// current number = 3
// complement = 6 - 3 = 3
// map contains 3
// Return [map.get(3), 1] which is [0, 1]
// Output: [0, 1]
