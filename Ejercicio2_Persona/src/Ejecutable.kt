package model

fun main()
{
    print("Ingrese nombre: ")
    var nmbr: String = readLine()!!
    print("Ingrese edad: ")
    var dd: Int = readLine()!!.toInt()
    print("Ingrese sexo (H/M): ")
    var sx: Char = readLine()!!.toCharArray()[0]
    print("Ingrese peso: ")
    var ps: Double = readLine()!!.toDouble()
    print("Ingrese altura: ")
    var ltr: Int = readLine()!!.toInt()

    var teclado = Persona(nmbr,dd,sx,ps,ltr)
    var despesado = Persona(nmbr,dd,sx)
    var default = Persona()
    default.nombre = "Pablo Enrique Lavín Lozano"
    default.edad = 21
    default.sexo = 'H'
    default.peso = 67.0
    default.altura = 185
    println()
    mostrarInfo(teclado)
    mostrarInfo(despesado)
    mostrarInfo(default)

    /*Ahora, crea una clase ejecutable que haga lo siguiente:
    -	Pide por teclado el nombre, la edad, sexo, peso y altura.
    -	Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
    -	Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
    -	Indicar para cada objeto si es mayor de edad.
    -	Por último, mostrar la información de cada objeto.
    Puedes usar métodos en la clase ejecutable, para que sea más fácil.*/
}

fun mostrarInfo(persona: Persona)
{
    println(persona)
    decirPesoIdeal(persona)
    decirMayorEdad(persona)
    println()
}
fun decirPesoIdeal(persona: Persona)
{
    when(persona.calcularIMC())
    {
        0 -> println("${persona.nombre} está debajo del peso ideal")
        1 -> println("${persona.nombre} tiene sobrepeso")
        -1 -> println("${persona.nombre} tiene el peso ideal")
    }
}

fun decirMayorEdad(persona: Persona)
{
    if(persona.esMayordeEdad())
        println("${persona.nombre} es mayor de edad")
    else
        println("${persona.nombre} es menor de edad")
}