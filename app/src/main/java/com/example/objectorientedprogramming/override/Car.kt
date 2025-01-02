package com.example.objectorientedprogramming.override

class Car : Vehicle() {

    fun superStart(){
        super.start()
    }
    fun superAccelerate(){
        super.accelerate(120)
    }
    fun superStop(){
        super.stop()
    }

    override fun start(){
        println("Car has started")
    }

    override fun accelerate(speed:Int){
        println("Car accelerate at $speed .")
    }

    override fun stop()
    {
        println("Car has stopped")
    }
}