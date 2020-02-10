package types.basics

fun main(args: Array<String>) {
    var a =2

    val b  = "Hello Kotlin"//默认是String

//    val c= 12345678910l //compile error
    val c =12345678910L //ok

    val d =3.0//Double ,3.0f Float
    val e :Int =10
//    val f: Long = e //implicitness not allowed

    val f :Long=e.toLong()

//    val float1 = 1.0//默认是double
    val double1 =1.0
    println("Range of Int:[${Int.MIN_VALUE},${Int.MAX_VALUE}]")

    val j = "I爱China"

    println("Value of String 'j' is :$j")//no need brackets
    println("Length of String 'j' is :${j.length}")//need brackets

    val k = "Today is a sunny day"
    val m = String("Today is a sunny day".toCharArray())
    println(k===m) //compare references 比较引用
    println(k == m)//compare values     比较内容

    val n = """
    <!doctype html>
        <html>
        <head>
         <meta charset="UTF-8/>
         <title>Hello World</title>
        </head>
        <body>
         <div id="container">
          <H1>Hello World</H1>
          <p>This is a demo page.</>
         </div>
        </body>
         </html>
         """.trimIndent()

    println(n)



}


