package com.czwl.kotlin.types.nullables

import com.czwl.kotlin.types.classes.java.Person1
import java.io.File

/**
 * @author  CZ
 * @date  2020/2/3 14:19
 * @version 1.0
 */
fun main(){



    var nullable:String?="Hello"
//    val length=nullable.length// 编译器认为nullable可能为空，虽然的确不是空值，不能通过编译
    val length=nullable!!.length //这种修改方式，不推荐使用，前提是你知道一定不为空，通过编译

//    val length=nullable?.length
//    val length:Int=nullable?.length?:0//elvis:boolean a,b

    var x:String="Hello"
    var y:String?="world"
    y=x//可以
    x=y//不行
    var a:Int=2
    var b:Number=10.0

    b=a//ok
    a=b//Type mismatch

    val person=Person1()//使用java的person
    val title=person.title//平台类型String!,java里的String，如果不想要String!,可以在java
    //代码中添加注解 @NotNull
    val titleLength=title.length//会爆出来空指针异常
    val file= File("abc")
    val files = file.listFiles()
    println(files.size)//编译器不会报错，但是你必须知道这里有可能为空
}

