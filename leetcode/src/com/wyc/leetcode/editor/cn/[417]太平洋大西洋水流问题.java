  //有一个 m × n 的矩形岛屿，与 太平洋 和 大西洋 相邻。 “太平洋” 处于大陆的左边界和上边界，而 “大西洋” 处于大陆的右边界和下边界。 
//
// 这个岛被分割成一个由若干方形单元格组成的网格。给定一个 m x n 的整数矩阵 heights ， heights[r][c] 表示坐标 (r, c) 上
//单元格 高于海平面的高度 。 
//
// 岛上雨水较多，如果相邻单元格的高度 小于或等于 当前单元格的高度，雨水可以直接向北、南、东、西流向相邻单元格。水可以从海洋附近的任何单元格流入海洋。 
//
// 返回网格坐标 result 的 2D 列表 ，其中 result[i] = [ri, ci] 表示雨水从单元格 (ri, ci) 流动 既可流向太平洋也可
//流向大西洋 。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
//输出: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
// 
//
// 示例 2： 
//
// 
//输入: heights = [[2,1],[1,2]]
//输出: [[0,0],[0,1],[1,0],[1,1]]
// 
//
// 
//
// 提示： 
//
// 
// m == heights.length 
// n == heights[r].length 
// 1 <= m, n <= 200 
// 0 <= heights[r][c] <= 10⁵ 
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 601 👎 0

  
  //有一个 m × n 的矩形岛屿，与 太平洋 和 大西洋 相邻。 “太平洋” 处于大陆的左边界和上边界，而 “大西洋” 处于大陆的右边界和下边界。 
//
// 这个岛被分割成一个由若干方形单元格组成的网格。给定一个 m x n 的整数矩阵 heights ， heights[r][c] 表示坐标 (r, c) 上
//单元格 高于海平面的高度 。 
//
// 岛上雨水较多，如果相邻单元格的高度 小于或等于 当前单元格的高度，雨水可以直接向北、南、东、西流向相邻单元格。水可以从海洋附近的任何单元格流入海洋。 
//
// 返回网格坐标 result 的 2D 列表 ，其中 result[i] = [ri, ci] 表示雨水从单元格 (ri, ci) 流动 既可流向太平洋也可
//流向大西洋 。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
//输出: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
// 
//
// 示例 2： 
//
// 
//输入: heights = [[2,1],[1,2]]
//输出: [[0,0],[0,1],[1,0],[1,1]]
// 
//
// 
//
// 提示： 
//
// 
// m == heights.length 
// n == heights[r].length 
// 1 <= m, n <= 200 
// 0 <= heights[r][c] <= 10⁵ 
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 601 👎 0

  
  package com.wyc.leetcode.editor.cn;

  import java.util.*;

  public class PacificAtlanticWaterFlow{
      public static void main(String[] args) {
           Solution solution = new PacificAtlanticWaterFlow().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS = heights.length, COLS = heights[0].length;
//        HashMap<Integer, Integer> pac = new HashMap<>(), atl = new HashMap<>();
        int[][] pac = new int[ROWS][COLS];
        int[][] atl = new int[ROWS][COLS];
//        HashSet<Integer> pac = new HashSet<>(), atl = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int c = 0; c < COLS; c++) {
            dfs(0, c, pac, heights[0][c]);
            dfs(ROWS - 1, c, atl, heights[ROWS - 1][c]);
        }

        for (int r = 0; r < ROWS; r++) {
            dfs(r, 0, pac, heights[r][0]);
            dfs(r, COLS - 1, atl, heights[r][COLS - 1]);
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if(pac[i][j] != 0 && atl[i][j] != 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    res.add(tmp);
                    tmp.clear(); // clear?
                }
            }
        }

        return res;
    }


    private void dfs(int r, int c, int[][] visit, int prevHeight) {
        if(visit[r][c] != 0 ||
                r < 0 ||
                c < 0 ||
                r == visit.length ||
                c == visit[0].length ||
                visit[r][c] < prevHeight
        ) {
            return;
        }
        visit.
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }