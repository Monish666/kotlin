package io.shopping.cart.repository



import io.shopping.cart.model.ShoppingCart
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingCartRepository : MongoRepository<ShoppingCart, String>