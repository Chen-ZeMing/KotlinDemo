package met_println_kotlin

import met_println_kotlin.市委书记.北京.市委书记

/**
 *created by CZWL
 * 2019/12/31 15:03
 */

val arrayOfint: IntArray = intArrayOf(1, 3, 5, 7)

val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')

val arrayOfString: Array<String> = arrayOf("我", "是", "码农")

val arrayOf书记: Array<市委书记> = arrayOf(市委书记("章"), 市委书记("赵"), 市委书记("王"))

fun main(args: Array<String>) {

    println(arrayOfint.size)
    for (int in arrayOfint) {

        println(int)

    }

    println(arrayOf书记[1])
}

