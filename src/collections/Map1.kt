package collections

fun main() {
    var map = HashMap<Long, String> ()

    map.put(1009090990, "Joao")
    map.put(3293948239, "Maria")
    map.put(3485788439, "Pedro")

    map.put(3485788439, "Pedro Filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(3293948239)?.print()
    map[3293948239]?.print()
    map.contains(3293948239).print()
    map.remove(3293948239)?.print()
    map.clear()
    map.isEmpty().print()
}