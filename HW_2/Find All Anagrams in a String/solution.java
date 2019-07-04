//Importing hashmap essentials
import java.util.*; 
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        //Creating our hashMap - Each character in p will be a key, their value will be a count of how many times the character appears
        HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
        
        //Creating our 26 size array - Each index of the array will correspond to a character and hold its # of appearances within our window
        int[] sArr =  new int[26];
        
        //populating our hashMap with elements of p and their # of occurences in p
        for(int i = 0; i < p.length(); i++)
        {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1); //Returns 0 for value if item isn't present in our hMap or the value if it is.
        }
        //creating output list
        ArrayList<Integer> output = new ArrayList<Integer>();
        
        //left -> left side of window, right -> right side of window, matchCounter -> count of how many elements in window match hashMap values
        int left = 0;
        int right = p.length() - 1;
        int matchCounter = 0;
        
        //While loop slides window. Window is the size of p
        while(right < s.length())
        {
            //Stores window in the array
            for(int i = left; i <= right; i++)
            {
                sArr[s.charAt(i) - 97]++;
            }
            
            //Checks each key in the hasmap for its value and compares the key's value against the value stored in the array
            for(char pChar : pMap.keySet())
            {
                if(pMap.get(pChar) == sArr[pChar - 97])
                {
                    matchCounter++;
                }
            }
            //If match all the elements in the hashMap matched the values in the array then we can store that index as we found an anagram
            if(matchCounter == pMap.size())
                output.add(left);
            
            //Advances Window
            right++;
            left++;
            
            //Resets helper variables
            matchCounter = 0;
            sArr = new int[26];
            
        }
        return output;
    }
}
/*
    Approach:
        My approach to this problem was as follows:
            The first step in this algorithm was to populate a hashMap for the elements in P. In this hashMap, the Character was the Key and the
            number of times it appears in P is the value.

            Afterwards, using a sliding window of size P (length of anagram), i traversed the string s. At each iteration, i analyzed a window of size 
            p.length() counting each character and storing its count in a 26 size array (one index ofr each letter)
            
            Finally, i compared the values of the hashMap key's to the counts in the array. If they were the same, then i would increment a counter.
            If the counter reached the #of keyValue pairs in the hashMap then i would add the starting window of the index to an output array.
            
    Analysis:
        This algorithm had a time complexit of O((N - J) * J) where N is the number of elements in the S array, and J is the size of the window
        Space complexity: O(N + 26) where N is the size of the hashMap and 26 is the size of the character array.
*/