package at.voyagers.common.cart.business.request

data class AddCartVariantRequest(
    val accountId: String,
    val cartId: String,
    val variantId: String,
    val quantity: Int,
)
