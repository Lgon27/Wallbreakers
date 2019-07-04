/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String str) {
        char patKey;
        String strKey;
        String[] strArr = str.split(" ");
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        HashMap<String, Character> map2 = new HashMap<String, Character>();
        
        if(pattern.length() != strArr.length)
        {
      
             return false;
        }
        for(int i = 0; i < pattern.length(); i++)
        {
            patKey = pattern.charAt(i);
            strKey = strArr[i];
            
            
            if((map1.containsKey(patKey) && !strKey.equals(map1.get(patKey)) )||(map2.containsKey(strKey) && patKey != map2.get(strKey)))
                 return false;
               
            
           
            map1.put(patKey, strKey);
            map2.put(strKey, patKey);
        }      
        
        return true;
    }
}

/*
    Approach:
        My approach to this problem centered around using two hashmaps to map the relationship between characters in the pattern string to
        characters in the str string. A for loop iterated through the entire length of both strings checking to see that the mappings between
        pattern and str were not broken. After the check, the elements were placed in the hashmaps. If the for loop terminated without a mismatch
        then the algorithm would return true. If there was a mismatch at any point then it would return false.
        
    Analysis:
        Time complexity is O(N) where n is the length of the pattern string and the amount of words in the str string
        Space complexity is O(3N) with the worst case being that all the mappings are unique and must be placed in the hashMap. 
*/