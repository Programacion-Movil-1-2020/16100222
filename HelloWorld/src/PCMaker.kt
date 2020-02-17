/*
Desarrollar una aplicación de consola en Kotlin que permita “armar” equipos de computo a
partir de una lista de componentes previamente definidos (mínimo 3).
Ejemplo:
1.- Procesador
2.- Memoria Ram
3.- Disco duro (almacenamiento)
4.- Tarjeta Grafica

La aplicación debe solicitar agregar los componentes definidos en la lista para poder terminar
de “armar” el equipo y guardarlo en una lista.
Al seleccionar un componente la aplicación debe mostrar una lista de opciones
correspondientes al componente

Así con cada uno de los componentes…
Además, crear un menú con las siguientes opciones:
    1.- Armar un nuevo equipo
    2.- Ver equipos armados
    3.- Salir
La aplicación deberá ser capaz de leer la respuesta del usuario e imprimirla, la única forma de
salir de él y terminarlo es con la opción 3.
Utilizar lo siguiente para lograrlo:
    • Raw Strings
    • Lectura desde teclado en Kotlin val response:String? = readLine()
    • Control de flujo. If else, when, do while
    • Break Labels
 */

var logic = true
var listaComputadoras: MutableList<Computer> = mutableListOf()

fun main()
{
    while(logic)
    {
        println("Dinamic Creates Computers")
        MostrarMenu()
        var respuesta: String? = readLine()
        BorrarConsola(false)
        var opcion = respuesta!!.toInt()
        when(opcion)
        {
            1 -> NuevoEquipo()
            2 -> EquiposArmados()
            3 -> logic = false
        }
    }
}

fun NuevoEquipo()
{
    println("Creando un nuevo equipo")
    var Computadora = Computer()
    print("PROCESADOR\n1. AMD Ryzen 7 2700X Processor with Wraith Prism LED Cooler YD270XBGAFBOX\n2. Intel Core i7 9700 LGA1151 300 Series\n3. Intel Core i5 9400\n\nIndique el procesador: ")
    Computadora.Procesador = DeterminarProcesador(readLine())
    print("\nDISCO DURO\n1. Seagate ST2000LX001 2 TB\n2. Kingston Digital SA400S37/240G Solid State Drive (SSD) 240GB\n3. Disco duro 320gb western digital 35 sata wd3200aaks\n\nIndique el disco duro: ")
    Computadora.DiscoDuro = DeterminarDisco(readLine())
    print("\nTARJETA GRAFICA \n1. Asus Tarjeta De Video NVIDIA GeForce GTX 1060\n2. Gigabyte GeForce RTX 2060 Gaming OC Pro 6G\n3. PowerColor Red Dragon AXRX 580 8GBD5-3DHDV2/OC Radeon RX 580 8GB GDDR5 \n\nIndique la tarjeta gráfica: ")
    Computadora.Grafica = DeterminarGrafica(readLine())
    print("\nMEMORIA RAM\n1. Crucial 32GB Kit (16GBx2) DDR4 2666 MT/s (PC4-21300)\n2. HyperX Fury 8GB 2666MHz DDR4\n3. Kingston Technology HyperX Impact 8GB 1600MHz DDR3L\n\nIndique la memoria RAM: ")
    Computadora.RAM = DeterminarRAM(readLine())
    listaComputadoras.add(Computadora)
    BorrarConsola(true)
}

fun EquiposArmados()
{
    if(listaComputadoras.count() != 0)
    {
        var contador = 0
        println("Mostrando equipos armados")
        do
        {
            print("\nComputadora #${contador+1}\n${listaComputadoras[contador]}")
            contador ++
        }
        while(listaComputadoras.count() > contador)
    }
    else
    {
        println("No se ha armado ningún equipo.")
    }
    BorrarConsola(true)
}

fun MostrarMenu()
{
    println("1. Armar un equipo nuevo")
    println("2. Ver equipos armados")
    println("3. Salir")
    print("\nIngrese una opción: ")
}

class Computer()
{
    var Procesador: String? = ""
    var RAM: String? = ""
    var DiscoDuro: String? = ""
    var Grafica:  String? = ""
    override fun toString(): String
    {
        return "Procesador: $Procesador \nRAM: $RAM \nDisco Duro: $DiscoDuro \nTarjeta gráfica: $Grafica\n"
    }
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

fun DeterminarProcesador(opcion: String?) :String
{
    var resultado = ""
    when(opcion)
    {
        "1" -> resultado = "AMD Ryzen 7 2700X Processor with Wraith Prism LED Cooler YD270XBGAFBOX";
        "2" -> resultado =  "Intel Core i7 9700 LGA1151 300 Series";
        "3" -> resultado = "Intel Core i5 9400";
    }
    return resultado
}

fun DeterminarRAM(opcion: String?) :String
{
    var resultado = ""
    when(opcion)
    {
        "1" -> resultado = "Crucial 32GB Kit (16GBx2) DDR4 2666 MT/s (PC4-21300)";
        "2" -> resultado =  "HyperX Fury 8GB 2666MHz DDR4";
        "3" -> resultado = "Kingston Technology HyperX Impact 8GB 1600MHz DDR3L";
    }
    return resultado
}

fun DeterminarGrafica(opcion: String?) :String
{
    var resultado = ""
    when(opcion)
    {
        "1" -> resultado = "Asus Tarjeta De Video NVIDIA GeForce GTX 1060";
        "2" ->  resultado = "Gigabyte GeForce RTX 2060 Gaming OC Pro 6G";
        "3" -> resultado = "PowerColor Red Dragon AXRX 580 8GBD5-3DHDV2/OC Radeon RX 580 8GB GDDR5 ";
    }
    return resultado
}

fun DeterminarDisco(opcion: String?) :String
{
    var resultado = ""
    when(opcion)
    {
        "1" -> resultado = "Seagate ST2000LX001 2 TB"
        "2" -> resultado = "Kingston Digital SA400S37/240G Solid State Drive (SSD) 240GB"
        "3" ->resultado = "Disco duro 320gb western digital 35 sata wd3200aaks"
    }
    return resultado
}