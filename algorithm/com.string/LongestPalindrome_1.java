package com.string;

/**
 * Created by lenovo on 2018/11/12.
 */
public class LongestPalindrome_1 {
    public static int longestPalindrome(String s) {
        int length = s.length();
        // max：最长回文串的长度
        // c：当前回文串的长度
        int i, j, max, c = 0;
        if(length == 0 || s == null)
            return 0;
        max = 0;
        // 回文串长度为奇数
        for(i = 0; i < length; i++) {
            for(j = 0; (i - j) >= 0 && (i + j) < length; j++) {
                if(s.charAt(i - j) != s.charAt(i + j))
                    break;
                c = j * 2 + 1;
            }
            if(c > max)
                max = c;
        }

        // 回文串长度为偶数
        for(i = 0; i < length; i++) {
            for(j = 0; (i - j) >= 0 && (i + j + 1) < length; j++) {
                if(s.charAt(i - j) != s.charAt(i + j + 1))
                    break;
                c = j * 2 + 2;
            }
            if(c > max)
                max = c;
        }
        return max;
    }


    public static void main(String[] args) {

        String s = "abcdcba";
        System.out.println(LongestPalindrome_1.longestPalindrome(s));
    }
}
