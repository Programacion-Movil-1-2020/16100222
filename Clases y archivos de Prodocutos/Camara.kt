package model

class Camara
{
    private var isOn = false
    fun turnOn()
    {
        isOn = true
    }
    fun turnOff()
    {
        isOn = false
    }
    fun Status():String
    {
        return if (isOn) "Encendida" else "Apagada"
    }
}