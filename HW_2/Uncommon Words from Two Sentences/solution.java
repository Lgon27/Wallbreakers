/*

    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
    

    HashMap can be used to store a key value pair for each word, where the key is the word itself
    and the value is the count of the words;
    
    HasMap.getOrDefault(Object key, V defaultValue)
        returns the value to which the specified key is mapped, or defaultValue if this map contains
        no mapping for the key
*/

import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        //Creating hashMap;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //Creating indexible string array's
        String[] Aarray = A.split(" ");
        String[] Barray = B.split(" ");
        
        //Counting elements of A
        for(int i = 0; i < Aarray.length; i++)
        {
            map.put(Aarray[i], map.getOrDefault((Aarray[i]), 0) + 1);       
        }
        //Counting elements of B
        for(int i = 0; i < Barray.length; i++)
        {
            map.put(Barray[i], map.getOrDefault((Barray[i]), 0) + 1);       
        }
        //Output Array
        ArrayList<String> output = new ArrayList<String>();
        
        //Extracting unique words from the map and placing them in arrayList;
        for(String key: map.keySet())
        {
            if(map.get(key) == 1)
            {
                output.add(key); 
            }
        }
   
        String[] outputArray = new String[output.size()];
        
        return output.toArray(outputArray);
    }
}

/*
    Approach, my approach to this problem was as follows:
        Iterate through both input arrays and store a key value pair for each word into a hashmap. The key would be
        the word itself and the value would be a count of how frequently it has appeared. Afterwards, store all the
        key's who have a value of 1. I was able to do this by iterating through the maps keySet and adding all key's
        who have a value of 1 to an arrayList. Lastly, I returned the output arrayList in an array format.
        
    Analysis:
        Time complexity for this problem is O(N + J) where N and J are the number of elements in A and B respectively
        Space complexit for this problem is also O(N + J) and it corresponds to the number of elements in A and B which
        are stored in our hashMap.
*/

