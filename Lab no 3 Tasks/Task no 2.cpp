#include <iostream>
using namespace std;

class Person {
private:
    int age;

public:

    Person() {
        age = 0;
    }


    void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            cout << "Error: Age cannot be negative!" << endl;
        }
    }


    int getAge() const {
        return age;
    }
};

int main() {
    Person p;


    p.setAge(25);
    cout << "Age: " << p.getAge() << endl;


    p.setAge(-5);
    cout << "Age after invalid input: " << p.getAge() << endl;

    return 0;
}
