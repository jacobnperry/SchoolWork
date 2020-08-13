#include "header.h"
#include <string>
#include <cstring>
#include <stdlib.h>


using namespace std;



        //prints initial table to intake user data for calculations.
        void WindowFormatting::printingStars(char stars){

            bool endLoop = false; //bool that controls the top border of table.
            int lineIndex = 0;

            while (!endLoop){
                int x = 0;

                if (lineIndex == 0){
                for (x = 0;x < 30; x++){
                    cout << stars;
                }
                cout << endl;
                lineIndex = 1;
                }
                else if (lineIndex == 1){
                    for (x = 0; x < 9; x++){
                        cout << stars;
                    }



                    for (int y = 0; y < 10; y++){
                        cout << stars;
                    }
                cout << endl;

                }

                buildDataTable(); //calls function that exports the table showing user defined values.
                cin >> initInvest;

                buildDataTable(); //as the data table function is called it's updated with the user data and displayed upon each call.
                cin >> monthDepo;                

                buildDataTable();
                cin >> annualInt;                

                buildDataTable();
                cin >> numYears;  

                buildDataTable();

                cout << endl;
              
                bool reportOutput = false;
                while(!reportOutput){
                cout << "Would you like to see your investment report? y/n" << endl; //allows the user to go back and edit any input of their choice.
                
                
                try {                 
                    cin >> userCont;
                    buildDataTable();

                   
                    if (userCont == 'y'){
                    endLoop = true;
                    reportOutput = true;
                    }
                
                        else{

                        cout << "Which value would you like to edit?" << endl;  //takes user input for which value they would like to edit prior to running calculator.
                        buildDataTable();
                        cin >> userEditTable;
                        if (userEditTable == 1) {
                            cout << "Enter new value: " << endl;
                            cin >> initInvest;
                        }
                        else if (userEditTable == 2){
                            cout << "Enter new value: " << endl;
                            cin >> monthDepo;
                        }
                        else if (userEditTable == 3){
                            cout << "Enter new value: " << endl;
                            cin >> annualInt;                            
                        }
                        else if (userEditTable == 4){
                            cout << "Enter new value: " << endl;
                            cin >> numYears;                        
                        } 
                        else {

                        }
                        }
                    
                }
                        catch(const char * str){
                            cout << "An error was encountered";
                       }
                }
                }
                }    
            

        
    // function used to display table showing the user inputs.
    void WindowFormatting::buildDataTable(){
                cout << "1: Initial Investment Amount: " << initInvest << endl;
                cout << "2: Monthly Deposit: " << monthDepo << endl;
                cout << "3: Annual Interest: " << annualInt << endl;
                cout << "4: Number of years: " << numYears << endl;
                cout << "Enter value" << endl;

    }



