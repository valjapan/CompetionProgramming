package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    var time = readLine()!!.toInt()
    val hour = time / 3600
    val minuts = (time - hour * 3600) / 60
    val second = (time - hour * 3600 - minuts * 60)
    println("$hour:$minuts:$second")
}
