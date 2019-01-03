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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public List<Student> studentInfo() {
        Student obj1 = new Student(1, "Swetha", 22);
        Student obj2 = new Student(3, "Sonu", 24);
        Student obj3 = new Student(2, "Bhanu", 20);
        Student obj4 = new Student(4, "Evangeline", 10);
        Student obj5 = new Student(5, "Jaanu", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        System.out.println(list);

        Collections.sort(list, new StudentSorter());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        System.out.println(list);
        return list;
    }
}