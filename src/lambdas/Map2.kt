package lambdas

class Produto (val nome:String, val preco:Double)
val materialEscolar = listOf(
    Produto("Fichario escolar", 21.90),
    Produto("Lapis de cor", 11.90),
    Produto("Borracha bicolor", 0.70),
    Produto("Apontador com deposito", 1.80)
)

fun main() {
    val totalizar = {total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)
    println("O preço medio é R$ ${precoTotal/ materialEscolar.size} .")
}