package com.baiching.string;

import java.util.Vector;

public class LastWord {
    public int lengthOfWord(String s) {
        Vector<Integer> vec = new Vector<>();
        Integer counter = 0;
        char[] ss = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(ss[i])) counter++;
            else {
                if (counter > 0) {
                    vec.add(counter);
                    counter = 0;
                }
            }
        }

        if (counter > 0) {
            vec.add(counter);
        }

        return vec.get(vec.size() - 1);
    }
}
