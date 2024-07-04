package com.example.encapsulation


// this is Car class with three private properties
class Car (private var make : String, // this is make property of type String
           private  var model : String, // this is model property of type String
           private var mileage : Int) { // this is mileage property of type Int

    fun setMake(make: String){ // method to setMake with make argument
        this.make = make
    }

    fun getMake(): String{  // method to getMake of type String
        return make  // return make
    }

    fun setModel( model: String){ // method to setModel with model argument
        this.model = model
    }

    fun getModel(): String{ // method to getModel of type String
        return model  // return model
    }

    fun setMileage(mileage: Int){  // method to setMileage with mileage argument
        if (mileage >0){ //  check mileage is greater than 0 if greater than 0 than setMileage
            this.mileage = mileage
        }else{ // ottherwise print message
            println("Mileage must be greater than 0")
        }
    }

    fun getMileage() : Int{ // method to getMake of type Int
        return mileage   // return mileage
    }
}