package Classes

class ItemDepedido(val nome: String, var preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDepedido(nome, preco)
        @JvmStatic var desconto : Double = 0.0
    }
    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDepedido.create("Tv 50 Polegadas", 2989.90)
    val item2 = ItemDepedido("Liquidificador", 200.00)
    println("${item1.nome} :\n\tPreço: R$${item1.preco}\n\tPromoção: R$${item1.precoComDesconto()}")
    println("${item2.nome} :\n\tPreço: R$${item2.preco}\n\tpromoção: R$${item2.precoComDesconto()}")

}