package model.`Ejercicio 3`

import kotlin.random.Random

class Password()
{
    var longitud: Int = 8
        get() = field
        set(value) { field=  value }
    var contrasenia: String = ""
        get() = field
    constructor(LONGITUD: Int) : this()
    {
        longitud = LONGITUD
        generarPassword()
    }

    fun esFuerte(): Boolean
    {
        var num= 0
        var may= 0
        var min= 0

        for (i in contrasenia)
        {
            if(i.isDigit())
            {
               num++;
            }
            if(i.isUpperCase())
            {
                may++;
            }
            if(i.isLowerCase())
            {
                min++;
            }
        }
        return num>5 && may>2 && min>1
    }

    fun generarPassword()
    {
        contrasenia = ""
        val LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" // 0 ... 25
        val letras = "abcdefghijklmnopqrstuvwxyz"
        val num = "0123456789"
        var ind = 0
        for (i in 0..longitud-1)
        {
            when (ind)
            {
                0 -> contrasenia+= LETRAS[Random.nextInt(0, 25)]
                1 -> contrasenia+= letras[Random.nextInt(0, 25)]
                2-> {contrasenia+= num[Random.nextInt(0, 10)]; ind=0}
            }
            ind+= 1;
        }
    }

    /*
    3) Haz una clase llamada Password que siga las siguientes condiciones:
+	Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
+	Los constructores serán los siguiente:
-	Un constructor por defecto.
-	Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria con esa longitud.
+	Los métodos que implementa serán:
+	esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
+	generarPassword():  genera la contraseña del objeto con la longitud que tenga.
+	Método get para contraseña y longitud.
+	Método set para longitud.

     */
}