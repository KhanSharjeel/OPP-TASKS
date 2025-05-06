#include <iostream>
using namespace std;

class Temperature {
private:
    double celsius;

public:
    Temperature(double tempCelsius) {
        celsius = tempCelsius;
    }

    double getCelsius() {
        return celsius;
    }

    void setCelsius(double c) {
        celsius = c;
    }

    double getFahrenheit() {
        return (celsius * 9.0 / 5) + 32;
    }

    void setFahrenheit(double f) {
        celsius = (f - 32) * 5.0 / 9;
    }
};

int main() {
    Temperature temp(25);

    cout << "Temperature in Celsius: " << temp.getCelsius() << endl;
    cout << "Temperature in Fahrenheit: " << temp.getFahrenheit() << endl;

    temp.setFahrenheit(98.6);
    cout << "\nAfter setting Fahrenheit to 98.6:" << endl;
    cout << "Temperature in Celsius: " << temp.getCelsius() << endl;
    cout << "Temperature in Fahrenheit: " << temp.getFahrenheit() << endl;

    return 0;
}
