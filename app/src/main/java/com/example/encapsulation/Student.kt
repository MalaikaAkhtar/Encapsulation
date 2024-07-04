package com.example.encapsulation

// this is student class with two private properties of name and grade with String datatype
class Student(private var name: String, private var grade: String) {

    fun setName(name: String) { // method to setName with attribute name of type String
        this.name = name
    }

    fun getName(): String {  // method to get name
        return name   // return student name
    }

    fun setGrade(grade: String) {  // method to set grade with attribute grade of type String
        if (grade == "A" || grade == "B" || grade == "C" || grade == "D" || grade == "F" ) { // check the valid grade
            this.grade = grade
        } else {  // if grade is valid it will save grade otherwise show the message
            println("Invalid grade. Please enter valid grades. Valid grades are A, B, C, D, and F.")
        }
    }

    fun getGrade(): String { // method to get grade
        return grade    // return student grade
    }
}

