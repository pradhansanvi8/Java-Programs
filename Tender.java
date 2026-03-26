#include <iostream>
using namespace std;

class Tender {
    float cost;
    char company[50];

public:
    void getData() {
        cout << "Enter company name: ";
        cin >> company;
        cout << "Enter cost: ";
        cin >> cost;
    }

    float getCost() {
        return cost;
    }

    char* getCompany() {
        return company;
    }
};

int main() {
    Tender t[5];

    cout << "Enter details for 5 tenders:\n";
    for (int i = 0; i < 5; i++) {
        cout << "\nTender " << i + 1 << ":\n";
        t[i].getData();
}
    float minCost = t[0].getCost();
    int minIndex = 0;

    for (int i = 1; i < 5; i++) {
        if (t[i].getCost() < minCost) {
            minCost = t[i].getCost();
            minIndex = i;
        }
    }

    cout << "\nCompany with minimum cost: "
         << t[minIndex].getCompany() << endl;
    cout << "Minimum cost: " << minCost << endl;

    return 0;
}