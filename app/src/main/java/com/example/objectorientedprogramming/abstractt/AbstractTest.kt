package com.example.objectorientedprogramming.abstractt

fun main(args: Array<String>) {

    //var vehicle = Vehicle() // abstract class so object instance cannot create

    var car = Car(2023)
    car.speed = 300
    println("Name : ${car.vehicleName("Ferrari")} \n" +
            "Type : ${car.vehicleType("Car")} \n" +
            "Model : ${car.model} \n" +
            "Speed : ${car.speed}" )
}