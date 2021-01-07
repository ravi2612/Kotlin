package funçoes

class Operaçoes {
    fun soma(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar (a: Int, b:Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int {
    return funcao(a, b)
}