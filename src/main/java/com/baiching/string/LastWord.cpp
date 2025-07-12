#include <iostream>
#include <vector>
using std::vector;
using std::string;
using std::cout;

#define FOR(i, n) for (int i = 0; i < (n); ++i)

int lengthOfLastWord(string s) {
    vector<int> myLength;
    int count = 0;

    for (auto i = 0; i < s.length(); i++) {
        if (isalpha(s[i])) count++;
        else {
            if (count > 0) {
                myLength.push_back(count);
                count = 0;
            }
        }
    }

    if (count > 0) {
        myLength.push_back(count);
    }
    return myLength[myLength.size()-1];
}

int main() {
    string s = "   fly me   to   the moon  ";

    cout << lengthOfLastWord(s);

    return 0;
}
