fun main() {
    // infer type or declare variable with value
    var currentAge:Int
    currentAge = 90
    println(currentAge)

    // kotlin also supports dynamic typing 
    var currentYear = "2022"
    // error example when trying to change the variable type
    // currentYear = 2023
    // fix error
    // currentYear = 2023.toString()
    println(currentYear)
}
