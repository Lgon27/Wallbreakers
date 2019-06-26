/*
   Author: Luis Gonzalez - Wallbreakers Cohort #3
   Github: https://github.com/Lgon27
   LeetCode: https://leetcode.com/luprog138/

Array[Number of arrays][number of elements in each array]
Example: [[1,2,3],[,4,5,6],[7,8,9]]
                
    1 2 3      1 4 7
    4 5 6  ->  2 5 8
    7 8 9      3 6 9
    
    1 2 3       1 4
    4 5 6  ->   2 5
                3 6
*/
class Solution {
    public int[][] transpose(int[][] A) {
        int[][] aux = new int[A[0].length][A.length];
        
        for(int rows = 0; rows < A.length; rows++){
            for(int columns = 0; columns < A[0].length; columns++)
            {
                aux[columns][rows] = A[rows][columns];
            }
        }
        return aux;
    }
}

/*
Description:
    This algorithm uses a secondary array to store the values of the first array in a transposed fashion.
    If the algorithm visits index [i][j] in the array it stores the element in [j][i] of the auxillary array.

Analysis:
    This algorithm has a run time of O(i * j) where i is the number of rows and j is the number of columns in the input array
    This algorithm has a space complexity of O(i * j) where i is the number of rows and j is the number of columns in the input array
*/