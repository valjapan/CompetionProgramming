package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    println(" " + (3..num).filter { it % 3 == 0 || it.toString().contains("3") }.toList().joinToString(" "))
}
