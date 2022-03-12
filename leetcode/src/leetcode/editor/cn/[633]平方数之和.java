//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a² + b² = c 。 
//
// 
//
// 示例 1： 
//
// 
//输入：c = 5
//输出：true
//解释：1 * 1 + 2 * 2 = 5
// 
//
// 示例 2： 
//
// 
//输入：c = 3
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 0 <= c <= 2³¹ - 1 
// 
// Related Topics 数学 双指针 二分查找 👍 331 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
        long high = (int) Math.sqrt(c);
        long low = 0;
        while (low <= high) {
            long rs = low * low + high * high;
            if(rs == c) {
                return true;
            } else if (rs < c) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
