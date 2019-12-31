package ir.sample.kotlin_samples.sample16_interface

interface colorInerface {
    var color : String
    fun painting(selectedColor:String)
}

interface bodyInterface {
    var model : String
    fun assemblyUnit(plan:String)
}


open class BusinessDepartment {
    open val carName : String = ""
    fun OrderingCompany(company:String){
        println("Ordering company : $company")
    }
}

//This Class Overriding: 2 Interface & 1 Class with Variable And Function.
class Factory(override val carName : String , override var color : String , override var model : String): BusinessDepartment() , colorInerface , bodyInterface {

    override fun painting(colorSelected : String) {
        println("Painting by color : $colorSelected")
    }

    override fun assemblyUnit(plan : String) {
        println("Model Assembled : $plan")

    }

}

fun main(args : Array<String>) {
    var order=Factory("Benz","LightBlue","C_180")
    order.OrderingCompany(order.carName)
    order.painting(order.color)
    order.assemblyUnit(order.model)
}