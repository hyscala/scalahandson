def sqrt: PartialFunction[Int, Double] = {
  case x:Int  if x >= 0 => math.sqrt(x)
}

sqrt.isDefinedAt(-1)
sqrt(1)
sqrt(-1)





List(42, "cat") collect { case i: Int => i + 1 }

