package com.baiching;

import com.baiching.array.RemoveElement;

public class Main {
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] n = {3, 2, 2, 3};
        int val = 3;
        re.removeElements(n, val);
    }
}