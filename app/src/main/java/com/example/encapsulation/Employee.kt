package com.example.encapsulation

class Employee (private var name : String,
                private var position : String,
                private var salary : Double) {

    fun setName(name: String){ // method to setName with name argument
        this.name = name
    }

    fun getName(): String{  // method to getName of type String
        return name  // return Employee name
    }

    fun setPosition( position: String){ // method to setPosition with position argument
        this.position = position
    }

    fun getPosition(): String{ // method to getModel of type String
        return position  // return model
    }

    fun setSalary(salary: Double){  // method to setMileage with mileage argument
        if (salary >0){ //  check mileage is greater than 0 if greater than 0 than setMileage
            this.salary = salary
        }else{ // ottherwise print message
            println("Mileage must be greater than 0")
        }
    }

    fun getSalary() : Double{ // method to getMake of type Int
        return salary   // return mileage
    }
}