package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val str = generateSequence(::readLine).joinToString("")
    for (char in ('a'..'z')) {
        println("$char : ${str.toLowerCase().count { it == char }}")
    }
}
