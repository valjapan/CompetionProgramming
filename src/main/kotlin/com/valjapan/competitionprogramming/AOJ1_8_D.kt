package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val s = readLine()!!
    val p = readLine()!!
    println(if ((s + s).contains(p)) "Yes" else "No")
}