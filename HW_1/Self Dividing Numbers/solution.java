/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/


    target % 10;
    target = target / 10;
    can be used in a loop to extract all digits of a number
*/
import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
    ArrayList<Integer> aux = new ArrayList<Integer>();
        
    for(int targetNum = left; targetNum <= right; targetNum++){
        //obtaining the length of the number
        int length = String.valueOf(targetNum).length();
        
        int counter = 0;
        int target = targetNum;
        
        for(int i = 0; i < length; i++)
        {
            
            if( (target % 10 != 0) && (targetNum % (target % 10) == 0))
                counter++;
            target = target / 10;
        }
        if(counter == length)
            aux.add(targetNum);
    }    
    return aux;
    }
}

/*
    To solve this problem i created an algorithm that iterates throug every number between the given range. At each
    number the algorithm checks how many digits in the number and stores it in a length variable. The inner for loop
    then checks every digit in the number, extracting them using a modulo operation. If a digit divides the target number
    then a counter is incremented by 1. If after the for loop the counter matches the number of digits then the target 
    number is stored in the array.
    
    I've struggled a bit when analysing the complexity for this algorithm. The outer for loop makes N iterations where N
    is the length of the given range. The inner for loop iterates K times where K is the number of digits in the current
    target number. Therefore i believe that the complexity of this algorithm can be best shown as O(N * K) where N is the
    number of values in the given range and K is the number of digits in each number.
    
*/