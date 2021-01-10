package Classes

val diretamenteNoArquivo = "Bom Dia"


fun toplevel (){
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}


class Coisa {
    var variavelDeInstancia: String = "Boa Noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}


fun main() {
    toplevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}