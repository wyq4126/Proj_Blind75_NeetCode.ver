//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "aba"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abca"
//输出: true
//解释: 你可以删除c字符。
// 
//
// 示例 3: 
//
// 
//输入: s = "abc"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 由小写英文字母组成 
// 
// Related Topics 贪心 双指针 字符串 👍 459 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) {
                return isPalindrome(s, low+1, high) || isPalindrome(s, low, high-1);
            }
            low++;
            high--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int low, int high) {
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) {
                // 不相等，不是回文
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
