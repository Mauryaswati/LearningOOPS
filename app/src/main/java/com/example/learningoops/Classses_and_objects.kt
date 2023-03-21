package com.example.learningoops


// classes and objects are used to represent objects in the real world.
// A class is a blueprint for creating objects (a particular data structure),
// providing initial values for state (member variables or fields),
// and implementations of behavior (member functions or methods).
//An object is an instance of a class and has its own state and behavior.
// You can create multiple objects from the same class, each with its own unique state.

class car /* class name  */ {   // header of class  :-
    lateinit var /*lateinit is intialized when requried acces in future */ name   /*variable name */ : /*type */ String//  class property
    lateinit var color : String
    fun printinfo() : String {  // member function
        return "car name : $name \n car color $color "
    }
}
fun main() {  //  main function
    val mycar = car()   // creating a objects
    mycar.color = "red"  // initialization of object
    mycar.name = "BMW"
    println(mycar.printinfo())   // calling the member function

}


