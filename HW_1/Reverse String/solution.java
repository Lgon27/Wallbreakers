/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/  
*/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char aux;
        
        
        if(s.length >= 1)
        {
            while(left <= right)
            {
                
                aux = s[right];
                s[right] = s[left];
                s[left] = aux;

                right--;
                left++;
            }
        }
        
    }
}
/*
    Explanation:
        This algorithm uses two pointers to swap the order of the characters from
        the outside of the array in until the pointers meet or cross each other
        
    Analysis:
        No additional space is used, therefore this algorithm has O(1) complexity
        Time complexity can be seen as O(1/2N) where N is the number of characters
        in the char array
*/