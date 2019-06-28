/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/  
*/




class Solution {
    public boolean isPowerOfTwo(int n) {
        //Brute force approach
        while((n % 2 == 0) && n > 0)
        {
            n = n / 2;
        }
        
        if(n == 1)
            return true;
        else 
            return false;
        
    }
}

/*
    Explanation:
        This algorithm continuously divides the given integer by 2 until one of the 
        following conditions is met:
            n = 1 in which case the given number is a power of 2
            n = odd number > 1 in which case the given number is not a power of 2
            
    Analysis:
        This algorithm has a time complexity of O(N) where N represents the exponent
        that 2 must be raised to in order to obtain the input value.
        This algorithm uses no additional space and therefore has O(1) space                 complexity
        
    Notes: 
        This algorithm is a relatively bruteforce approach to this problem albeit
        a simple solution.A faster solution may be found using bit operations. For 
        example, one can obtain the binary representation of the input number and 
        count the number of zero's in that binary representation. If more than 1
        zero exists in the binary representation of the number then it is not 
        a power of zero.
*/