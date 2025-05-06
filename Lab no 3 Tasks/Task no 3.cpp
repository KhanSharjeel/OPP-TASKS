#include <iostream>
#include <string>

using namespace std;

class Book {
public:
    string title;
    float price;


    Book(string t, float p) : title(t), price(p) {}


    void printBook() const {
        cout << "Title: " << title << ", Price: $" << price << endl;
    }
};

int main() {

    Book* books = new Book[5]{
        Book("Book 1", 45.99),
        Book("Book 2", 59.99),
        Book("Book 3", 35.50),
        Book("Book 4", 65.00),
        Book("Book 5", 75.75)
    };


    cout << "Books with prices above $50:" << endl;
    for (int i = 0; i < 5; ++i) {
        if (books[i].price > 50) {
            books[i].printBook();
        }
    }

    delete[] books;

    return 0;
}
