package com.string;

import sun.security.util.LegacyAlgorithmConstraints;

/**
 * 给定一个字符串，要求将字符串前面的若干个字符移到字符串的尾部。
 * 例如：将字符串“abcdef”的前3个字符'a'，'b'，'c'移动到字符串的尾部，那么原字符串将变成"defabc"。
 *
 * Created by lenovo on 2018/11/8.
 */
public class ReverseString {

    public static String reverse(String s, int from, int to) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(from < to) {
            char temp = arr[from] ;
            arr[from] = arr[to];
            arr[to] = temp;
            from ++;
            to --;
        }
        for(char i : arr) {
            sb.append(i);
        }

        return sb.toString();
    }

    public  static String LeftRotateString(String s, int n, int m) {
        m %= n;
        s = reverse(s, 0, m - 1);
        s = reverse(s, m, n - 1);
        s = reverse(s, 0, n - 1);
        return s;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        s = LeftRotateString(s,s.length(),3);
        System.out.println(s);
    }
}


