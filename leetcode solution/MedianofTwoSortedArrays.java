// 4. Median of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++)
            arr[k++] = nums1[i];
        for (int i = 0; i < n2; i++)
            arr[k++] = nums2[i];
        Arrays.sort(arr);
        double mid = 0;
        int i = 0;
        int j = arr.length;
        if (arr.length % 2 == 0) {
            int midd = (j - i) / 2;
            mid = (arr[midd] + arr[midd - 1]) / 2.00000;
        } else {
            int midd = (j - i) / 2;
            mid = arr[midd];
        }
        return mid;
    }
}
