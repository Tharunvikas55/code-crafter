
/*
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Input Format

array size array elements

Constraints

whole numbers

Output Format

permutation numbers

Sample Input 0

3
1 2 3
Sample Output 0

1 2 3
1 3 2
2 1 3
2 3 1
3 1 2 
3 2 1
Explanation 0

Input: nums = [1,2,3] Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
import java.io.*;
import java.util.*;

public class buyandsell {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i]))
                    continue; // Skip if element already exists in the tempList
                tempList.add(nums[i]);
                backtrack(nums, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        List<List<Integer>> permutations = permute(arr);
        for (List<Integer> perm : permutations) {
            for (int num : perm) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
