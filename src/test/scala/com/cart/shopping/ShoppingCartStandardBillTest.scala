package com.cart.shopping

import com.cart.shopping.datamodel._
import com.cart.shopping.service.shoppingCart
import org.scalatest.{BeforeAndAfter, FunSpec, Matchers, ShouldMatchers}


//No dependency to any other services so we use only dummy data, not mocked data
class ShoppingCartStandardBillTest extends FunSpec with ShouldMatchers with BeforeAndAfter with Matchers {

  describe("Simple shopping cart with standard bill") {
    it("an empty shopping cart should pay zero amount") {
      val noItems: List[ShoppingItem] = List.empty[ShoppingItem]
      shoppingCart.calculatePayment(noItems) should equal(0)
    }

    it("an shopping cart with 1 cola should pay 50p") {
      val someItems: List[ShoppingItem] = List(Cola())
      shoppingCart.calculatePayment(someItems) should equal(50)
    }

    it("an shopping cart with 1 coffee should pay £1") {
      val someItems: List[ShoppingItem] = List(Coffee())
      shoppingCart.calculatePayment(someItems) should equal(100)
    }

    it("an shopping cart with some items should pay some amount") {
      val someItems: List[ShoppingItem] = List(Cola(),Coffee(),CheeseSandwich(),SteakSandwich())
      shoppingCart.calculatePayment(someItems) should equal(800)
    }
  }
}