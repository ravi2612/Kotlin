package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*


fun main() {
    kotlin.io.println(funcaoSimples("ok"))


    val redonda = Coisa("Bola")
    println(redonda.nome)

    println(CARA)
    println("${soma(2, 3)} ${subtracao(5, 2)}")
}