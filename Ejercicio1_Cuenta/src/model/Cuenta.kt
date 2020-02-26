package model

class Cuenta(TITULAR: String)
{
    /*1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).*/
    var Titular: String = TITULAR
        /*Utiliza sus métodos get, set y toString… Recuerda que estos por default se heredan de la clase Any.*/
        get() = field
        set(value) { field=  value }
    var Cantidad: Double = 0.0
        get() = field
        set(value) { field=  value }
    /*El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.*/
    constructor(TITULAR: String, CANTIDAD: Double) : this(TITULAR)
    {
        Cantidad = CANTIDAD
    }
    /*Utiliza sus métodos get, set y toString… Recuerda que estos por default se heredan de la clase Any.*/
    override fun toString(): String
    {
        var strCantidad = ""
        if(Cantidad != 0.0)
            strCantidad = ", Cantidad: ${Cantidad}"
        return "Titular: ${Titular}${strCantidad}}"
    }
    /*  	ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará
            nada.*/
    fun Ingresar(CANTIDAD: Double)
    {
        if(CANTIDAD>=0.0)
            Cantidad+= CANTIDAD
    }

    /*
    	retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es
            negativa, la cantidad de la cuenta pasa a ser 0.
     */
    fun Retirar(CANTIDAD: Double)
    {
        Cantidad-= CANTIDAD
        if(CANTIDAD<0.0)
            Cantidad = 0.0
    }
}
