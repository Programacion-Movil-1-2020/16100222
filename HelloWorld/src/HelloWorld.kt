/*import kotlin.random.Random

fun suma(a:Int, b:Int)
{
    println("La suma de ${a} mas ${b} es ${a+b}")
}

fun max(a:Int,b:Int) = if(a>b) a else b

fun main (args: Array<String>)
{
 //   println(max(4,6))
    suma(Random(5).nextInt(),Random(10).nextInt())
}*/
const val N = "NAME"
fun main (args: Array<String>) {
    /*println("Hola mundo")*/
    val i = 10
    /*i = i * 2
    println(i)*/

    println(i.times(2))
    println(i.plus(2))
    println(i.minus(2))
    println(i.div(2))
    println(i.rem(3))


    var n = "n" //Mala práctica de programación, variable global mutable
    val n2 = "n" //Variavble global asignada en tiempo de ejecución

    val name = "nasdas"

    val nombre = "Efeluro"
    val apellido: String = "Vaataisiasata"
    val edad = 20

    println("Su nombre es $nombre $apellido y tiene ${edad + 1} años")

    val oneToHundread = 1..100
    for (i in oneToHundread) print("$i ")
    print("\n")
    for (i in 'A'..'Z') print(i)
    print("\n")
    for (i in 'a'..'ñ') print(i)

    println(esmayor(-2))

    val numero = 20
    if (numero.equals(5)) {
        println("Si")
    } else {
        println("no")
    }

    when (2) {
        in 1..5 -> println("Si esta entre 1 y 5")
        in 1..3 -> println("Si esta entre 1 y 3")
        else -> println("what")
    }
    println(describe(null))
    var uno = 1/*
    while(true)
    {
        uno*= uno*2
        println(uno)
    }*/
    /*val daysOfTheWeek=listOf("Domingo", "Lunes","Martes","Miercoles","Jueves","Viernes","Sábado");*/
    for ((index: Int, day: String) in /*daysOfTheWeek*/listOf(
        "Domingo",
        "Lunes",
        "Martes",
        "Miercoles",
        "Jueves",
        "Viernes",
        "Sábado"
    ).withIndex()) {
        println("${index + 1} ${day}")
    }

    listOf("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado").forEach{println(it)}

    for(i in 1..3)
    {
        println("\ni: $i")
        for (j in 1..5)
        {
            if(j.equals(5)) break
            println("j: $j ")
        }
    }
    terminartodociclo@
    for(i in 1..3)
    {
        println("\ni: $i")
        for (j in 1..5)
        {
            if(j.equals(3)) /*continue*/break@terminartodociclo
            println("j: $j ")
        }
    }
}

fun describe(obj: Any?): String
{
    return when (obj)
    {
        1 ->"One"
        "Hello" ->"Greeting"
        is Long -> "Elongated"
        !is String -> "Not a String"
        else -> "Unknown"
    }
}
fun esmayor(dato: Int /*Any*/): String
{
    if (dato > 0)
    {
        println("$dato")
        return "true"
    }
    else
    {
        println("$dato")
        return "false"
    }
}
