#include <iostream>
using namespace std;

class Point {
    int x, y;

public:
    void setPoint(int a, int b) {
        x = a;
        y = b;
    }

    void displayPoint() {
        cout << "(" << x << ", " << y << ")";
    }
};

class Circle {
    float radius;
    Point center;  

public:
    void getData() {
        int x, y;
        cout << "Enter center coordinates (x y): ";
        cin >> x >> y;
        center.setPoint(x, y);

        cout << "Enter radius: ";
        cin >> radius;
    }

    float area() {
        return 3.14159 * radius * radius;
    }

    void display() {
        cout << "\nCircle Details:\n";
        cout << "Center: ";
        center.displayPoint();
        cout << "\nRadius: " << radius;
        cout << "\nArea: " << area() << endl;
    }
};

int main() {
    Circle c;

    c.getData();
    c.display();

    return 0;
}