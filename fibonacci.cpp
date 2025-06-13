#include <iostream>
#include <stdexcept>

long long fibonacci(int n) {
    if (n < 0) throw std::invalid_argument("Negative input not allowed");
    if (n == 0) return 0;
    if (n == 1) return 1;
    long long a = 0, b = 1, c;
    for (int i = 2; i <= n; ++i) {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}

int main(int argc, char* argv[]) {
    if (argc != 2) {
        std::cerr << "Usage: " << argv[0] << " <n>\n";
        return 1;
    }
    try {
        int n = std::stoi(argv[1]);
        std::cout << fibonacci(n) << std::endl;
    } catch (const std::invalid_argument& e) {
        if (std::string(e.what()) == "Negative input not allowed") {
            std::cerr << "Negative input not allowed" << std::endl;
        } else {
            std::cerr << "Invalid input" << std::endl;
        }
        return 1;
    } catch (const std::out_of_range&) {
        std::cerr << "Input out of range" << std::endl;
        return 1;
    }
    return 0;
}
