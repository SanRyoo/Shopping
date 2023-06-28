package com.sanryoo.shopping.feature.presentation.using.product

import android.net.Uri
import com.sanryoo.shopping.feature.domain.model.Order
import com.sanryoo.shopping.feature.domain.model.Product
import com.sanryoo.shopping.feature.domain.model.User

data class ProductState(
    var product: Product = Product(),
    var productOfShop: List<Product> = emptyList(),
    var similarProducts: List<Product> = emptyList(),

    var user: User = User(),
    var comment: String = "",
    var listImagesComment: List<Uri> = emptyList(),

    var addToCart: Order = Order(),

    var sheetContent: SheetContent = SheetContent.DEFAULT,

    var numberOfCart: Int = 0,
    var numberOfChats: Int = 0
)

enum class SheetContent {
    DEFAULT, CHOOSE_IMAGES, ADD_TO_CART, BUY_NOW
}
