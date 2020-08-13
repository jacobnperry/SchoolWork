#include <iostream>
#include <vector>
#include <string>
#include <cstring>

#ifdef HEADER_H
#define HEADER_H

using namespace N;
using namespace std;

class EmployeePerson()
    {
   public:
      EmployeePerson();
      EmployeePerson(string empFullName, string empDepartmentCode,
                     string empBirthday, int empAnnualSalary);
      void SetData(string empFullName, string empDepartmentCode,
                   string empBirthday, int empAnnualSalary);
      void PrintInfo();

   protected:
      string fullName;     // Format: last name, first name
      string departmentCode;
      string birthday;
      int annualSalary;           
    };
#endif