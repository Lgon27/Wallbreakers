/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/

*/
class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] arr; //Initialize Array to be returned
        arr = new int[A.length];
        int tracker = 0; //keeps track of current position in new array
        
        //Finding all even numbers
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] % 2 == 0)
            {
                arr[tracker] = A[i];
                tracker++;
            }
            
        }
        
        //Finding all odd numbers
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] % 2 == 1)
            {
                arr[tracker] = A[i];
                tracker++;
            }
            
        }   
        return arr; 
    }
}

/*
Explanation:
    The approach i took to this problem was as follows: Create an auxillary array to store and return the parity sorted values. Scan the array
    twice, first for even numbers and then for odd numbers. On each scan, if a number matches the parity being searched for it is inserted
    int othe auxillary array.




Analysis:
    This solution has a time complexity of O(2N). This is due to the fact that the algorithm
    makes two linear searches through the array, one to find even numbers, and one to find odd numbers.

    Additionally, this solution has a space complexity of O(N) where n is the size of the input array. This is because
    an auxillary array is used to store and return the parity sorted items.

*/