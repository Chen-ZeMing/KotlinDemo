package com.czwl.kotlin.types.eg

import sun.security.krb5.internal.crypto.Des

/**
 * @author  CZ
 * @date  2020/2/10 11:25
 * @version 1.0
 */
//中缀表达式
fun main() {
    println("HelloWorld" rotate 5)
    val desk =Desk()
    val book =Book()
    book on desk
}

infix fun String.rotate(count:Int):String{
    val index=count % length
    return  this.substring(index)+this.substring(0,index)
}


class Book
class Desk
infix fun Book.on(desk:Desk) {}