import model.Auto
var logic = true
var listaAutos: MutableList<Auto> = mutableListOf()

fun main()
{
    while(logic)
    {
        println("Ensamblaje de Autos 16100222")
        MostrarMenu()
        val respuesta: String? = readLine()
        BorrarConsola(false)
        val opcion = respuesta!!.toInt()
        when(opcion)
        {
            1 -> EnsamblarAuto()
            2 -> VerAutos()
            3 -> logic = false
            else ->
            {
                println("**Ingrese una de las opciones indicadas a continuación: \n")
                logic = true
            }
        }
    }
}

fun MostrarMenu()
{
    println("1. Ensamblar Auto Nuevo")
    println("2. Ver Autos Ensamblados")
    println("3. Salir")
    print("\nIngrese una opción: ")
}

fun BorrarConsola(message :Boolean)
{
    if(message)
    {
        println("\n\nPresione una tecla para continuar...")
        readLine()
    }
    for (i in 0..10)
    {
        println("\n")
    }
}

fun EnsamblarAuto()
{
    println("Ensamblando un nuevo auto")
    var Carro = Auto()
    print("Indique la marca del auto : ")
    Carro.Marca = readLine()
    print("Indique el modelo del auto : ")
    Carro.Modelo = readLine()
    var caracteristicas = true
    var caracteristicaActual: String? = ""
    do
    {
        print("Característica\n1. Transmisión manual\n2. Transmisión automática\n3. Aire acondicionado\n4.Frenos ABS\n5.Bolsas de aire\n6.Pantalla Táctil\n7.Controles eléctricos\n\nIndique el alguna característica, o 0 para terminar: ")
        caracteristicaActual = readLine()
        if(caracteristicaActual == "0")
            caracteristicas = false
        else
            Carro.caracteristicas.add(DeterminarCaracteristica(caracteristicaActual))
        print("")

    }
    while(caracteristicas)

    var especiales = true
    var especialActual: String? = ""
    do
    {
        print("Característica especial\n1. Faros de niebla\n2. Faros LED\n3. Asientos de piel\n4.Rines de 17 pulgadas\n5.Cargador inalámbrico\n6.Cámara de reversa\n7. Monitoreo de punto ciego\n\nIndique el alguna característica especial, o 0 para terminar: ")
        especialActual = readLine()
        if(especialActual == "0")
            especiales = false
        else
            Carro.especiales.add(DeterminarEspecial(especialActual))
        print("")
    }
    while(especiales)
    listaAutos.add(Carro)
    BorrarConsola(true)
}

fun DeterminarCaracteristica(opcion: String?) :String
{
    var resultado = ""
    when(opcion)
    {
        "1" -> resultado = "Transmisión Manual"
        "2" -> resultado = "Transmisión Automática"
        "3" ->resultado = "Aire acondicionado"
        "4" ->resultado = "Frenos ABS"
        "5" ->resultado = "Bolsas de aire"
        "6" ->resultado = "Pantalla táctil"
        "7" ->resultado = "Controles eléctricos"
    }
    return resultado
}

fun DeterminarEspecial(opcion: String?) :String
{
    var resultado = ""
    when(opcion)
    {
        "1" -> resultado = "Faros de niebla"
        "2" -> resultado = "Faros LED"
        "3" ->resultado = "Asientos de piel"
        "4" ->resultado = "Rines de 17 pulgadas"
        "5" ->resultado = "Cargador inalámbrico"
        "6" ->resultado = "Cámara de reversa"
        "7" ->resultado = "Monitoreo punto ciego"
    }
    return resultado
}

fun VerAutos()
{
    if(listaAutos.count() != 0)
    {
        var contador = 0
        println("Mostrando autos ensamblados")
        do
        {
            print("\nAuto #${contador+1}\n${listaAutos[contador]}")
            contador ++
        }
        while(listaAutos.count() > contador)
        print("\nTotal de autos: ${listaAutos.count()}")
    }
    else
    {
        println("No se ha ensamblado ningún auto.")
    }
    BorrarConsola(true)
}

