package com.cart.shopping.datamodel

trait ShoppingItem {
  val name = ""
  val price: BigDecimal = 0
  val itemType = ""
  val serviceCharge : BigDecimal = 0
  def cost : BigDecimal = price * (1.00+serviceCharge)
}

case class Cola(override val name:String = "Cola", override val price: BigDecimal= 50, override val itemType:String = "cold") extends ShoppingItem
case class Coffee(override val name:String = "Coffee", override val price: BigDecimal= 100, override val itemType:String = "hot") extends ShoppingItem
case class CheeseSandwich(override val name:String = "Cheese Sandwich", override val price: BigDecimal= 200, override val itemType:String = "cold") extends ShoppingItem
case class SteakSandwich(override val name:String = "Steak Sandwich", override val price: BigDecimal= 450, override val itemType:String = "hot") extends ShoppingItem

