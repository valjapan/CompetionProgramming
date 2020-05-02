package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val str =
        readLine()!!.map { line ->
            when {
                line.isUpperCase() -> line.toLowerCase()
                else -> line.toUpperCase()
            }
        }.joinToString("")
    println(str)
}
