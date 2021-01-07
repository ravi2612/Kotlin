package funçoes

fun min(a: Int, b: Int) : Int {
    return if (a < b) a else b

}

fun main() {
    print("O maio valor é ${min(3, 4)}")
}