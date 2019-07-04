/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
          HashMap<Character,Character> map = new HashMap<Character,Character>();
          HashMap<Character,Character> auxmap = new HashMap<Character,Character>();
          char char1;
          char char2;
        
        for(int i = 0; i< s.length(); i++)
        {
            char1 = s.charAt(i);
            char2 = t.charAt(i);
            
            if((map.containsKey(char1) && (char2 != map.get(char1))) || (auxmap.containsKey(char2) && (char1 != auxmap.get(char2))))
            {
                 return false;
            }
           
               
            map.put(char1, char2);
            auxmap.put(char2, char1);
        }
            return true;
    }
}
/*
    Approach:
        My approach to this problem was to create two maps responsible for mapping the
        relationship between characters. the first map "map" mapped characters from s(key) to
        t(value) and the second map "auxmap" mapped from t(key) to s(value).
        
        A for loop was used to insert the proper key value pairs in their respective hashmaps.
        If at any point a duplicate key was found in one of the maps, then the value would be 
        checked. If the current char in the for loop is different than the mapped value
        then false would be returned. This operation was done for both hashmaps.
        
        If all of the elements were sucessfully inserted in the hasmaps then the algorithm
        would return true.
        
    Analysis:
        This algorithm has O(N) time complexity where N is the length of the input strings.
        The space complexity would be O(2N) since two equally sized but inverse hashmaps were
        used in this algorithm

*/