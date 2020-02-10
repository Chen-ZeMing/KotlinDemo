package com.czwl.kotlin.types.classes.kotlin

import com.czwl.kotlin.types.classes.AbsClass
import com.czwl.kotlin.types.classes.SimpleInf

/**
 * @author  CZ
 * @date  2020/1/31 15:34
 * @version 1.0
 */
open class SimpleClass (var x:Int,val y:String)
    : AbsClass(), SimpleInf {
    override val simpleProperty: Int
        get() {
            return 2
        }

    val z:Long=0L
    override fun absMethod(){}
    override fun simpleMethod(){}
    fun y(){}
    fun zzz(string:String){}
    final override fun overridable(){}//子类不能在复写此方法
}
class SimpleClass2(x: Int,y: String):SimpleClass(x,y){

}