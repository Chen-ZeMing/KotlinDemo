package Chapter3

/**
 *created by CZWL
 * 2019/12/31 17:33
 */

val FINAL_HELLO_WORLD: String = "HelloWorld"//无法被修改
var helloWorld: String = "HelloWorld"    //可以被修改

val FIANL_HELLO_CHINA = "HelloChina"  //无法被修改 且自动识别为String




fun main(args: Array<String>) {

    helloWorld="HelloChina"
    println(FIANL_HELLO_CHINA)
}