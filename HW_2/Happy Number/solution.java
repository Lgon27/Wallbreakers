/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/


import java.lang.*;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> numberSet = new HashSet<Integer>();
        int aux = n; //holds the sum
        while(aux != 1)
        {
            //Obtaining the sum of the squares of the two numbers
            int temp = 0;
            while(aux > 0)
            {
                temp += (int)Math.pow(aux % 10, 2);
                aux /= 10;
            }
            //Checking if the sum exists in the set
            if(numberSet.contains(temp))
                return false;
            else{
                aux = temp;
                numberSet.add(temp);
            }
        }
        return true;   
    }
}
/*
    Approach:
        The algorithm begins by obtaining the input number and squaring the sum of
        it's digits. If the hashSet contains the number then we have found a loop and it exits, if it does not then the aux variable is set to 
        the sum of the digits and the value of the sum of the two digits is inserted into a hash table. This process repeats until the value of the
        aux variable is either 1 or we obtain a value that the hashTable already contains.
        
    Analysis: 
        Worst case for this problem would be O(N * J) where N is the number of times we can split the number and sum the square of it's digits without
        reaching zero, and J is the number of digits in each number.
        
        Space complexity for this problem is O(N) where N is the number of unique values we store in the hashTable.
*/

