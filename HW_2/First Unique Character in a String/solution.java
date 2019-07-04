/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/

import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        //HashMap to store count of different character occurences in s
        HashMap<Character,Integer> hMap = new HashMap<Character,Integer>();
        
        for(int i = 0; i < s.length(); i++)
        {
            hMap.put(s.charAt(i), hMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            if(hMap.get(s.charAt(i)) == 1)
                return i;
        }
        
        return -1;
    }
}


/*
    Approach:
        My approach for this problem was as follows: 
        Create a hashmap to store key value pairs where the k is a character and the value is the number of occurences that the character has in s.
        Then, linearly scan the string checking the hashMap values using the current character as a key. If at any time the hMap.get returns 1 then the
        algorithm outputs the current index.
        
    Analysis:
        This algorithm has a time complexity of O(2N) which equals O(N) where N is the length of the input string. 
        This algorithm has a space complexity of O(N) where n is the size of the hashMap.
*/