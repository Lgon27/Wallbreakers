/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/

//G = children
//S = cookies 
import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s); //O(nlogn)
        Arrays.sort(g); //O(nlogn)
        
        int count = 0;
        int right = s.length - 1;
        if(s.length == 0 || g.length == 0)
            return 0;
        
        for(int i = g.length - 1; i >= 0; i--)
        {
            
            for(int j = right; j >= 0; j--)
            {
                if(g[i] > s[j])
                {
                    break;
                }
                if(s[j] >= g[i])
                {
                    count++;
                    right--;
        
                    break;
                }
            }
        }
            
        return count;
    }
}
/*
    Approach:
        My approach to this problem was to first sort the input lists. This was done in order to check them from end to beggining.
        My algorithm scanned the children's greed factors from greatest to smallest. At every index, the algorithm would check the cookie sizes
        for a suitable match. The algorithm would iterate through the cookie sizes until one of two conditions occured
            1. The current greed factor that we are checking is bigger than the current largest cookie -> If this is the case then we exit the inner loop
               as this child has too high a greed factor and no other cookie would be suitable. We move on to the next child's greed factor
            2. The current greed factor is greater than or equal to the size of the current largest cookies. -> In this case then we increment the
               counter, and shift the matched cookie size out of the view of our algorithm. We then advance to the next child
        Finally the algorithm ends when we've checked every greed factor.
        
    Analyis:
        This algorithm has O(NlogN) complexity. Stemming from sorting the input and our greedy algorithm itself (Which does iterates through every
        element of g and an increasinly smaller number of elements in s each time)
        This algorithm has O(1) space complexity
        
    *Speak to a mentor about how to analyse this complexity.
            
*/