package com.example.encapsulation

// this is Product class with two private properties of name and price with String  and double datatype
class Product (private var name: String , private var price: Double) {

    fun setName(name: String) { // method to setName with attribute name of type String
        this.name = name
    }

    fun getName(): String {  // method to get name of type String
        return name   // return product name
    }

    fun setPrice(price: Double){ // method to set Price with attribute price of type Double
        if (price > 0){ // Check if price is greater than 0 then set price
            this.price = price
        }else{ // if price is lessthan 0 show message
            println("Price must be greater than 0")
        }
    }
    fun getPrice(): Double{ // method to get price of type Double
        return price  // return product price
    }


}