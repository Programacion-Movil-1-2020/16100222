package model

class Shoe
{
    var size: Int = 34
    set (value)
    {
        field = if(value.compareTo(34)>=0) value else 34
    }
    get() = field

    var color: String = "White"

    var model: String = "Boots"
    set (value)
    {
        field = if(value.equals("Tennis")) "Boots" else value
    }
    get() = field

}