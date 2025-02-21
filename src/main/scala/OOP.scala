object OOP { 
  def greet(name: String): String = s"Hello, $name"

  trait Vegetarian { 
    def isVegetarian(): Boolean
  }

  sealed trait DrinkSize { 
  }

  case object Large extends DrinkSize 
  case object Medium extends DrinkSize
  case object Small extends DrinkSize

  abstract class Food(name: String, price: Int, description: String, off: Int, customizations: String = "") extends Vegetarian with MenuItem(name, price, description) { 
    val ifDiscount: String = if off == 0 then "" else f"Discount: £${off/100.0}%.2f "
    val ifCustomizations: String = if customizations == "" then "" else " Customizations: " + customizations
    def describe(): String = s"$name " + ifDiscount + s"£${(super.discount(off)/100.0).toString()} $description.$ifCustomizations"
  }

  abstract class Drink(name: String, price: Int, description: String, val size: DrinkSize, off: Int, customizations: String = "") extends MenuItem(name, price, description) {
    val ifDiscount: String = if off == 0 then "" else f"Discount: £${off/100.0}%.2f "
    val ifCustomizations: String = if customizations == "" then "" else " Customizations: " + customizations
    def describe(): String = s"$name ${size.toString()}. " + ifDiscount + s"Price: £${(super.discount(off)/100.0).toString()}.$ifCustomizations"
  }

  sealed trait MenuItem(name: String, price: Int, description: String) {
    def describe(): String 
    def discount(off: Int): Int = price - off
  }

  // val chipsMenuItem = new MenuItem(name = "Chips", price = 199, description = "Lovely Chips")

  class MainDishMenuItem(name: String, price: Int, description: String, isVeg: Boolean, off: Int = 0) extends Food(name, price, description, off) {
    override def describe(): String = s"Main dish: ${super.describe()}"
    def isVegetarian(): Boolean = isVeg
  }

  val curryMainDishMenuItem: MainDishMenuItem = new MainDishMenuItem(name = "Curry", price = 1099, description = "Spicy curry", isVeg = false)

  class SideDishMenuItem(name: String, price: Int, description: String, isVeg: Boolean, off: Int = 0) extends Food(name, price, description, off) {
    override def describe(): String = s"Side dish: ${super.describe()}"
    def isVegetarian(): Boolean = isVeg
  }

  val riceSideMenuItem: SideDishMenuItem = new SideDishMenuItem(name = "Rice", price = 199, description = "Fluffy rice", isVeg = true)

  class SoftDrinkMenuItem(name: String, price: Int, description: String, size: DrinkSize, off: Int = 0) extends Drink(name, price, description, size, off) {
    override def describe(): String = s"Soft Drink: ${super.describe()}"
  }

  val colaDrinkMenuItem: SoftDrinkMenuItem = new SoftDrinkMenuItem(name = "Cola", price = 299, description = "Small Cola", size = Small )

  val colaDiscountDrinkMenuItem: SoftDrinkMenuItem = new SoftDrinkMenuItem(name = "Cola", price = 299, description = "Small Cola", size = Small, off = 100 )

  
  def main(args: Array[String]): Unit = {
    
  }
}
