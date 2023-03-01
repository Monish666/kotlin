package io.shopping.cart.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection ="users")
data class ShoppingCart(
    @Id
    var id: String? = ObjectId().toHexString(),
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
)
