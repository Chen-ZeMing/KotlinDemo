package types.collections

import com.sun.org.apache.xerces.internal.xs.StringList
import java.util.HashMap


fun main() {
    val intList: List<Int> = listOf(1, 2, 3, 4)//不可变
    val intList2: MutableList<Int> = mutableListOf(1, 2, 3, 4)//可变，可以添加或删除


    val map: Map<String, Any> = mapOf("name" to "WL", "age" to "20")
    val map2: Map<String, Any> = mutableMapOf("name" to "WL", "age" to "20")

    val StringList = ArrayList<String>()
    for (i in 0..10) {
        StringList.add("num:$i")
    }
    println(StringList)
//
//    val map =HashMap<String,Any>();
//    map["Hello"]=10
//    println(map["Hello"]) //[]内部的值实际上是key
    for (i in 0..10) {
        StringList+="num:$i"//注意$要放在   ""  的里面
    }
}