package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val int = readLine()!!.toInt()
    val pon = "pon"
    val hon = "hon"
    val bon = "bon"

    when (int % 10) {
        0-> println(pon)
        1-> println(pon)
        2-> println(hon)
        3-> println(bon)
        4-> println(hon)
        5-> println(hon)
        6-> println(pon)
        7-> println(hon)
        8-> println(pon)
        9-> println(hon)
    }
}
