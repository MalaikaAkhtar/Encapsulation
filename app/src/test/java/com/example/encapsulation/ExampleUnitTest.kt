package com.example.encapsulation

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun main(){ // this is main function
        val account = BankAccount(1000.0)  // create instance of BankAccount class

        account.deposit(100.0) //calls the deposit method with 100.0 as the argument
        println("Current balance: ${account.currentBalance()}") // It will print Current balance: 100.0

        account.withdraw(50.0) // calls the deposit method with 50.0 as the argument
        println("Current balance: ${account.currentBalance()}") // It will print Current balance: 50.0

        account.withdraw(100.0) // calls the withdraw method with 100.0 as argument
        println("Current balance: ${account.currentBalance()}") // It will print Current balance: 50.0
    }

    @Test
    fun studentMain() { // this is main function for class Student
        val student = Student("", "")  // create instance of Student class
        student.setName("Bisma")  // call the setName method with name (Bisma) as the argument
        println("Student's name: ${student.getName()}") // print student name

        student.setGrade("A")  //call the setGrade method with grade (A) as the argument
        println("Student's grade: ${student.getGrade()}") // print Student grade

        student.setGrade("E") // print an error message because E is not a valid grade
        println("Student's grade: ${student.getGrade()}") // print student grade
    }

    @Test
    fun productMain(){ // this is main function for class Product
        val product = Product("",2000.0) // create instance of Product class
        product.setName("Books") //call the setName method with name (books) as the argument
        println("Product's name: ${product.getName()}") // print product name

        product.setPrice(2000.0) // call the setPrice method with price 2000.0 as the argument
        println("Product's price: ${product.getPrice()}") // print the price
    }

    @Test
    fun carMain(){ // this is main function for class Car
        val car = Car(" "," " ,  100) // create instance of Car class
        car.setMake("Suzuki") //call the setMake method with make (Suzuki) as the argument
        println("Car's make: ${car.getMake()}") // print car make

        car.setModel("2023") // call the setModel method  with model (2023) as argument
        println("Car's Model: ${car.getModel()}") // print model

        car.setMileage(100)// call getMileage method
        println("Car's Mileage: ${car.getMileage()}") // print mileage
    }

    @Test
    fun employeeMain(){// this is main function for class employee
        val employee = Employee ("","",25000.0) //// create instance of Employee class
        employee.setName("Malaika")//call the setName method with name (Malaika) as the argument
        println("Employee's name: ${employee.getName()}")//print name

        employee.setPosition("Android Intern")// call the setPosition method with position argument
        println("Employee's position: ${employee.getPosition()}")// print position

        employee.setSalary(25000.0)// call setSalary method with salary argument
        println("Employee's salary: ${employee.getSalary()}")// print salary

    }
}