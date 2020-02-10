package com.czwl.kotlin.builtintypes.eg

import java.lang.Exception

/**
 * @author  CZ
 * @date  2020/1/31 12:16
 * @version 1.0
 */
/**
 * input: 3 * 4
 */
fun main(vararg args: String) {
    if (args.size < 3) {
        return showHelp()
    }

    val operators= mapOf(
        "+" to ::plus,
        "-" to ::minus,
        "*" to ::times,
        "/" to ::div

    )
    val op=args[1]
    val opFunc=operators[op]?:return showHelp() //如果是空值，直接返回showHelp()
    //注意参数就只有两个参数，第三个是返回值，
    //而且Function2也是说明有两个参数
    try {
        println("Input:${args.joinToString(" ")}")
        println("Output:${opFunc(args[0].toInt(),args[2].toInt())}")

    } catch (e:Exception){
        println("Invalid Arguments.")

        showHelp()
    }

}



fun plus(arg0: Int, arg1: Int): Int {

    return arg0+arg1
}

fun minus(arg0: Int, arg1: Int): Int {

    return arg0-arg1
}
fun times(arg0: Int, arg1: Int): Int {

    return arg0*arg1
}
fun div(arg0: Int, arg1: Int): Int {

    return arg0/arg1
}
fun showHelp():Unit {

    println("""
        Simple Calculator
        Input:3*4
        Output:12
    """.trimIndent())
}