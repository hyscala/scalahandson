package in.hyscala.scalahandson
import Hello._

object HelloMain extends App {
  println(sayHelloTo())
  println(sayHelloTo("Scala"))
}

object Hello {

  def sayHelloTo(name: String = "World"): String = {
    s"Hello ${name}"
  }

}
