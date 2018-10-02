#include <iostream>
#include <vector>
int main() {
    int num, upper, rows = 0;
    std::vector<int> vec;
    std::cout << "Enter number: ";
    std::cin >> num;
    std::cout << "Output:" << std::endl;
    for (int i = 1, j = 1; j <= num; i++, j += i, rows++) {
        upper = j;
    }
    for (int i = upper, j = rows; i > 0; j--) {
        for (int k = 0; k < j; i--, k++) {
            vec.push_back(i);
        }
        for (int k = vec.size() - 1; k >= 0; k--) {
            std::cout << vec[k] << " ";
        }
        std::cout << std::endl;
        vec.clear();
    }
    return 0;
}
