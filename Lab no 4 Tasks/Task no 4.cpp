#include <iostream>
using namespace std;

class Computer {
protected:
    int word_size;
    int memory_size;
    int storage_size;
    int speed;

public:
    Computer() {
        word_size = 0;
        memory_size = 0;
        storage_size = 0;
        speed = 0;
    }

    Computer(int w, int m, int s, int sp) {
        word_size = w;
        memory_size = m;
        storage_size = s;
        speed = sp;
    }

    void setSpecs(int memory, int spd) {
        memory_size = memory;
        speed = spd;
    }

    void setSpecs(int memory, int spd, int storage) {
        memory_size = memory;
        speed = spd;
        storage_size = storage;
    }

    void display() {
        cout << "Computer Specifications:";
        cout << "Word Size: " << word_size << " bits";
        cout << "Memory Size: " << memory_size << " MB";
        cout << "Storage Size: " << storage_size << " MB";
        cout << "Speed: " << speed << " MHz";
    }
};

class Laptop : public Computer {
private:
    float length, width, height;
    float weight;

public:
    Laptop() {
        length = width = height = weight = 0.0;
    }

    Laptop(int w, int m, int s, int sp, float l, float wd, float h, float wt)
        : Computer(w, m, s, sp) {
        length = l;
        width = wd;
        height = h;
        weight = wt;
    }

    void display() {
        Computer::display();
        cout << "Laptop Dimensions and Weight:";
        cout << "Length: " << length << " cm";
        cout << "Width: " << width << " cm";
        cout << "Height: " << height << " cm";
        cout << "Weight: " << weight << " kg";
    }
};

int main() {
    Laptop myLaptop(64, 8192, 512000, 2400, 35.0, 24.0, 2.0, 1.8);
    myLaptop.display();
    return 0;
}
