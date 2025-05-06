#include <iostream>
using namespace std;

class Student {
private:
    string name;

public:

    Student(string n) {
        name = n;
        cout << "Student object for " << name << " has been created." << endl;
    }

    void display() {
        cout << "Student Name: " << name << endl;
    }


    ~Student() {
        cout << "Student object for " << name << " is destroyed." << endl;
    }
};

int main() {

    Student* s = new Student("Ali");


    s->display();

    delete s;

    return 0;
}
