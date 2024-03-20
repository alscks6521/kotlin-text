data class User(
    //val은 값을 못바꿈, var은 값을 변경가능
    var name: String?,
    val age: Int
)

data class Product(
    var name: String,
    val price: Int
)

data class Order(
    val product: List<Product>,
    val isDelivered: Boolean

)