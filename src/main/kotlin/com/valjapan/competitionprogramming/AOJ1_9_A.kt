package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val W = readLine()!!.toString()
    val T = mutableListOf<String>()
    while (true) {
        val s = readLine()!!.toString()
        if (s == "END_OF_TEXT") break
        T.addAll(s.split(" "))
    }
    println(T.filter { it.toLowerCase() == W.toLowerCase() }.count())
}
