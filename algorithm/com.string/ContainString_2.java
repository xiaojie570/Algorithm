package com.string;

import java.util.Arrays;

/**
 * Created by lenovo on 2018/11/8.
 */
public class ContainString_2 {

    public static boolean contain(String a , String b) {
        int flag = 0;
        for(int i = 0; i < a.length(); i++) {
            flag |= (1 << a.charAt(i) - 'A');
        }
        for(int i = 0; i < b.length(); i++) {
            if ((flag & (1 << (b.charAt(i) - 'A'))) == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "ABCD", b = "AA";
        System.out.println(contain(a,b));
    }
}
