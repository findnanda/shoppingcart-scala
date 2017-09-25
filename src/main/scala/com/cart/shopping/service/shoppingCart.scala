package com.cart.shopping.service

import com.cart.shopping.datamodel.ShoppingItem

object shoppingCart {

  def calculatePayment(items: List[ShoppingItem]): BigDecimal = {
    items.map(item => item.cost).sum
  }
}
