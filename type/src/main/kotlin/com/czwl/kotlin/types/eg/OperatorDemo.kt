package com.czwl.kotlin.types.eg

/**
 * @author  CZ
 * @date  2020/2/10 10:29
 * @version 1.0
 */

fun main() {
    "Hello"=="World"
    "Hello".equals("World")

    2+3
    2.plus(3)
    val list= listOf(1,2,3,4)

    2 in list
    list.contains(2)
    val map=mutableMapOf(
        "Hello" to 2,
        "World" to 3
    )
    val value =map["Hello"]  //get方法

    val func =fun(){
        println("Hello")
    }

    /*
    func()和func.invoke()完全一样
     */
    func()
    func.invoke()
}