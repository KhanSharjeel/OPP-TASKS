#include <iostream>

using namespace std;

int addition(int a, int b);
int subtraction(int a, int b);
double division(int a, int b);
int multiplication(int a, int b);

void menu() {
    int choice;
    int num1, num2;
    cout << "Enter your options" << endl;
    cout << "1. Addition" << endl;
    cout << "2. Subtraction" << endl;
    cout << "3. Division" << endl;
    cout << "4. Multiplication" << endl;
    cout << "5. Power" << endl;

    cout << "Enter your choice: ";
    cin >> choice;

    if (choice == 5) {
        cout << "Enter the base number: ";
        cin >> num1;
        cout << "Enter the exponent: ";
        cin >> num2;
        cout << "Result: " << (num1, num2) << endl;
    } else {
        cout << "Enter the first number: ";
        cin >> num1;
        cout << "Enter the second number: ";
        cin >> num2;

        if (choice == 1) {
            cout << "Result: " << addition(num1, num2) << endl;
        } else if (choice == 2) {
            cout << "Result: " << subtraction(num1, num2) << endl;
        } else if (choice == 3) {
            if (num2 == 0) {
                cout << "Error: Division by zero." << endl;
            } else {
                cout << "Result: " << division(num1, num2) << endl;
            }
        } else if (choice == 4) {
            cout << "Result: " << multiplication(num1, num2) << endl;
        } else {
            cout << "Invalid choice!" << endl;
        }
    }
}

int addition(int a, int b) {
    return a + b;
}

int subtraction(int a, int b) {
    return a - b;
}

double division(int a, int b) {
    return a / b;
}

int multiplication(int a, int b) {
    return a * b;
}

int main() {
    menu();
    return 0;
}
