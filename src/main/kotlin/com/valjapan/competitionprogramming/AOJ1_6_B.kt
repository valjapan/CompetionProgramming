package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val cards = listOf("S", "H", "C", "D").flatMap { s -> (1..13).map { i -> "$s $i" } }
    val n = readLine()!!.toInt()
    val taros = (1..n).map { readLine()!!.split(" ").joinToString(" ") }
    cards.subtract(taros).forEach(::println)
}
