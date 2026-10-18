package oct_18;
//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom 
// right, which minimizes the sum of all numbers along its path.

class main_1 {

    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] dp = new int[m][n];
            dp[0][0] = grid[0][0];

            // first row 
            for (int j = 1; j < n ; j++){
                dp[0][j] = dp[0][j-1] + grid[0][j];
            }

            // first col
            for (int i = 1 ; i < m ; i++){
                dp[i][0] = dp[i-1][0] + grid[i][0];
            }

            for (int i = 1 ; i < m ; i++){
                for (int j = 1 ; j < n ; j++){
                    dp[i][j] = Math.min(dp[i][j-1] , dp[i-1][j]) + grid[i][j];
                }
            }

            return dp[m-1][n-1];
        }
}
    
}