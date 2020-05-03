package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var taro = 0
    var hanako = 0
    (0 until n).forEach { _ ->
        val (t, h) = readLine()!!.toString().split(" ")
        when {
            t == h -> {
                taro++
                hanako++
            }
            t > h -> {
                taro += 3
            }
            else -> {
                hanako += 3
            }
        }
    }
    println("$taro $hanako")
}
