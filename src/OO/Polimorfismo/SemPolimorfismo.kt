package OO.Polimorfismo

class Feijao2(val peso: Double)
class Arroz2(val peso: Double)

class Pessoa2(var peso: Double) {

    fun comer(feijao : Feijao) {
        peso += feijao.peso
    }

    fun comer(arroz: Arroz) {
        peso += arroz.peso
    }
}

fun main() {
    val feijao = Feijao(0.3)
    val arroz = Arroz(0.3)

    val joao = Pessoa2(0.85)
    joao.comer(feijao)
    joao.comer(arroz)

    println(joao.peso)
}
