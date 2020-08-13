#include <iostream>
#include <string>
#include <cstring>
#include "header.h"

int main(){
    WindowFormatting investmentData;
    bool runningSwitch = true;
    char userInput;
    while (runningSwitch){
        investmentData.printingStars('*');
        cout << endl;
        investmentData.investmentData();
        cout << "Would you like to run the calculator again? y/n" << endl << endl;
        cin >> userInput;
        if (userInput == 'n'){
            runningSwitch = false;
        }
        else {

        }
    }
}