package model.`Ejercicio 3`
/*
+	Crea un array de Passwords con el tamaño que tu le indiques por teclado.
	Crea un bucle que cree un objeto para cada posición del array.
	Indica también por teclado la longitud de los Passwords (antes de bucle).
	Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
	Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1
contraseña2 valor_bololeano2
 */

fun main()
{
    print("Ingrese un tamaño de arreglo")
    var taman: Int = readLine()!!.toInt()
    var conjuntoPass =arrayOfNulls<Password>(taman)
    var fuerte =arrayOfNulls<Boolean>(taman)
    print("Ingrese longitud para los passwords")
    var longi: Int = readLine()!!.toInt()
    for (i in 0..taman)
    {
        conjuntoPass[i] = Password(longi)
        fuerte[i] = conjuntoPass[i]?.esFuerte()
    }
    print("\nMostrando los Passwords")
    for (i in 0..taman)
    {
        if(fuerte[i]!!)
        print("${conjuntoPass[i]?.contrasenia} es fuerte")
        else
        print("${conjuntoPass[i]?.contrasenia} no es fuerte")
    }

}