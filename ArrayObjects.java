#include <iostream>
#include <iomanip>   
using namespace std;

class Item {
    int code;
    float price;

public:
    void getData() {
        cout << "Enter item code: ";
        cin >> code;
        cout << "Enter item price: ";
        cin >> price;
    }

    void putData() {
        cout << setw(10) << code << setw(10) << price << endl;
    }

    float getPrice() {
        return price;
    }
};

int main() {
    Item items[5];
    float total = 0;

    cout << "Enter details for 5 items:\n";
    for (int i = 0; i < 5; i++) {
        cout << "\nItem " << i + 1 << ":\n";
        items[i].getData();
    }

    cout << "\n\nItem Details:\n";
    cout << setw(10) << "Code" << setw(10) << "Price" << endl;
    cout << "----------------------\n";

    for (int i = 0; i < 5; i++) {
        items[i].putData();
        total += items[i].getPrice();
    }

    cout << "----------------------\n";
    cout << setw(10) << "Total" << setw(10) << total << endl;

    return 0;
}