// 349. Intersection of Two Arrays
// Given two integer arrays nums1 and nums2, return an array of their 
// intersection
// . Each element in the result must be unique and you may return the result in any order.
// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.Set;
import java.util.TreeSet;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    s1.add(nums1[i]);
                }
            }
        }
        int[] nums3 = new int[s1.size()];
        int k = 0;
        for (Integer value : s1) {
            nums3[k++] = value;
        }
        return nums3;
    }

}
