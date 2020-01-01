/**
 *created by CZWL
 * 2019/12/31 10:34
 */
class 妹子 (性格: String,  长相: String, 声音: String) :人(性格,长相 ,声音)

class 帅哥( 性格: String,  长相: String,  声音: String) :人(性格,长相,声音)

open class 人( var 性格: String, var 长相: String, var 声音: String) {
    init {
        println("new了一个人,ta的性格:$性格,他的长相:$长相,他的声音:$声音")

    }
}


fun main(args: Array<String>) {
    val 我喜欢的妹子: 妹子 = 妹子("温柔", "甜美", "动人")
    val 我喜欢的帅哥: 帅哥 = 帅哥("彪悍", "帅气", "浑厚")

    println(我喜欢的妹子 is 人)
}



