/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/
   
   HashSet can be used where you want a unique list 
   
   We are a given 2 strings:
        J contains the types of stones that are jewels
        S contains the stones we have.

   We would like to find which of the stones we have 
   
   According to https://www.geeksforgeeks.org/hashset-in-java/
   
   The important features of a HashSet are:
        The underlying data structure is a hashTable
        It implements the set interface, therefore duplicate values are not allowed.
        Objects that you insert in a hashSet are not necessariy ordered.
        NULL elements ARE allowed in a hashSet
        
        HashSet<String> h = new HashSet<String>(); Constructor
        h.add(element) Add elements to the hashSet O(1)
        h.remove(element) Remove element from the hashSet O(1)
        h.contains() Checks if an element exists in the hashSet O(1)
        
    HashSets exist within the java.util package
*/

import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        //Creating counter that will be used as output
        int counter = 0;
        
        //Creating and populating reference hashSet
        HashSet<Character> jewels = new HashSet<Character>();
        for(int i = 0; i < J.length(); i++)
        {
            jewels.add(J.charAt(i));
        }
        
        //Checking stones to see if they're jewels
        for(int i = 0; i < S.length(); i++)
        {
            if(jewels.contains(S.charAt(i)))
                counter++;
        }
        
        return counter;
    }
}
/*
    Approach:
        One relatively efficient approach to this problem is to use a hashSet to store 
        a list of jewels. One could the  check to see if each stone in S exists within that hashSet
        if so, then you can increment the counter by 1 until you've checked each stone.
        
    Analysis:
        The above approach has a time complexity of O(2N) = O(N). Populating the hashSet with every type
        of jewel has O(N) complexity. and checking each stone to see if it's' a jewel has O(N) complexity as well.
        Space complexity for this problem is O(J) where J is the number of jewels.
*/ 