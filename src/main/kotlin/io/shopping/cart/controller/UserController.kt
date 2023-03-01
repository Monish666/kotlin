package io.shopping.cart.controller



import io.shopping.cart.model.ShoppingCart
import io.shopping.cart.repository.ShoppingCartRepository
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/")
class UserController(private val shoppingCartRepository: ShoppingCartRepository) {



    @PostMapping("/users")
    fun createNewEmployee(@RequestBody user: ShoppingCart): ShoppingCart =
        shoppingCartRepository.save(user)
}