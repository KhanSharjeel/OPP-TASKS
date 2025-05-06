#include <iostream>
using namespace std;

class AverageCalculator {
private:
    int n;
    float sum;

public:
    void inputAndCalculate() {
        sum = 0;
        cout << "Enter the number of values: ";
        cin >> n;

        if (n <= 0) {
            cout << "Invalid number! Please enter a positive number." << endl;
            return;
        }

        for (int i = 1; i <= n; i++) {
            float num;
            cout << "Enter value " << i << ": ";
            cin >> num;
            sum = sum + num;
        }
    }

    void displayAverage() {
        if (n > 0)
            cout << "Average: " << sum / n << endl;
    }
};

int main() {
    AverageCalculator calculator;
    calculator.inputAndCalculate();
    calculator.displayAverage();
    return 0;
}

