/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/
*/
import java.util.*; 
class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> aux = new ArrayList<String >();
        
        for(int num = 1 ; num <= n; num++)
        {
            if(num % 3 == 0 && num % 5 == 0)
            {
                aux.add("FizzBuzz");
            }
            else if(num % 3 == 0)
            {
                aux.add("Fizz");
            }
            else if(num % 5 == 0)
            {
                aux.add("Buzz");
            }
            
            else
            {
                aux.add(Integer.toString(num));
            }
        }
        
        return aux;
    }
}

/*
     Approach:
        My approach to this problem was fairly straight forward. Linearly check every element 
        from 1 to N. If the number is a multiple of both 5 and 3, output fizzbuzz, if its a 
        multiple of 3 output buzz and if its a multiple of 5 output buzz, else output the 
        number. 
        
    Analysis:
        This approach had a time complexity of O(N) where N is the number of elements
        and a space complexity of O(N) where N is the number of elements

*/