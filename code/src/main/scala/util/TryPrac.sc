import scala.io.Source
import scala.util.Try

def readText(filename: String): Try[List[String]] = {
  Try(Source.fromFile(filename).getLines.toList)
}
val t = readText("/home/jatin/work/trainings/scala-intro/LICENSE.txt")

/**
  * Takes a string. Sample input: "1,2,3,4,5,6,7".
  * You need to find the sum of all numbers in the string.
  * - To do this, first split the string by `,`.
  *    Look at `split` function in String class
  * - it will return an `Array[String]`. Convert it to `Array[Int]`
  * - Find the sum of the numbers
  * - Twist: But there can be an invalid value as well.
  *
  */
def getSqrt(n:String): Try[Double]={
  Try {
    val arr: Array[String] = n.split(",")
    val integers: Array[Double] = for (i <- arr) yield i.toDouble
    integers.sum
  }
}


def getSqrt2(n:String) = {
  getSqrt(n).toOption
}