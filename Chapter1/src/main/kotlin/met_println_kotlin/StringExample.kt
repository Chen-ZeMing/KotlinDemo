package met_println_kotlin

val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))
fun main(args: Array<String>) {

    println(string == fromChars)

    println(string=== fromChars)

    println("接下来我们要输出:"+ string)

    val arg1:Int =0
    val arg2:Int =1

    println( ""+arg1 + "+" +arg2 +"=" +(arg1 +arg2))
    println("$arg1+$arg2=${arg1+arg2}")

    //Hello "Trump"
    val sayHello: String="Hello \"Trump\""   //字符里面包括了字符，必须使用转义
    println("sayHello")


    //$1000
    println("$1000")
    //Salary
    val salary: Int =1000

    println("\$salary")

    val rawString:String =""



        }



