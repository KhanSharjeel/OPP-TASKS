#include <iostream>
using namespace std;


class BankAccount {
public:
    int account_number;
    float balance;

    void show_account() {
        cout << "Account Number: " << account_number << endl;
        cout << "Balance: $" << balance << endl;
    }
};


class InterestCalculator {
public:

    virtual void calculate_interest() {
        cout << "Interest calculation (base)" << endl;
    }
};


class SavingsAccount : public BankAccount, public InterestCalculator {
public:

    void calculate_interest() override {
        float interest = balance * 0.05;
        cout << "Interest (5%): $" << interest << endl;
        balance += interest;
    }
};

int main() {

    SavingsAccount acc1;
    acc1.account_number = 12345;
    acc1.balance = 1000.0;


    acc1.show_account();
    acc1.calculate_interest();


    cout << "Updated Balance: $" << acc1.balance << endl;

    return 0;
}
