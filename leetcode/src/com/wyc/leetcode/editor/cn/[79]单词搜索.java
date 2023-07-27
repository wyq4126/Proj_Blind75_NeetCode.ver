  //给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 示例 1： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCCED"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"SEE"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCB"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board 和 word 仅由大小写英文字母组成 
// 
//
// 
//
// 进阶：你可以使用搜索剪枝的技术来优化解决方案，使其在 board 更大的情况下可以更快解决问题？ 
// Related Topics 数组 回溯 矩阵 👍 1634 👎 0

  
  //给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 示例 1： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCCED"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"SEE"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCB"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board 和 word 仅由大小写英文字母组成 
// 
//
// 
//
// 进阶：你可以使用搜索剪枝的技术来优化解决方案，使其在 board 更大的情况下可以更快解决问题？ 
// Related Topics 数组 回溯 矩阵 👍 1634 👎 0

  
  package com.wyc.leetcode.editor.cn;

  import java.util.HashMap;
  import java.util.Map;

  public class WordSearch{
      public static void main(String[] args) {
           Solution solution = new WordSearch().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {
//        int ROWS = board.length, COLS = board[0].length;

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if(dfs(r, c, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int row, int column, int i, String word, char[][] board) {
        // 边界条件
        if(i >= word.length()) {
            return true;
        }
        if(row < 0 || column < 0 ||
           row >= board.length || column >= board[0].length) {
            return false;
        }

        // 正儿八经做判断word里的字符是否等于矩阵里的
        if(word.charAt(i) != board[row][column]) {
            return false;
        }

        /****************************/
        // r,c已经在path里了（这里如何判断
//        if(board[row][column] == '$') {
//            return false;
//        }

        char c = board[row][column];
        // 直接加入visited里
        board[row][column] = '$';

        boolean res = (dfs(row + 1, column, i + 1, word, board) ||
                       dfs(row - 1, column, i + 1, word, board) ||
                       dfs(row, column + 1, i + 1, word, board) ||
                       dfs(row, column - 1, i + 1, word, board));
        board[row][column] = c;
        return res;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }