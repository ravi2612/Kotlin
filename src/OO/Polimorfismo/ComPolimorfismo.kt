package OO.Polimorfismo


open class Comida(val peso:Double)
class Feijao(peso: Double) : Comida(peso)
class Arroz(peso: Double) : Comida(peso)
class Ovo(peso:Double) : Comida(peso)

class Pessoa(var peso: Double) {

    fun comer(comida: Comida) {
        peso += comida.peso

    }
}


fun main() {
    val feijao = Feijao(0.3)
    val arroz = Arroz(0.3)
    val ovo = Ovo(0.2)

    val joao = Pessoa(85.4)
    joao.comer(feijao)
    joao.comer(arroz)
    joao.comer(ovo)

    println(joao.peso)
}
