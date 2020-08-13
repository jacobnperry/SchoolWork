#include <iostream>
#include <string>
#include <cstring>

using namespace std;

//Declaration of functions and protected variables used in program
class WindowFormatting
    {

    public:

        void printingStars(char stars);
        void buildDataTable();
        void investmentData();
        double investmentCalc(double y);

    protected:
        double closingBalance;
        double runningInterest = 0;
        char tempUserInput;
        double initInvest = 0;
        double monthDepo = 0;
        double annualInt = 0;
        double numYears = 0;
        char userCont;
        int userEditTable;


};


