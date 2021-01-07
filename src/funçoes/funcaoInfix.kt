package funçoes

class Produto (val nome: String, val preço: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preço > produto.preço

fun main() {
    val p1 = Produto("Ipad", 2349.0)
    val p2 = Produto(preço = 3.49, nome = "Borracha")
    println(p1 maisCaroQue p2)
}