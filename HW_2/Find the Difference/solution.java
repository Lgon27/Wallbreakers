/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/

//Solution using two hashMaps
import java.util.*;
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        
        
        for(int i = 0; i < s.length(); i++)
        {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int i =0; i < t.length(); i++)
        {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        for(char tChar : tMap.keySet())
        {
            if(!sMap.containsKey(tChar) || (sMap.containsKey(tChar) && sMap.get(tChar) < tMap.get(tChar)))
                return tChar;
        }

        
        return 'a';
    }
}

/*
    Approach:
        My approach to this problem focused on using two hashMaps to count the number of occurences of each char in the input strings.
        String s was mapped to sMap and String t to tMap. Afterwards, using an enhanced for loop and they keySet of tMap, i checked the key
        value pairs corresponding to tMap to see which one differed from the ones in sMap. the key of the mismatched keyValue pair was then returned
        as output
        
    Analysis:
        This algorithm has a time complexity of O(N + 2J) where N is the length of String s and J is the length of String t
        This algorithm has a space complexity of (N + J) where N is the number of elements in sMap and J is the number of elements in tMap
*/
