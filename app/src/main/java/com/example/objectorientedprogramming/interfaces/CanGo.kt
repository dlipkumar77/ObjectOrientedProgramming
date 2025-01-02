package com.example.objectorientedprogramming.interfaces

interface CanGo {

    fun go(){
        println("vehicles can go.")
    }

    val name:String
        //get() = "Ferrari"  --> no error in main interface class file (vehicle class )
}