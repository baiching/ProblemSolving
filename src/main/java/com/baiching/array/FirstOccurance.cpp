#include<iostream>

int funcToFind(std::string haystack, std::string needles) {
    for (int i = 0; i < haystack.length(); ++i) {
            if (haystack.substr(0, needles.length()) == needles) {
                return i;
            }
    }
    return -1;
}