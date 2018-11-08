package com.string;

import java.util.Arrays;

/**
 * Created by lenovo on 2018/11/8.
 */
public class ContainString_1 {

    public static boolean contain(String a , String b) {
        Arrays.sort(a.toCharArray());
        Arrays.sort(b.toCharArray());
        for(int pa = 0, pb = 0; pb < b.length();) {

            while(pa < a.length() && b.charAt(pb) > a.charAt(pa)) {
                pa ++;
            }
            if(pa >= a.length() || a.charAt(pa) > b.charAt(pb))
                return false;
            ++ pb;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "ABCD", b = "AE";
        System.out.println(contain(a,b));
    }
}
