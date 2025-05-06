#include <iostream>
#include <cmath>

using namespace std;


class Calculator {
public:

    float add(float a, float b) {
        return a + b;
    }

    float subtract(float a, float b) {
        return a - b;
    }

    float multiply(float a, float b) {
        return a * b;
    }

    float divide(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            cout << "Error: Division by zero!" << endl;
            return 0;
        }
    }
};


class ScientificCalculator : public Calculator {
public:

    float square_root(float x) {
        return sqrt(x);
    }

    float power(float x, float y) {
        return pow(x, y);
    }
};

int main() {

    ScientificCalculator sciCalc;


    cout << "Basic Calculator Operations:" << endl;
    cout << "Addition: 5 + 3 = " << sciCalc.add(5, 3) << endl;
    cout << "Subtraction: 5 - 3 = " << sciCalc.subtract(5, 3) << endl;
    cout << "Multiplication: 5 * 3 = " << sciCalc.multiply(5, 3) << endl;
    cout << "Division: 5 / 2 = " << sciCalc.divide(5, 2) << endl;


    cout << "\nScientific Calculator Operations:" << endl;
    cout << "Square root of 16 = " << sciCalc.square_root(16) << endl;
    cout << "Power: 2^3 = " << sciCalc.power(2, 3) << endl;

    return 0;
}
