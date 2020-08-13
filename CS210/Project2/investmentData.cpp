#include "header.h"
#include <string>
#include <cstring>
#include <stdlib.h>
#include <iomanip>

using namespace std;

//Intakes investment total for each year and iterates through yearly investments.
double WindowFormatting::investmentCalc(double yearEndBal){
    double interestRate = (annualInt / 100)/12;
    double openingAmount = yearEndBal;
    closingBalance = yearEndBal;
    runningInterest = (openingAmount + monthDepo) * interestRate;
    closingBalance = openingAmount + runningInterest;

    return closingBalance;
}

//used for formatting the table that outputs the user inputted data and interacts with calc
void WindowFormatting::investmentData(){


        if(monthDepo < 0){
            cout << "Balance and interest without additional monthly deposits" << endl;
            int x = 60;
            for (int y = 0; y < x; y++){
                cout << "=";
            }
            cout << endl;
            cout << "Year" << "       " << "Year End Balance" << "       "  << "Year End Earned Interest" << endl;
            for ( int y = 0; y < x ; y++){
                cout << "-";
            }
            cout << endl;
                double yearEndBal = initInvest; 

            for (double y = 1; y <= numYears; y++){ //calls the investment calculator function and is feeding in the total investment based upon the year.
                yearEndBal = investmentCalc(yearEndBal); 


                cout << fixed << setprecision(2) << y << "             " << yearEndBal << "                 " << runningInterest << endl;
    }
        }
        else {
    

                cout << "Balance and interest with additional monthly deposits" << endl;
                int x = 60;
                for (int y = 0; y < x; y++){
                    cout << "=";
                }
                cout << endl;
                cout << "Year" << "       " << "Year End Balance" << "       "  << "Year End Earned Interest" << endl;
                for ( int y = 0; y < x ; y++){
                    cout << "-";
                }
                cout << endl;
                    double yearEndBal = initInvest; 

                for (double y = 1; y <= numYears; y++){
                yearEndBal = investmentCalc(yearEndBal); 


                cout << fixed << setprecision(2) << y << "             $" << yearEndBal << "                 $" << runningInterest << endl;
            }
        }




};

