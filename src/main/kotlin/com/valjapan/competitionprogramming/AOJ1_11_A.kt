package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val number = readLine()!!.split(" ").map { it.toInt() }
    val dice = DiceA(number[0], number[1], number[2], number[3], number[4], number[5])
    val order = readLine()!!
    order.forEach {
        when (it) {
            'N' -> dice.toN()
            'E' -> dice.toE()
            'S' -> dice.toS()
            'W' -> dice.toW()
        }
    }
    println(dice.getTop())
}

class DiceA(var one: Int, var two: Int, var three: Int, var four: Int, var five: Int, var six: Int) {
    fun toN() {
        val temp = one
        one = two
        two = six
        six = five
        five = temp
    }

    fun toS() {
        val temp = one
        one = five
        five = six
        six = two
        two = temp
    }

    fun toE() {
        val temp = one
        one = four
        four = six
        six = three
        three = temp
    }

    fun toW() {
        val temp = one
        one = three
        three = six
        six = four
        four = temp
    }

    fun getTop(): Int {
        return one
    }
}