/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/
*/
class Solution {
    public boolean detectCapitalUse(String word) {
        
        int capitalCounter = 0;
        
        
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)
                capitalCounter++;
        }
        
        System.out.println(capitalCounter);
        
        if(capitalCounter == word.length())
            return true;
        else if(capitalCounter == 0)
            return true;
        else if(capitalCounter == 1 && (word.charAt(0) >= 65 && word.charAt(0) <= 90))
            return true;
        else
            return false;
    }
}
/*
    Approach:
        My approach to this problem worked under the acknowledgement of the following 3 conditions;
        The usage of capitals is right if:
            1. All letters in the word are captials
            2. All leters are not capitals
            3. Only the first letter is capital
        Using the fact that all capital letter ascii codes lie between 65 and 90, the algorithm
        traversed the array and incremented a counter whenever the ascii value of a character was
        between the target range.
        
        Afterwards, the algorithm return true if the counter was equal to the length of the word, 0,
        or 1 and the first letter was capital
        
    Analysis:
        Time complexity: O(N) where N is the number of letters in the word
        Space complexity: O(1) 
*/