package com.valjapan.competitionprogramming

fun main(args: Array<String>) {
    val list = readLine()!!.split(" ").map(String::toInt)
    println("buy ${list.min()},sell ${list.max()}")
}
