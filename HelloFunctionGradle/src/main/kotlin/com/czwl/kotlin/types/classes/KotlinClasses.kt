package com.czwl.kotlin.types.classes

import com.czwl.kotlin.types.classes.kotlin.SimpleClass

/**
 * @author  CZ
 * @date  2020/1/31 15:42
 * @version 1.0
 */
fun main(){


    val simpleClass=SimpleClass(9,"Hello")
    println(simpleClass.x)
    println(simpleClass.y)
    println(simpleClass.z)
    simpleClass.y()
    simpleClass.zzz("sleeping")
    simpleClass.y()
    println(simpleClass.simpleProperty)
}