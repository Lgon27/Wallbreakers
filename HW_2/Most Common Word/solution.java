    /*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
    */
 
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
              
            //Multiset (HashMap) to track occurences of words
            HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
            
            //Normalizing Input
            String[] pArr = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split(" ");
            //System.out.println(para);
            
            //Populating multiset(HashMap)
            for(int i = 0; i < pArr.length; i++)
            {
                wordMap.put(pArr[i], wordMap.getOrDefault(pArr[i], 0) + 1);
            }
            wordMap.remove("");
            
            //Removing banned words;
            for(int i = 0; i < banned.length; i ++)
            {
                wordMap.remove(banned[i]);
            }
            
            int mostCommon = 0;
            for(String word : wordMap.keySet())
            {
               if(wordMap.get(word) > mostCommon)
                   mostCommon = wordMap.get(word);
            }
            
            
            for(String word : wordMap.keySet())
            {
               if(wordMap.get(word) == mostCommon)
                   return word;
            }
    
            return "";
        }
    }
    
    /*
        Approach:
            My approach to this problem was to first normalize the input string and to place all the elements of that input string in a multiset (hashmap).
            the next step was to remove the banned elements from this multiset. This left us with a multiset containing legal words and their counts. next,
            the algorithm searched the multiset for the highest occurence and stored that value in a variable. Lastly, the multiset was searched once more,
            this time each key's value was checked against the stored highest occurence value. If the key's value was equal to the highest occurence value,
            then that key was returned as output.
            
        Analysis:
            Time: Worst case time complexity is O(N) where N is the amount of words in the input string.
            Space: Worst case space complexity is O(N) where N is the size of the multiset
    
    */