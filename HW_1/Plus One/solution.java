/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
    
    target % 10;
    target = target / 10;
*/

class Solution {
    public int[] plusOne(int[] digits) {
     
        //Combining all elements into the array into an integer value
        int number = 0;
        int multiplier = 1;
        for(int i = digits.length - 1; i >= 0; i--)
        {
            number = number + (digits[i] * multiplier);
            multiplier = multiplier * 10;
        }
        
        //Adding 1 to the obtained integer value;
        number++;
            
        //Creating output array
        int length = String.valueOf(number).length();
        int[] aux = new int[length];
        
        //Populating output array
        for(int i = length - 1; i >= 0; i--)
        {
            aux[i] = number % 10;
            number = number / 10;
        }

        return aux;
        
    }
}
/*
    Approach:
        My approach to this problem was as follows:
        The first step was to combine all the elements of the array into an integer value i could manipulate.
        this was done by scanning the array from back to front and adding each value to a number integer, a counting
        for the numbers place of each value. Afterwards, the number was autoincremented by 1. The last step was to
        extract every digit in the new number and place it within an ouput array. This was done using a modulo operation
        
    Analysis:
        Combining all elements of the array had a worst case time complexity of O(N) where N is the length of the input
        array. Creating the output array had a space complexity of O(N) where N is the number of digits in the 
        incremented number. Lastly, populating the ouput array had a time complexity of O(N) where N is the number of
        digits in the incremented number.

        As a result this algorithm had a time complexity of O(N) and a space complexity of O(N)
*/