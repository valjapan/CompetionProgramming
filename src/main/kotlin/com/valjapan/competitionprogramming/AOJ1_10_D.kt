package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    readLine()!!.toInt()
    val x = readLine()!!.split(" ").map(String::toInt)
    val y = readLine()!!.split(" ").map(String::toInt)
    println(x.zip(y) { a, b -> Math.abs(a - b) }.sum())
    println(Math.sqrt(x.zip(y) { a, b -> Math.pow(Math.abs(a - b).toDouble(), 2.0) }.sum()))
    println(Math.cbrt(x.zip(y) { a, b -> Math.pow(Math.abs(a - b).toDouble(), 3.0) }.sum()))
    println(x.zip(y) { a, b -> Math.abs(a - b) }.max())
}