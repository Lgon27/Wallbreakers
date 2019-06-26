/*
    Author: Luis Gonzalez - Wallbreakers Cohort #3
    Github: https://github.com/Lgon27
    LeetCode: https://leetcode.com/luprog138/
    
    Input: [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0 ],[1,1,1]]
    
    Array[Number of arrays][number of elements in each array]
    
    
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] aux = new int[A.length][A.length];
        
        for(int rows = 0; rows < A.length; rows++)
        {      
            
            //Invert the image
            for(int columns = 0; columns < A[rows].length; columns++)
            {
                //invert the image
                if(A[rows][columns] == 0)
                {
                     A[rows][columns] = 1;
                }
                else
                {
                     A[rows][columns] = 0; 
                }
            }
            
            //flip the image
            for(int columns = 0; columns < A[rows].length; columns++)
            {
                aux[rows][A[rows].length -1 - columns] = A[rows][columns];
            }
            
        }
               
        
        return aux;
    }
}

/*
Approach:
    I solved this problem using 3 loops in total. the outer for loop iterated through each row
    within the matrix. At each row, the first inner for loop inverted the image while the
    second inner for loop horizontally flipped the image.

Analysis:
    This algorithm has time complexity of O(i * 2j) where i is the number of rows and j is 
    the number of columns in the input array. My algorithm visits each row once but visits each column twice
    
    This algorithm has space compelixty of O(i * j) where i is the number of rows and j is the
    number of columns in the input array. This is due to the fact that i use an auxillary
    array to store the flipped image
    
    

*/