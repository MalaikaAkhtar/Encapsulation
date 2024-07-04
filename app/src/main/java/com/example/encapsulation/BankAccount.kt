package com.example.encapsulation

//This is BankAccount class with private property of balance , datatype  Double
class BankAccount (private var balance : Double){ // class keyword is use for class declaration.

// Deposit Method
    fun deposit(amount: Double){ // this is deposit method with amount parameter of type Double

        if(amount > 0){ // this check is used for deposit amount must be greater than zero

            balance += amount    // if deposit amount is greater than zero then add amount in balance

        }else{    // if amount is else than 0 , show  this message
            println("Deposit amount must be greater than 0")
        }
    }
 //WithDraw Method
    fun withdraw(amount: Double){ // this is withdraw method with amount parameter of type Double

         if (amount > 0 && amount <= balance) { // this check is used for withdraw amount must be greater than 0 and less than balance

         balance -= amount // If statement is true than withdraw the amount

         } else { // otherwise show invalid withdrawal amount message
         println("Invalid withdrawal amount. The current balance is less than entered amount")
         }
    }
 // current balance
    fun currentBalance() : Double{  //this is currentBalance method of type double and it will return current balance
        return balance
    }
}

// fun main(){   // this is main function
//    val account = BankAccount(1000.0)  // create instance of BankAccount class
//
//    account.deposit(100.0) //calls the deposit method with 100.0 as the argument
//    println("Current balance: ${account.currentBalance()}") // It will print Current balance: 100.0
//
//    account.withdraw(50.0) // calls the deposit method with 50.0 as the argument
//    println("Current balance: ${account.currentBalance()}") // It will print Current balance: 50.0
//
//    account.withdraw(100.0) // calls the withdraw method with 100.0 as argument
//    println("Current balance: ${account.currentBalance()}") // It will print Current balance: 50.0
//
//}