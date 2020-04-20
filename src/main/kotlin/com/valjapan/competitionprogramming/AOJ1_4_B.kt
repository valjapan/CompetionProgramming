package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val r = readLine()!!.toDouble()
    println("%f %f".format(r * r * Math.PI, r * 2 * Math.PI))
}
