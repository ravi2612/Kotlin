package funçoes

fun <E> List<E>.secondOrNull(): E ? {
    return if (this.size >= 2) this.get(1) else null
}


fun main() {
    val list = listOf("Joao", "Maria", "Pedro")
    print(list.secondOrNull())
}