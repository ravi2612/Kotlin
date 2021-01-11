package collections



fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(3, 'a', true, 3.14, "Texto")

    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove('a').print()

    conjunto.contains('a').print()

    val nums = setOf(1, 2, 3) //somente leitura

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print()  // nao muda o conjunto
    conjunto.retainAll(nums).print() // muda o conjunto
    conjunto.print()
    conjunto.clear()
    conjunto.isEmpty().print()

    
}