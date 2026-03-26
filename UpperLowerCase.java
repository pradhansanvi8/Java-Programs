#include <iostream>
#include <cctype>  
using namespace std;

int main() {
    char str[100];
    int upper = 0, lower = 0, digits = 0, spaces = 0;

    cout << "Enter a string: ";
    cin.getline(str, 100);

    for (int i = 0; str[i] != '\0'; i++) {
        if (isupper(str[i]))
            upper++;
        else if (islower(str[i]))
            lower++;
        else if (isdigit(str[i]))
            digits++;
        else if (isspace(str[i]))
            spaces++;
    }

    cout << "\nStatistics:\n";
    cout << "Uppercase letters: " << upper << endl;
    cout << "Lowercase letters: " << lower << endl;
    cout << "Digits: " << digits << endl;
    cout << "Spaces: " << spaces << endl;

    return 0;
}