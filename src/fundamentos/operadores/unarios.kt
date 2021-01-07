package fundamentos.operadores

fun main() {
    var num1: Int = 1
    var num2: Int = 2
    num1++
    println(num1)
    --num1 // prefixado tem precedencia
    println(num1)

    //Incremento e decremento

    println(++num1 == num2--) //true
    println(num1 == num2) //false

}