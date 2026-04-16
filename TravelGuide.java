#include <iostream>
using namespace std;

class AbstractProduct {
protected:
    int id;
public:
    virtual void get() = 0;
    virtual void show() = 0;
};

class Book : public AbstractProduct {
public:
    void get() { cin >> id; }
    void show() { cout << "TRAVEL_GUIDE Book ID: " << id << endl; }
};

class CD : public AbstractProduct {
public:
    void get() { cin >> id; }
    void show() { cout << "CD ID: " << id << endl; }
};

int main() {
    AbstractProduct *p;
    Book b; CD c;

    p = &b; p->get(); p->show();
    p = &c; p->get(); p->show();

    return 0;
}