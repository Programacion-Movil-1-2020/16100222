package model.`Ejercicio 2`

class Persona()
{
    var nombre: String = ""
        get() = field
        set(value) { field=  value }
    var edad: Int = 0
        get() = field
        set(value) { field=  value }
    var dNI: String = ""
        get() = field
        set(value) { field=  value }
    var sexo: Char = 'M'
        get() = field
        set(value) { field=  value }
    var peso: Double = 0.0
        get() = field
        set(value) { field=  value }
    var altura: Double = 0.0
        get() = field
        set(value) { field=  value }

    constructor(NOMBRE: String, EDAD: Int, SEXO: Char) : this()
    {
        nombre = NOMBRE
        edad = EDAD
        sexo = SEXO
    }

    constructor(NOMBRE: String, EDAD: Int, SEXO: Char, PESO: Double, ALTURA: Double) : this()
    {
        nombre = NOMBRE
        edad = EDAD
        sexo = SEXO
        peso = PESO
        altura = ALTURA
    }

    fun calcularIMC(): Int
    {
        var res = (peso / (Math.pow(altura, 2.0)))
        if(res < 20)
            return -1 //Peso ideal
        else
        {
            if(res >= 20 && res <= 25)
                return 0 //Debajo del peso ideal
            else
                return 1 //Sobrepeso
        }
    }

    fun esMayordeEdad(): Boolean
    {
        return edad >= 18
    }

    fun comprobarSexo(SEXO: Char)
    {
        if(!(SEXO == 'H' || SEXO == 'M'))
        {
            sexo = 'H'
        }
    }

    override fun toString(): String
    {
        return "Nombre: ${nombre}. Edad: ${edad}. DNI: ${dNI}. Sexo: ${sexo}. Peso: ${peso}. Altura: ${altura}"
    }
/*
        2) Haz una clase llamada Persona que siga las siguientes condiciones:
        +	Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
        -   No queremos que se accedan directamente a ellos.
        -   Piensa que modificador de acceso es el más adecuado, también su tipo.
        -   Si quieres añadir algún atributo puedes hacerlo.
        +	Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera mujer por defecto, usa una constante para ello.
        +	Se implantaran varios constructores:
        -	Un constructor por defecto.
        -	Un constructor con el nombre, edad y sexo, el resto por defecto.
        -	Un constructor con todos los atributos como parámetro.
        +	Los métodos que se implementaran son:
        +	calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
                si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
                si devuelve un número entre 20 y 25 (incluidos),
                significa que esta por debajo de su peso ideal la función devuelve un 0  y
                si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
                Te recomiendo que uses constantes para devolver estos valores.
        +	esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
        	comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
        +	toString(): devuelve toda la información del objeto.
        	generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
        	Métodos set de cada parámetro, excepto de DNI.
        Ahora, crea una clase ejecutable que haga lo siguiente:
        	Pide por teclado el nombre, la edad, sexo, peso y altura.
        	Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
        	Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
        	Indicar para cada objeto si es mayor de edad.
        	Por último, mostrar la información de cada objeto.
        Puedes usar métodos en la clase ejecutable, para que sea más fácil.
*/
}