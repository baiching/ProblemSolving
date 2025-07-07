package com.baiching.array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int roman2int(String s) {
        int output = 0;
        int current = 0;

        for (int i = s.length() - 1; i >= 0 ; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }
            if (current * 4 < output) output = output - current;
            else output += current;
        }

        return output;
    }
}
