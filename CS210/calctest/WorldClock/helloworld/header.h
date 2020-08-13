// my_class.h
#ifndef MY_CLASS_H // include guard
#define MY_CLASS_H

namespace N
{
    class my_class
    {
    public:
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
}
}

#endif /* MY_CLASS_H */