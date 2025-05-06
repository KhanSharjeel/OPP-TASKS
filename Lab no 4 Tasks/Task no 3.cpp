#include <iostream>
using namespace std;


class Product {
public:
    string name;
    float price;
    int quantity;
};


class Inventory {
public:
    Product products[5];
    void inputProducts() {
        for (int i = 0; i < 5; i++) {
            cout << "\nEnter details for Product " << i + 1 << ":\n";
            cout << "Name: ";
            cin >> products[i].name;
            cout << "Price: ";
            cin >> products[i].price;
            cout << "Quantity: ";
            cin >> products[i].quantity;
        }
    }

    void showExpensiveProducts() {
        cout << "\nProducts with total value above $500:\n";
        for (int i = 0; i < 5; i++) {
            float total = products[i].price * products[i].quantity;
            if (total > 500) {
                cout << "Name: " << products[i].name
                     << ", Price: $" << products[i].price
                     << ", Quantity: " << products[i].quantity
                     << ", Total: $" << total << endl;
            }
        }
    }
};

int main() {
    Inventory inv;
    inv.inputProducts();
    inv.showExpensiveProducts();
    return 0;
}
