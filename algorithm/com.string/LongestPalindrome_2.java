package com.string;

/**
 * Created by lenovo on 2018/11/14.
 */
public class LongestPalindrome_2 {
    public static int Manacher(String s) {

        StringBuilder sb = new StringBuilder();
        // mx是最大回文子串的边界
        int mx = 0;
        // id是最大回文子串的中心位置
        int id = 0;
        int i;
        int ret = 0; // 返回的最长子串的长度
        sb.append("$#");
        for( i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        s = sb.toString();
        int[] p = new int[s.length()];
        for(i = 1; i < sb.length(); i++) {
            if(mx > i)
                p[i] = Math.min(p[2 * id - i ],mx - i);
            else
                p[i] = 1;


            while(((i - p[i])>=0) && ((i + p[i])<s.length()) && (s.charAt(i + p[i]) == s.charAt(i - p[i])))
                p[i] ++;
            if(mx < i + p[i]) {
                mx = p[i] + i;
                id = i;
            }
            if(ret < p[i])
                ret = p[i];
        }

        return ret - 1;
    }

    public static void main(String[] args) {
        System.out.println(Manacher("aba"));
    }

}
