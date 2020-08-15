package com.example.kotlinproject
}
// practice of if--- else expression
fun main(arg: Array<String>) {
    val num = 5
    if (num > 4) {
        println("The variable is greather than 4")
    } else if (num == 4){
        println("The variable is exactly equal to 4")
    } else {
        println("The variable is less than 4")
    }
}

// lab practice of lucky Dice Roll game
//class MainActivity : LuckyDollActivity() {

    fun main() {
        val myFirstDice = Dice(8)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        when (rollResult) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! you rolled a 6. Try again!")
        }
    }
    class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }

    }
//}