package collections

fun main() {
    val aprovados = hashSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosnaordem1 = linkedSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    for (aprovado in aprovadosnaordem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = sortedSetOf("Joao", "Maria", "Pedro", "Ana", "Joana")
    println("\nSorted...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    //ordem maluco
    //aprovados.sortedBy { it. }.print()

}