package zsw.demo

import java.util.*


fun main(args: Array<String>) {
    println(sum(2, 3))

    println("-------------------------")
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println("-------------------------")
    for (item in items) {
        println(item)
    }
    println("-------------------------")
}

fun sum(a: Int, b: Int): Int {
    println("result :  $a + $b  = ${a+b}")


    return a + b
}
