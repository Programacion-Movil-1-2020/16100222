fun main()
{
    val numbers: IntArray = intArrayOf(6,6,23,9,2,3,2)
    var sum = 0
    for (num: Int in numbers)
    {
        sum += num
    }

    val average = sum / numbers.size
    println("Promedio:  $average")

    var arrayObject = arrayOf(1,2,3,4)
    var intPrimitive = arrayObject.toIntArray()
    val suma = arrayObject.sum()
    println("La suma del array es: $suma")

    arrayObject = arrayObject.plus(5)
    for(a in arrayObject)
    {
        println("Array: $a")
    }

    println("\nAhora mostraremos el arreglo invertido:")

    for(a in arrayObject.reversedArray())
    {
        println("Array: $a")
    }

    var x = 5
    println("\n¿Será que X es igual a 5? ${x==5}")
    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "era")}, ahora x es igual a $x")

}
