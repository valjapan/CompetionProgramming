package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    val s = readLine()!!
    if (s.length <= k) {
        println(s)
    } else {
        var a = s.substring(0, k)
        println("$a...")
    }
}
