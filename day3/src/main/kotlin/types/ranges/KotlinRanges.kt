package types.ranges

fun main() {
    val intRange =1..10//[1,10] 离散的整数值
    val charRange ='a'..'z'
    val longRange =1L..100L
    val floatRange =1f..2f//[1,2]//连续
    val doubleRange =1.0..2.0

    println(intRange.joinToString())
    println(floatRange.toString()                                                                                                                                                                                   )

    val intRangeWithStep=1..10 step 2//数值之间的步长
    val charRangeWithStep='a'..'z' step 2
    val longRangeWithStep = 1L..100L step 5

    println(intRangeWithStep.joinToString())
    val intRangeExclusive=1 until 10//[1,10)
    val charRangeExclusive='a' until 'z' //只包括a 不包括z
    val longRangeExclusive=1L until 100L
    println(intRangeExclusive.joinToString())
    val intRangeReverse=10 downTo 1 // [10,9,..,1]
    val charRangeReverse='z' downTo 'a'  //包括a和z
    val longRangeReverse=100L downTo 1L
    println(charRangeExclusive.joinToString())
    println(charRangeReverse.joinToString())

    if (3 in intRange) {
        println("3 in range 'intRange")
    }
    if (12 !in intRange) {
        println("12 not in range 'intRange'")
    }
    for (element in intRange){
        println(element)
    }
    intRange.forEach {
        println(it)
    }
    if(3.0 in doubleRange){
        println("3.0 in range 'doubleRange'")
    }
    if (12 !in intRange) {
        println("12 not in range 'intRange'")
    }
    val array= intArrayOf(1,3,5,7)
    for (i in 0 until array.size) {
        println(array[i])
    }
    for (i in array.indices) {
        println(i)
    }
}