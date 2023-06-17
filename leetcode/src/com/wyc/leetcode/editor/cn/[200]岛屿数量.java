  //给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] 的值为 '0' 或 '1' 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 2203 👎 0

  
  //给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] 的值为 '0' 或 '1' 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 2203 👎 0

  
  package com.wyc.leetcode.editor.cn;

  import java.util.ArrayList;
  import java.util.LinkedList;
  import java.util.Queue;

  public class NumberOfIslands{
      public static void main(String[] args) {
           Solution solution = new NumberOfIslands().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIslands(char[][] grid) {

        if(grid.equals(null)) {
            return 0;
        }

        int rows = grid.length, cols = grid[0].length;
        int islandCount = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    bfs(r, c, grid);
                    islandCount += 1;
                }
            }
        }

        return islandCount;
    }

    public void bfs(int r, int c, char[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            r = cur[0]; c = cur[1];

            if( r >= 0 && r < grid.length
            &&  c >= 0 && c < grid[0].length
            && grid[r][c] == '1') {
                grid[r][c] = '0';
                q.add(new int[] {r + 1, c});
                q.add(new int[] {r - 1, c});
                q.add(new int[] {r, c + 1});
                q.add(new int[] {r, c - 1});
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }