package com.string;

/**
 * Created by lenovo on 2018/11/15.
 */
public class CalcAllPermutation {
    public void calcAllPermutation(char[] arr, int from, int to) {

        if(to <= 1)
            return;
        if(from == to) {
            for(int i = 0; i <= to; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for(int j = from; j <= to; j++) {
                char temp = arr[j];
                arr[j] = arr[from];
                arr[from] = temp;
                calcAllPermutation(arr, from + 1, to);
                temp = arr[j];
                arr[j] = arr[from];
                arr[from] = temp;
            }
        }
    }

    public static void main(String[] args) {
        CalcAllPermutation cp = new CalcAllPermutation();
        String s = "abc";
        cp.calcAllPermutation(s.toCharArray(),0,2);
    }
}
