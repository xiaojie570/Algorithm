package com.string;

/**
 * 给定一个字符串，如何判断这个字符串是否是回文串？
 * 解法：两头往重甲扫
 *  给定一个字符串，定义两个分别指向字符串的头和尾的指针，然后让这两个指针都往字符串的中间扫描，扫描的过程中。
 *  如果头和尾锁指的字符至始至终都一样，即该字符串尾为回文串。
 * Created by lenovo on 2018/11/11.
 */
public class Palindrome_1 {
    public static boolean isPalidrome(String s) {

        int length = s.length();
        int preIndex = 0, lastIndex = length - 1;

        while(preIndex < lastIndex) {
            if(s.charAt(preIndex ++) == s.charAt(lastIndex --));
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "111我爱我111";
        System.out.println(isPalidrome(s));
    }
}
