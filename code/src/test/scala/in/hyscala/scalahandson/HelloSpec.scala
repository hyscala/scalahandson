package in.hyscala.scalahandson

import org.scalatest._
import Hello._

class HelloSpec extends FlatSpec with Matchers {
  "Method sayHelloTo with empty parameter"  should "say 'Hello World'" in {
    sayHelloTo() shouldEqual "Hello World"
  }

  "Method sayHelloTo with parameter 'Scala'"  should "say 'Hello Scala'" in {
    sayHelloTo("Scala") shouldEqual "Hello Scala"
  }

}
