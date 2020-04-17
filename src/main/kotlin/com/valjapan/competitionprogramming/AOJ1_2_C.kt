package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val arr = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(arr.joinToString(" "))
}
