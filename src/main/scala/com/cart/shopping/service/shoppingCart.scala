package com.cart.shopping.service

import com.cart.shopping.datamodel._

import scala.collection.JavaConversions.mapAsJavaMap

object shoppingCart {

  def calculatePayment(items: List[ShoppingItem]): BigDecimal = {
    items.map(item => item.cost).sum
  }

  def calculatePaymentWithServiceCharge(items: List[ShoppingItem]): BigDecimal = {

    if (items.filter(_.isBeverage).size == items.size) calculatePayment(items) else calculatePayment(items) + withServiceCharge(items,calculatePayment(items));
  }

  def withServiceCharge(items: List[ShoppingItem], payment:BigDecimal): BigDecimal = {
    return if (items.count(_.itemType.equals("hot")) >= 1)  payment * 0.20 else  payment * 0.10
  }
}
