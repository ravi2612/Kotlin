package fundamentos

fun main() {
    //Tipos Numericos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 934928357985728957// Long.MAX_VALUE
    //Tipos Numericos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14
    //Tipo Caractere
    val char: Char = '?' // Outros exemplos ... '1', 'g', ''

    //Tipo booleano
    val boolean: Boolean = true //ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int)
    println(234234324234 is Long)

    //tudo é objeto
    println(10.dec())
}