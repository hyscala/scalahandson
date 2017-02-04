class Animal2(legs: => Int){
  println(s"Animal initialized $legs")
}
class Octopus2 extends Animal2(10){
  println("Octopus initialized")
}

new Octopus2

abstract class Animal

trait Bird extends Animal {
  def fly: String = "fly"
  def flap:String

}
trait Swimmer {
  def swim: String = "swim"

}

class Fish extends Animal with Swimmer

val fish = new Fish
fish.swim



class Duck extends Bird {
  override def flap = "duck flap"
}//mix in
//class Duck extends Animal with Bird //mix in

val duck = new Duck
duck.fly
duck.flap


class SpecialDuckFish extends Animal with Bird with Swimmer {
  override def flap: String = "special flap"
}
val special = new SpecialDuckFish

special.fly
special.swim



/**
Create a sealed class Car
Create a trait Engine that has one method def cc:Int
Create a trait Tyres that has one method def types: Int
Create a trait Color that has one method def color: String
Create a trait BlueColor that has extends Color and overrides color method to return blue
Create a class Audi that is Car and has Engine of 2000cc, 4 Tyres and is BlueColor

  */

sealed class Car
trait Engine{
  def cc:Int
}
trait Types{
  def tyres:Int
}
trait Color{
  def color:String
}
trait BlueColor extends Color{
  override def color = "Blue"
}

class Audi extends Car with Engine with Types with BlueColor{
  override def tyres = 4
  override def cc = 2000
}
val audi = new Audi
audi.cc
audi.tyres