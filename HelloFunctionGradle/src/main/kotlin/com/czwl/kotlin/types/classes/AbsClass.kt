package com.czwl.kotlin.types.classes

/**
 * @author  CZ
 * @date  2020/2/1 10:55
 * @version 1.0
 */
abstract class AbsClass {
    abstract  fun absMethod()//无需open
    open fun overridable(){}//如果需要被复写呢，必须要open
    fun nonOverridable(){}

}