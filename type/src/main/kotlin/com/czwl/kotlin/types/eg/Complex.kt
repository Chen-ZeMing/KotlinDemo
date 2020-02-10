package com.czwl.kotlin.types.eg

import java.lang.IndexOutOfBoundsException

/**
 * @author  CZ
 * @date  2020/2/9 16:19
 * @version 1.0
 */

//复数的类
class Complex(var real: Double, var image: Double) {

    override fun toString() = "$real+${image}i"

}

operator fun Complex.plus(other: Complex): Complex {
    return Complex(this.real + other.real, this.image + other.image)
}

operator fun Complex.plus(other: Double): Complex {
    return Complex(this.real + other, this.image)
}

operator fun Complex.plus(other: Int): Complex {
    return Complex(this.real + other, this.image)
}

operator fun Complex.minus(real: Double): Complex {
    return Complex(this.real - real, this.image)
}

operator fun Complex.get(index: Int): Double = when (index) {
    0 -> this.real
    1 -> this.image
    else -> throw IndexOutOfBoundsException()
}

fun main() {
    val c1 = Complex(3.0, 4.0)
    val c2 = Complex(2.0, 2.0)

    println(c1 + 2.0)
    println(c1 + c2)
    println(c1 - 3.0)
    println(c1 + 3)

}