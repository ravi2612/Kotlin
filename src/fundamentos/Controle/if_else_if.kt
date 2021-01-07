package fundamentos.Controle

fun main() {
    val nota: Double = 8.0

    //Usando Operador Range
    if (nota in 9.0..10.0) {
        println("Fantastico")
    }else if (nota in 7.0..8.9){
        println("Parabéns")
    }else if (nota in 4.0..6.9){
        println("Tem como recuperar")
    }else if (nota in 0.0..3.9){
        println("Te vejo proximo semestre")
    }else{
        println("Nota invalida")
    }

    //println(5 in 7..4) DO MENOR PRO MAIOR
    println(5 in 4..7)
}