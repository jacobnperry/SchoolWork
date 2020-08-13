/* 
Name:Jacob Perry
Date: 7/19/20
 */

#include <iostream>
#include <vector>
#include <string>
#include <cstring>
#include <ctime>

using namespace std;
//grabs the time from the system clock of the user.
time_t currentTime = time(NULL);
tm *tm_local = localtime(&currentTime); 

//sets the variables for each of the components of the clock to the current values based on the system running the script
int seconds = tm_local->tm_sec;
int minutes = tm_local->tm_min;
int milHour = tm_local->tm_hour;
int stanHour;
int userInput = 0; 
const int lineLength = 40; // hard coded the length of the menu for better formatting.

// created the text output for the menus as character arrays to utilize their length and append asterisk for menu formatting.
char addHour[] = "1 - Add One Hour"; 
char addMinute[] = "2 - Add One Minute";
char addSecond[] = "3 - Add One Second";
char exitProgram[] = "4 - Exit Program";
char milClock[] = "24-Hour Clock";
char standClock[] = "12-Hour Clock";

int addingTime (int addTime){
    addTime++;
    return addTime;
}


void timeSpacingStandard (int timeText){
        for (int i = 0; i < lineLength*2; i++){
            cout << "*";
        }
        cout << endl;

        cout << "*            "  << standClock << "             *" << "*            "  << milClock << "             *" << endl;
        cout << "*               " << stanHour << ":" << minutes << ":" << seconds << "                *" << "*               " << milHour << ":" << minutes << ":" << seconds << "                *" << endl;

        for (int i = 0; i < lineLength *2; i++){
            cout << "*";
        }

}


//function that can be reused to print out the menu for the user to interact with.
void starSpacing (char lineText[]){
        cout << "* " << lineText;
        for (int i = 1; i < ((lineLength - strlen(lineText)) - 1); i++){
            if (i == (lineLength - strlen(lineText))-2){
                cout << "*";
            }
            else {
                cout << " ";
            }
        }
}

int timeConversion (int militaryHour){
    if (militaryHour == 0){
        stanHour = 12;
    }
    else if (militaryHour >= 1 && militaryHour <13){
        stanHour = militaryHour;
    }
    else if (militaryHour > 12 && militaryHour < 25){
        stanHour = militaryHour - 12;
    }
    else if (militaryHour > 24 ) {
        militaryHour = 0;

    } 
    return militaryHour;
}


int main(){
    timeConversion(milHour);

    while (userInput < 4){

        timeSpacingStandard(stanHour);
        cout << endl;

        for (int i = 0; i < lineLength; i++){
            cout << "*";
        }
        cout << endl;
        starSpacing(addHour);
        cout << endl;
        starSpacing(addMinute);    
        cout << endl;
        starSpacing(addSecond);        
        cout << endl;
        starSpacing(exitProgram);
        cout << endl;
        for (int i = 0; i < lineLength; i++){
            cout << "*";
        }
        cout << endl;
        cin >> userInput;

        if (userInput == 1) {
            milHour = addingTime(milHour);
            timeConversion(milHour);
        }
        else if(userInput == 2){
            minutes = addingTime(minutes);
            if (minutes > 59){
                minutes = 00;
            }
        }
        else if(userInput == 3){
            seconds = addingTime(seconds);
            if (seconds > 59){
                seconds = 00;
            }
        }
    }
    cout << endl;
}