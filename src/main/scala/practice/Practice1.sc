/*
Create a class Person that has two constructor arguments firstName and lastName
Create two person objects with same firstName and lastName
do == in between the objects
Implement equals in Person
do == in between the objects

 */
class Person(val fistName: String, val lastName: String) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[Person]

  override def equals(other: Any): Boolean = other match {
    case that: Person =>
      (that canEqual this) &&
        fistName == that.fistName &&
        lastName == that.lastName
    case _ => false
  }

}

object Person {
  def apply(fistName: String, lastName: String): Person
  = new Person(fistName, lastName)
}

val p1 = Person("sachin", "tendulkar")
val p2 = Person("sachin", "tendulkar")

p1 == p2


//////////////////////////////////////////

/*

case class

 */


case class Person2(name: String, num: Int)

val a = Person2("sachin", 1)
a.name
a.num

//Person2.apply()

class Person3(val name: String, val age: Int)

val p3 = new Person3("d", 2)


//////////


case class NewPerson(fistName: String, lastName: String)

val np1 = NewPerson("virat", "kohli")
val np2 = NewPerson("virat", "kohli")

np1 == np2

println(np1)
println(new Person("virat", "kohli"))


println("copied: " + np1.copy())
println("copied: " + np1.copy(lastName = "tendulkar"))
println("copied: " + np1.copy(fistName = "sachin"))


val aa = np1.copy()
aa


/*



change
 */
case class ChangePerson(var fistName: String, var lastName: String)

val a1 = ChangePerson("virat", "kohli")
a1.fistName = "sachin"
println("change person --> " + a1)


/**
  *
  *
  * create a case class Car that takes two mutable arguments: brand and color
  * create an instance car without using the keyword new. Arguments: bmw and blue
  * try accessing the brand field by doing car.brand
  * Create two Car instances with same brand and color
  * Do == across them
  * change the color from blue to red of the same object
  * Create a new object using copy by changing color to black
  */


case class Car(var brand:String, var color:String)
 val car = Car("bmw","blue")
car.brand
val car2 = Car("bmw","blue")
car == car2

car.color = "red"
println("changed color: "+car)
val newCar = car.copy(color = "black")

println("old object: "+car+". new opject: "+newCar)


def implmenet = ???




