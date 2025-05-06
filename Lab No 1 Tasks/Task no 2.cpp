#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "\nEnter value for a: ";
    cin >> a;
    cout << "Enter value for b: ";
    cin >> b;

    int *ptrA = &a;
    int *ptrB = &b;

    cout << "Value of a using pointer: " << *ptrA << endl;
    cout << "Value of b using pointer: " << *ptrB << endl;

    return 0;
}
