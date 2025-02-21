import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class OOPSpec extends AnyFlatSpec with Matchers {  
  "Greet" should "greet with the provided name" in 
    {    OOP.greet("John") should be("Hello, John")  }}

// class MenuItemSpec extends AnyFlatSpec with Matchers {
//   "MenuItemSpec" should "print menu item description" in 
//     { OOP.chipsMenuItem.describe() should be ("Chips 199 Lovely Chips")}
// }

class MainDishMenuItemSpec extends AnyFlatSpec with Matchers {
  "MainDishMenuItemSpec" should "print menu item description" in 
    { OOP.curryMainDishMenuItem.describe() should be ("Main dish: Curry £10.99 Spicy curry.")}
}

class SideDishMenuItemSpec extends AnyFlatSpec with Matchers {
  "SideMenuItemSpec" should "print menu item description" in 
    { OOP.riceSideMenuItem.describe() should be ("Side dish: Rice £1.99 Fluffy rice.")}
}

class IsDishVegetarianMenuItemSpec extends AnyFlatSpec with Matchers {
  "IsDishVegetarianMenuItemSpec" should "print if this is vegetarian" in 
    { OOP.riceSideMenuItem.isVegetarian() should be (true)}
}

class IsSoftDrinkMenuItemSpec extends AnyFlatSpec with Matchers {
  "IsSoftDrinkMenuItemSpec" should "print if this is a small drink" in 
    { OOP.colaDrinkMenuItem.size should be (OOP.Small)}
}

class IsDiscountSoftDrinkMenuItemSpec extends AnyFlatSpec with Matchers {
  "IsDiscountSoftDrinkMenuItemSpec" should "print if this is a small drink" in 
    { OOP.colaDiscountDrinkMenuItem.describe() should be ("Soft Drink: Cola Small. Discount: £1.00 Price: £1.99.")}
}
