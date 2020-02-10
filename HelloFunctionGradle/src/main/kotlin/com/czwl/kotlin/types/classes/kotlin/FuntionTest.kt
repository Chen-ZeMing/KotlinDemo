package com.czwl.kotlin.types.classes.kotlin

import com.czwl.kotlin.builtintypes.eg.times

/**
 * @author  CZ
 * @date  2020/2/1 15:47
 * @version 1.0
 */
fun main() {

    fun String.isEmail() {

    }
    "admin@czwl.com".isEmail()
    fun String.padding(count: Int, char: Char = ' '): String {
        val padding = (1..count).joinToString("") { char.toString() }
        return "${padding}${this}"
    }
    println("Hello".padding(10))
fun String.times(count:Int):String{
    return (1..count).joinToString(""){this}
}
    println("${"*".times(10)}")

}
