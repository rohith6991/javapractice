/*
4. Create a Student class that represents the following information of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
 */

package com.stackroute.unittest.pe1;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student stu1,Student stu2) {
        if(stu1.getAge()>stu2.getAge())
            return stu1.getAge()-stu2.getAge();
        else if(stu1.getAge()==stu2.getAge()&&!stu1.getName().equals(stu2.getName()))
            return stu1.getName().compareToIgnoreCase(stu2.getName());
        else
            return stu1.getId()-stu2.getId();
    }
}

