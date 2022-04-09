package month_2;

public class LC220215 {
}
/*function longestPalindrome(s: string): string {
    let Resleft = 0;
    let Resright = 0;
    let maxLen = 0;

    let i = 0; //设i为中心的索引
    while(i < s.length) {
        let left = i - 1;
        while (left >= 0 && s[i] === s[left]) {
            left--;
        }
        let right = i + 1;
        while (right < s.length && s[i] === s[right]) {
            right++;
        }
        const end = right; //这里的right是右边第一个跟中心s[i]不相等的字符索引，保存下来，等会i直接跳到end处，可减少重复中心的计算
        while (left >= 0 && right < s.length && s[left] === s[right]) {
            left--;
            right++;
        }
        if (maxLen < right - left - 1) {
            maxLen = right - left - 1;
            Resleft = left + 1;
            Resright = right - 1;
        }
        i = end;
    }
    return s.substring(Resleft, Resright + 1);
};

作者：yuan-xing-ke-w
链接：https://leetcode-cn.com/problems/longest-palindromic-substring/solution/dou-yin-dian-shang-mian-shi-ti-tszhong-x-oj6d/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/