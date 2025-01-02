package com.example.objectorientedprogramming

fun main(args: Array<String>) {

    // creating an object from class
    /*

    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2023


    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2024

    println("My first car's name is ${myCar.name} and its model is ${myCar.model}")
    println("My second car's name is ${myCar2.name} and its model is ${myCar2.model}")

     */

    /*

    // normal type constructor example without init method
    var myNewCar = MyCars("Ferrari", 2023)
    println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

     */

    /*

    // primary type constructor example
    var myNewCar = MyCars("Ferrari", 2023)

     */

    // secondary type constructor example

    var  mySecondCar = MySecondCars("Mercedws", 2000)
    //set method
    mySecondCar.name = "Opel"
    mySecondCar.model = 2010  // private so error that's encapsulation not change -- set method use
    println("My second car's name is ${mySecondCar.name} and its model is ${mySecondCar.model}")  // get used

}