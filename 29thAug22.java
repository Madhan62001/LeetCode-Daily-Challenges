/*200. Number of Islands
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
*/
class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    ++c;
                    cog(grid,i,j);
                }
            }
        }
        return c;
    }
    public void cog(char grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0')
            return;
        grid[i][j]='0';
        cog(grid,i+1,j);
        cog(grid,i-1,j);
        cog(grid,i,j+1);
        cog(grid,i,j-1);
        return;
    }
}

/* This algorithm operates by a simple concept of visiting every node in the matrix and replacing the blocks of 1 with 0 such that only one '1' is counted indicating 
each island!*/
