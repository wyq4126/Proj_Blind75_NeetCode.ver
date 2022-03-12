//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 👍 240 👎 0


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  /*
    public String reverseVowels(String s) {
        //'a' 'e' 'i' 'o' 'u'
        ArrayList<Character> vowelList = new ArrayList<>();
        vowelList.add('a'); vowelList.add('e'); vowelList.add('i'); vowelList.add('o'); vowelList.add('u');
        vowelList.add('A'); vowelList.add('E'); vowelList.add('I'); vowelList.add('O'); vowelList.add('U');

        char[] result = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            char cLow = s.charAt(low);
            char cHigh = s.charAt(high);
            while(low < s.length() && vowelList.contains(cLow) == false) { // low这边不是元音
                low++;
            }
            while(high > 0 && vowelList.contains(cHigh) == false) { // high这边不是元音
                high--;
            }
            if(low < high)
                swapItem(result, low, high);
        }
        return new String(result);
    }


    public void swapItem(char arr[], int i, int j) {
        char ch;
        ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }*/
    public String reverseVowels(String s) {
        //'a' 'e' 'i' 'o' 'u'
        ArrayList<Character> vowelList = new ArrayList<>();
        vowelList.add('a'); vowelList.add('e'); vowelList.add('i'); vowelList.add('o'); vowelList.add('u');
        vowelList.add('A'); vowelList.add('E'); vowelList.add('I'); vowelList.add('O'); vowelList.add('U');

        // char的长度由s决定
        char[] result = new char[s.length()];
        int low = 0;
        int high = s.length() - 1;
        while(low <= high) {
            char cLow = s.charAt(low);
            char cHigh = s.charAt(high);
            if(!vowelList.contains(cLow)) {
                result[low] = cLow;
                low++;
            } else if(!vowelList.contains(cHigh)) {
                result[high] = cHigh;
                high--;
            } else {
                result[low] = cHigh;
                result[high] = cLow;
                low++;
                high--;
            }
        }
        // char -> string的方法
        return new String(result);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
