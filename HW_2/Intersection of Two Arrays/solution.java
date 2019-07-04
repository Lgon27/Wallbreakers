/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
*/


import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
           HashSet<Integer> nums1Set = new HashSet<Integer>();
           HashSet<Integer> nums2Set = new HashSet<Integer>();
        
           for(int i = 0; i < nums1.length; i++)
           {
                nums1Set.add(nums1[i]);   
           }
           for(int i = 0; i < nums2.length; i++)
           {
                nums2Set.add(nums2[i]);   
           }
        
           ArrayList<Integer> aux = new ArrayList<Integer>();
        
           for(int num : nums1Set)
           {
               if(nums2Set.contains(num))
                   aux.add(num);
           }
        
           int[] output = new int[aux.size()];
           for(int i = 0; i < aux.size(); i++)
           {
               output[i] = aux.get(i);
           }
           return output;
    }
}

/*
    Approach:
        My approach for this problem was as follows. I first wanted to seperate the items into unique
        sets, since for the purpose of intersection duplicates dont matter. I did this by creating
        two hashSets for each array and placing the corresponding values within them. Afterwards
        i needed to actually check which values are common. This could be acomplished fairly easily
        by checking all the elements in one set to see if they exist in the second set. If they do
        exist then you can add them to some auxillary data structure that stores the intersection. I
        stored shared values in an arrayList (for expanding size) which i later converted to an array
        
    Analysis:
        This algorithm has a time complexity of O(N + J) where N is the number of elements in nums1
        and J is the number of elements in nums2.
        This algorithm has a worst case space complexity of O(N + J) in the event where both of the
        input array's contain completely unique elements.
*/