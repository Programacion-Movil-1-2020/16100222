import model.Camara
import model.Shoe
fun main()
{
    var unaCamara = Camara()
    unaCamara.turnOn()
    println("Cámara "+unaCamara.Status())

    val shoe = Shoe()
    shoe.color = "Red"
    shoe.model = "Tennis"
    shoe.size = 25

    println(shoe.color)
    println(shoe.model)
    println(shoe.size)
}