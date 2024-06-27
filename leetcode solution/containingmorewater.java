// 11. Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.
// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:
// Input: height = [1,1]
// Output: 1
 
import java.util.*;

public class containingmorewater {

    public static int maxi(int n,int m)
    {
        return (n>m)?n:m;
    }
    public static int mini(int n, int m)
    {
        return (n<m)?n:m;
    }
    public static int maxArea(int[] height) {
        int area=-1;
        int left=0;
        int right=height.length-1;
        while(left<=right)
        {
            
            area=maxi(area,((right-left)*(mini(height[left],height[right]))));
            if(height[left]<height[right])
            left++;
            else
            right--;
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire input line as a string
        String input = sc.nextLine().trim(); // use nextLine to read the whole input
        
        // Remove leading and trailing square brackets if present
        if (input.startsWith("[") && input.endsWith("]")) {
            input = input.substring(1, input.length() - 1);
        }
        
        // Split the input string by commas
        String[] strArray = input.split("\\s*,\\s*");
        
        // Create an array to store integers
        int[] arr = new int[strArray.length];
        
        // Convert each string to integer
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
            //System.out.println(arr[i]); // Print each integer (optional, for verification)
        }
        System.out.print(maxArea(arr));
    }
}
