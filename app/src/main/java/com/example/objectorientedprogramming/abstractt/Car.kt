package com.example.objectorientedprogramming.abstractt

class Car(override var model: Int) : Vehicle() {

    override fun vehicleName(name: String): String {
        return name
    }
}