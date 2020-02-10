package com.czwl.kotlin.types.classes.kotlin

/**
 * @author  CZ
 * @date  2020/2/1 11:29
 * @version 1.0
 */
class Person (age:Int,name:String){
    var age:Int=age//property
    get(){
        return field
    }
    set(value) {
        println("setAge:$value")
        field=value

    }
    var name:String=name
    get() {return field}//backing field
    set(value){

    }
}
fun main(){
    val  ageRef=Person::age
    val person=Person(18,"W")
    val nameRef=person::name
    nameRef.set("L")
    ageRef.set(person,19)
}
