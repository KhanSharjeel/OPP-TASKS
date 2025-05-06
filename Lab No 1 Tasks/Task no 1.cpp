#include <iostream>
using namespace std;

int main() {
    int data[2][3] = {
        {10, 20, 30},
        {40, 50, 60}
    };


    int total = 0;
    int count = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            total += data[i][j];
            count++;
        }
    }
    float average = (float)total / count;
    cout << "Total: " << total << endl;
    cout << "Average: " << average << endl;


    int rowTotal = 0;
    for (int j = 0; j < 3; j++) {
        rowTotal += data[1][j];
    }
    cout << "Row 1 Total: " << rowTotal << endl;


    int colTotal = 0;
    for (int i = 0; i < 2; i++) {
        colTotal += data[i][0];
    }
    cout << "Column 0 Total: " << colTotal << endl;


    int highestRow = data[0][0];
    for (int j = 1; j < 3; j++) {
        if (data[0][j] > highestRow) {
            highestRow = data[0][j];
        }
    }
    cout << "Highest in Row 0: " << highestRow << endl;


    int highestCol = data[0][2];
    for (int i = 1; i < 2; i++) {
        if (data[i][2] > highestCol) {
            highestCol = data[i][2];
        }
    }
    cout << "Highest in Column 2: " << highestCol << endl;

    return 0;
}
