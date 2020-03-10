package model

class Auto
{
    var Marca: String? = ""
    var Modelo: String? = ""
    var caracteristicas: MutableList<String> = mutableListOf()
    var especiales: MutableList<String> = mutableListOf()
    fun MostrarCaracteristicas(): String
    {
        var resultado = ""
        if(caracteristicas.count() != 0)
        {
            var contador = 0
            do
            {
                resultado+="- ${caracteristicas[contador]}\n"
                contador ++
            }
            while(caracteristicas.count() > contador)
        }
        else
        {
            resultado = "Ninguna"
        }
        return resultado;
    }
    fun MostrarEspeciales(): String
    {
        var resultado = ""
        if(especiales.count() != 0)
        {
            var contador = 0
            do
            {
                resultado+="- ${especiales[contador]}\n"
                contador ++
            }
            while(especiales.count() > contador)
        }
        else
        {
            resultado = "Ninguna"
        }
        return resultado;
    }
    override fun toString(): String
    {
        return "Marca: $Marca \nModelo: $Modelo \nCaracterísticas: \n${MostrarCaracteristicas()}Características especiales:\n${MostrarEspeciales()}"
    }
}
