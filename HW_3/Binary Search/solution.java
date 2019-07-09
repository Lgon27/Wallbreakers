/*
    
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/

    
    Binary Search Synopsis:
        1. Compare x with the middle element
        2. If target == middle element, then return the middle element
        3. If x > target then recurse to the right
        4. If x < target the recurse to the left
        
        Function Parameters:
            int[] nums: Input array
            int target: Element we are searching for
            

*/
class Solution {
    public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
        
    return binSearch(nums, target, l, r);
        
           
    }
    public int binSearch(int[] nums, int target, int l, int r){
        int mid;
        
        if(r >= l )
        {
            mid = l + ( r - l) / 2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] > target)
            {
                return binSearch(nums, target, l, mid - 1);
            }
             if(nums[mid] < target)
            {
                return binSearch(nums, target, mid + 1, r);
            }
        }
        
        return -1;
        
    }
}
/*
    Approach:
        My approach to this problem was a relatively standard binary search problem.
        If the middle of the array == than target element then i would return that element.
        If the middle of the array > than the target element then i would recurse left
        If the middle of the array < than then i would recurse right
    
        I had some initial bugs in my program due to not setting the middle element correct.
        It should be left + (right - left) / 2 and the algorithm should end when left > right
    
    Analysis:
        This algorithm has a time complexity of O(logN) because it divides the number of searched
        elements in half each time. O(logN) is also the height of binary tree!
        
        This algorithm has O(1) space complexity
*/ 