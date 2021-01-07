package fundamentos.Controle

fun main() {
    val opcao: Int = 0

    do{
        val line = readLine() ?: 0
        println("Você escolheu a opçao $opcao")
    }while (opcao != -1)

    println("Até a próxima !")
}