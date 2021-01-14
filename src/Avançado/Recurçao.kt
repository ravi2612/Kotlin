package Avançado


fun fatorial (num:Int ) : Int = when(num) {
    in 0..1-> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw IllegalArgumentException("Numero Negativo")
}

fun main() {
    println("Resultado: ${fatorial(5)}")
}

