

#include <cstdio>
int counter = 0;
int climbStairs(int n) {
        if (n <= 3) return n;

        int prev1 = 3, prev2 = 2;

        int curr;

        for (int i = 3; i < n; i++) {
                curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;
        }
        return curr;
}

int main() {
        printf("%d\n", climbStairs(4));
}