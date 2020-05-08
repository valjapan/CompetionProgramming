package com.valjapan.competitionprogramming


fun main(args: Array<String>) {
    val num = readLine()!!.split(" ").map { it.toInt() }
    val dice = DiceB(num[0], num[1], num[2], num[3], num[4], num[5])
    val count = readLine()!!.toInt()
    for (i in (0 until count)) {
        val tempList = readLine()!!.split(" ").map { it.toInt() }
        println(dice.getRight(top = tempList[0], front = tempList[1]))
    }
}

class DiceB(
    private val one: Int,
    private val two: Int,
    private val three: Int,
    private val four: Int,
    private val five: Int,
    private val six: Int
) {

    fun getRight(top: Int, front: Int): Int {
        return when (top) {
            one -> when (front) {
                two -> three
                three -> five
                four -> two
                else -> four
            }
            two -> when (front) {
                one -> four
                three -> one
                four -> six
                else -> three
            }
            three -> when (front) {
                one -> two
                two -> six
                five -> one
                else -> five
            }
            four -> when (front) {
                one -> five
                two -> one
                five -> six
                else -> two
            }
            five -> when (front) {
                one -> three
                three -> six
                four -> one
                else -> four
            }
            else -> when (front) {
                two -> four
                three -> two
                four -> five
                else -> three
            }
        }
    }
}