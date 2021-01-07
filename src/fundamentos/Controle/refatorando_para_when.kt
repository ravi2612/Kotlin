package fundamentos.Controle

fun main() {
    val nota =  6

    when(nota){
        10, 9 -> println("Fantástico")
        8, 7 -> println("Parabéns")
        in 4..6 -> println("Tem como recuperar")
        in 0..3 -> println("Nos Vemos proximo semestre")
        else -> println("Nota Inválida")
    }
}