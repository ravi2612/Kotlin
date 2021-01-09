package funçoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: ()  -> T) : T {
    println("Entrando no metodo $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Metodo $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int) : Int {
    return a + b
}

fun main() {
    val resultado = executarComLog("somar") {
        somar2(4, 5)
    }
    println(resultado)
}