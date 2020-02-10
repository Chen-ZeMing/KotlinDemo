package com.czwl.kotlin.types.classes.kotlin

/**
 * @author  CZ
 * @date  2020/2/1 16:05
 * @version 1.0
 */
class PoorGuy{
    var pocket:Double=0.0
}
fun PoorGuy.noMoney(){}

//property=backing field +getter+setter
var PoorGuy.moneyLeft:Double
get() {return this.pocket}
set(value) {pocket=value}

interface Guy {
   var moneyLeft:Double
    get() {return 0.0}
    set(value) {}
    fun noMoney(){
        println("no money called.")
    }
}