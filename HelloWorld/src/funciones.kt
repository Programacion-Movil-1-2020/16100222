fun main()
{
    println("La raíz cuadrada de 4 es ${Math.sqrt(4.0)}")
    println("El promedio de los números es :${averageNumbers(intArrayOf(6,6,23,9,2))})")
    var hola = {println("Hola mundo")}()
    hola

    val w = {d: Int, c: Int -> d+c}
    println(w(2,3))
    println({d: Int, c: Int -> d+c}(4,4))
}

fun averageNumbers(numbers: IntArray, number: Int = 3): Int
{
    var total = 0
    for (num in numbers)
    {
        total += num
    }
    return total / numbers.size + number
}