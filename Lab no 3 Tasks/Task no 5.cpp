#include <iostream>
using namespace std;

class BankAccount {
private:
    double balance = 0;

public:
    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    double getBalance() { return balance; }
};

int main() {
    BankAccount account;

    account.deposit(200);
    account.deposit(-50);

    account.withdraw(100);
    account.withdraw(700);
    account.withdraw(-30);
    cout << "Final Balance: " << account.getBalance() << endl;

    return 0;
}
