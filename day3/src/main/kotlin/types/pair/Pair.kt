package types.pair


fun main(pair2: Any) {

    val pair = "Hello" to "Kotlin"//第一种创建方式
    val pair2 = Pair("Hello", "Kotlin")//第二种创建方式
    val first=pair.first
    val second=pair.second
    val (x,y)=pair //结构



    val triple =Triple("x",2,3.0)
    val first1=triple.first
    val second1=triple.second
    val third3=triple.third
    val (x1,y1,z1)=triple //结构
}