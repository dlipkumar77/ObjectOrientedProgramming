package com.example.objectorientedprogramming.abstractt

abstract class Vehicle {

    /* abstract class used to large project means you can create multiple class so you use some
    function or properties to all class.
    that's time you can create all common function or properties under abstract classes
    prevent the creation of object in this class

     */
    abstract fun vehicleName( name:String) : String

    // non- abstract function
    fun vehicleType(type:String) : String{
        return type
    }

    //abstract property
    abstract var model:Int

    //non- abstract property
    var speed:Int?= null
}