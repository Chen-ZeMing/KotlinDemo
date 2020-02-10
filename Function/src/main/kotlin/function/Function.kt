package function

fun main(args: Array<String>, f: () -> Unit): Unit   //类型推导，可以省略掉，unit // 相当于void
{
    println(args.contentToString())

    /**
     *
     *三种等价的写法
     *
     *
     */
    val x: Foo.(String, Long) -> Any = Foo::bar
    val x0: (Foo, String, Long) -> Any = Foo::bar
    val x1: Function3<Foo, String, Long, Any> = Foo::bar   //切记=号的前面一定要加上空格，不然就会报错。

    val y: (Foo, String, Long) -> Any = x
    val z: Function3<Foo, String, Long, Any> = x
    yy(x)
    val f: () -> Unit = ::foo
    val g:(Int) ->String =::foo
    val h:(Foo,String,Long)->Any=Foo::bar
    multiReturnValues(1,2,3,4)

//defaultParameter("Hello")这种写法编译器不知道你到底是哪一个参数是"Hello"
defaultParameter(y="Hello")//形参y来显示接受参数
    val (a,b,c)= multiReturnValues()
}

fun yy(p: (Foo, String, Long) -> Any) {   //返回值没有写，默认是unit
//                p(Foo(),"Hello",3L)
    p.invoke(Foo(),"Hello",3L)  //本质是一样

}

class Foo {
    fun bar(p0: String, p1: Long): Any {
        TODO()
    } //返回值Any
}

fun foo() {} //参数列表为空，返回值为Unit
fun foo(p0: Int): String {
    TODO()
}

fun defaultParameter(x: Int = 5, y: String, z: Long = 0L) {  //默认了两个参数
    TODO()
}

fun multiReturnValues(): Triple<Int, Long, Double> {
    return Triple(1, 3L, 4.0)
}
fun multiReturnValues(vararg ints: Int){


    ints.size //shift+ctrl+p 查看类型}
    println(ints.contentToString())
}


val f: () -> Unit = ::foo
val g: (Int) -> String = ::foo
val h: (Foo, String, Long) -> Any = Foo::bar
//其中参数列表可以省略，可以自动推导出来
val foo = Foo()
val m: (String, Long) -> Any = foo::bar//此时不需要传进来'Foo',因为foo是已经实例化的对象实体

