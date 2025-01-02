package com.example.objectorientedprogramming

class MySecondCars {

    var name:String ?= null
    var model:Int? = null
    // private var model:Int? = null  // encapsulation example

//        private  set
//                 get


    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }
}