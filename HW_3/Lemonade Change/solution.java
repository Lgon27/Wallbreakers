/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fives = 0;
        int tens = 0;
        
        for(int i = 0; i < bills.length; i++)
        {
            if(bills[i] == 5)
            {
                fives++;
            }
            else if(bills[i] == 10)
            {
                if(fives > 0)
                {
                    fives--;
                    tens++;
                }
                else
                {
                    System.out.println("This false haha");
                    return false;
                }
            }
            else if(bills[i] == 20)
            {
                System.out.println("fives: " + fives + " tens: " + tens);
                if(tens > 0 && fives > 0)
                {
                    tens--;
                    fives--;
                }
                else if(fives >= 3)
                {
                    fives = fives - 3;
                }
                else
                {
                    System.out.println("This false" + i);
                    return false;
                }
            }
            
        }
        
        
        return true;
        
    }
}
/*
    Approach:
        My approach to this problem focused around tracking my current bills and seing if i could provide exact change with what i had at the
        moment. And in the case of larger numbers, try to use the largest bills possible to provide that change.

    Analysis::
        This algorithm had a time complexity of O(N) where N is the number of elements in the input array
        This algorithm had a space complexity of O(1)
*/