// const val cannot be changed and must be declared outside the main function
const val MAX_AGE = 68

fun main() {
    // var can be modified
    // val can only be modified once
    var currentAge:Int
    currentAge = 90

    println(currentAge > MAX_AGE)
}
