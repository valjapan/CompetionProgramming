package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    var str = readLine()!!.toString()
    val q = readLine()!!.toInt()

    (0 until q).forEach { _ ->
        val command = readLine()!!.toString().split(" ")
        val operation = command[0]
        val a = command[1].toInt()
        val b = command[2].toInt()
        val s = str.slice(0 until a)
        val m = str.slice(a..b)
        val e = str.slice(b + 1 until str.length)
        when (operation) {
            "print" -> println(m)
            "reverse" -> str = s + m.reversed() + e
            "replace" -> str = s + command[3] + e
        }
    }
}
