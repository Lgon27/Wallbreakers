/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
    
    Each letter is mapped to a series of dots and dashes, as follows: 
    "a" maps to ".-", "b" maps to "-...". "c" maps to "-.-."
    
*/
import java.util.*;
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
       
        //Table of morse code values
        String[] morseTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---"
            ,"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //Reference table to check for number of different transformations
        HashSet<String> table = new HashSet<String>();
        
        int counter = 0;
        
        
        for(int i = 0; i < words.length; i++)
        {
            
            String morseCombo = "";
            //Obtain the combination of each word
            String temp = words[i];
            for(int j = 0; j < temp.length(); j++){
                morseCombo = morseCombo + morseTable[temp.charAt(j) - 97];
            }
          
            //Check to see if it exists 
            if(!table.contains(morseCombo))
            {
                table.add(morseCombo);
                counter++;
            }
            
            
        }
        return counter;
    }
}

/*
    Approach:
        This algorithm checks each element of the input array and obtains a string. For each string, it matches the characters with
        their respective morse code values and concatenates them into a morse code word. then it attempts to store a morse code word in a hash set
        if successfully does so, then it increments a counter by 1. If it fails to do so, then the word is not unique and the counter is not incremented.
        
    Analysis:
        This algorithm has a time complexity of O(N * J) where N is the number of words and J the size of each word.
        This algorithm has a space complexity of O(N) where N is the number of unique words placed in the hash set.
*/