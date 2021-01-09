package funçoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transaçao...")
    try {
    funcao()
    } finally {
        println("Fechando Transaçao")
    }
}

fun main() {
    transacao  {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}