/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
    
    Given even length input array
    
    ---Test Cases---
    Input: [1,2,3,4,]
        Sister: [1,2]
        Brother: [3,4]
        Output: 2
    Input: [1,2,3,3,4,5]
        Sister: [1,2,4]
        Brother:[3,3,5] 
        Ouput: 3
    Input: [1,1,2,3]
        Sister: [2,3]
        Brother: [1,1]
        Output: 2
    Input:[1,2,3,3,4,5,5,6]
        Sister: [1,2,3,4]
        Brother: [4,5,5,6]
        Output: 4
    Input: [1,1,1,1,1,2] 
        Sister: [1,1,2]
        Brother: [1,1,1]
        Output: 2
*/

import java.util.*;
class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i = 0; i < candies.length; i++)
        {
            hs.add(candies[i]);
        }
        
        return Math.min(hs.size(), candies.length/2);
    }
}
/*
    Approach:
        My approach to this problem was as follows:
            First the algorithm linearly scans the list and places every number in a hashSet. Since
            hashSet is built upon the Set data structure, it will not contain duplicates.
            the amount of candies the sister should receive is then the smallest number between the
            size of the hashSet and the length of the array / 2;
            
        Complexity:
            Time: O(N) because the algorithm must linearly scan every item in the given array
            Space: O(N) is the worst case complexity in the even that the list only contains 
                   unique numbers