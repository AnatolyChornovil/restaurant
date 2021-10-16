fun main() {

    val visitor1 = Client("Anna", 380987654321, 12.11, true, 15 )

    val cook = Cook("Victor", 380978456132, 14.05, "snack")

    val dish = Food("Omlet", 1, 30.00, "Egg, milk, salt, pepper")

    print("${visitor1.name} замовив(ла) ${dish.name} за ${dish.price}грн у ${cook.name}")
}
    abstract class Person(
        var name: String,
        var phoneID: Long,
        var birth: Double,
    )

    class Client(
        name : String,
        phoneID : Long,
        birth : Double,
        var discount : Boolean,
        var discountValue : Byte
    ) : Person(name, phoneID , birth ){

    }


    class Cook(
        name : String,
        phoneID : Long,
        birth : Double,
        var specialisation : String
    ) : Person(name, phoneID , birth ){

    }


    open class Food(
        val name : String,
        val foodID : Short,
        var price: Double,
        var ingredients: String,
    ){

    }

//    class order()
//        val kxzcfjbn this (${name=Food})
//
//    )
//















