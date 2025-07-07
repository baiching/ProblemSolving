package com.baiching.array;

public class Palindrome {
    public boolean isPalidrome(int x){
        int input = x;
        int reverse = 0;

        if (x < 0) return false;

        while (input != 0) {
            reverse = (reverse * 10) + (input % 10);
            input = input / 10;
        }

        return  reverse == x;
    }
}
