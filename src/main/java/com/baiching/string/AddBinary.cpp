#include <bitset>
#include <iostream>
#include <string>

std::string addBinary(std::string a, std::string b) {
    int var_a = std::bitset<8>(a).to_ulong();
    int var_b = std::bitset<8>(b).to_ulong();

    std::string out = std::bitset<8>(var_a + var_b).to_string();
    out.erase(0, out.find_first_not_of('0'));
    if (out.empty()) out = "0";
    return out;
}

int main() {
    std::cout<< addBinary("1010", "1011");
    return 0;
}
