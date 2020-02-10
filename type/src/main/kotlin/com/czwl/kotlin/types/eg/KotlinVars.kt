package com.czwl.kotlin.types.eg

/**
 * @author  CZ
 * @date  2020/2/9 12:21
 * @version 1.0
 */

class X{
    val b:Int //只读变量，而不是常量
    get() {
    return (Math.random()*100).toInt()
    }
}

fun main() {
    var a=2
    a=3
}