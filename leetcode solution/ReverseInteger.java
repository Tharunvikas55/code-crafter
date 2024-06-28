// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
// Example 1:
// Input: x = 123
// Output: 321
// Example 2:
// Input: x = -123
// Output: -321
// Example 3:
// Input: x = 120
// Output: 21

public class ReverseInteger {
    public int reverse(int x) {
        int num=Math.abs(x);
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            if(rev>(Integer.MAX_VALUE-rem)/10)
            return 0;
            rev=rev*10+rem;

            num=num/10;
        }
        return (x>0)?rev:(-rev);
    }    
}





// Example: x = 1534236469
// For x = 1534236469, the reversed number would be 9646324351, which exceeds the maximum value for a 32-bit signed integer (2147483647). Hence, the function should return 0 to indicate overflow.

// Detailed Steps
// x = 1534236469
// Absolute value: num = 1534236469
// Initial rev = 0
// Loop Iterations
// rem = 9, rev = 0, new rev = 9
// rem = 6, rev = 9, new rev = 96
// rem = 4, rev = 96, new rev = 964
// rem = 6, rev = 964, new rev = 9646
// rem = 3, rev = 9646, new rev = 96463
// rem = 2, rev = 96463, new rev = 964632
// rem = 4, rev = 964632, new rev = 9646324
// rem = 3, rev = 9646324, new rev = 96463243
// rem = 5, rev = 96463243, new rev = 964632435
// rem = 1, rev = 964632435, overflow check: 964632435 > (2147483647 - 1) / 10, which is true.
// Since the overflow condition is met in the 10th iteration, the function returns 0.