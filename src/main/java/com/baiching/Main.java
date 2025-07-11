package com.baiching;

import com.baiching.array.FirstOccurance;
import com.baiching.array.RemoveElement;

public class Main {
    public static void main(String[] args) {
        FirstOccurance ft = new FirstOccurance();
        String haystack = "a";
        String needle = "a";

        System.out.println(ft.strStr(haystack, needle));
    }
}