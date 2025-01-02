package com.example.objectorientedprogramming

class MyCars constructor(var name:String, var model:Int) {

    // type sout error why because its primary constructor  so inti method need

    init {
        println("My car's name is ${name} and its model is ${model}")
    }
}