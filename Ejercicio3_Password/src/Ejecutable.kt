import model.Password
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
    print("Ingrese un tamaño de arreglo: ")
    var taman: Int = readLine()!!.toInt()
    var conjuntoPass =arrayOfNulls<Password>(taman)
    var fuerte =arrayOfNulls<Boolean>(taman)
    print("Ingrese longitud para los passwords (a partir de 12 aparecen fuertes): ")
    var longi: Int = readLine()!!.toInt()
    for (i in 0..taman-1)
    {
        conjuntoPass[i] = Password(longi)
        fuerte[i] = conjuntoPass[i]?.esFuerte()
    }
    print("\nMostrando los Passwords")
    for (i in 0..taman-1)
    {
        if(fuerte[i]!!)
            print("\n${conjuntoPass[i]?.contrasenia} es fuerte")
        else
            print("\n${conjuntoPass[i]?.contrasenia} no es fuerte")
    }

}