package com.cart.shopping.service

import com.cart.shopping.datamodel.{CheeseSandwich, Coffee, Cola, ShoppingItem}

object simpleCheckoutApplication {
  def main(args : Array[String]) {
    val noItems : List[ShoppingItem] = List.empty[ShoppingItem]
    println("I have got no item " + noItems)
    println("Bill= " + shoppingCart.calculatePayment(noItems) + " GBP")

    val someItems: List[ShoppingItem] = List(Cola(),Coffee(),CheeseSandwich())
    println("items " + someItems.map(si => si.name))
    println("Bill= " + (shoppingCart.calculatePayment(someItems)/100)+ " GBP")
  }
}
