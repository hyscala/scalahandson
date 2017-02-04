/*
Create a case class WaterBottle that has two arguments:
    brand:String and litre: Int
Create a list of WaterBottle that will contain 3 water bottle objects:
    WaterBottle("bisleri",1), WaterBottle("bisleri",2),
      WaterBottle("himalayan",1)
Implement using for print all the objects that has brand bisleri
 */

case class WaterBottle(brand: String, litre: Int)

val ls = List(WaterBottle("bisleri", 1), WaterBottle("bisleri", 2),
  WaterBottle("himalayan", 1))

for {i <- ls
     if i.brand == "bisleri"
} {
  println(i)
}

/*
Implement using for print all the objects that has 1 litre capacity
 */

for {i <- ls
     if i.litre == 1
} {
  println(i)
}


/*
Implement using for-yield
  obtain a collection of all brands used in list above
 */

val allBrands: List[String] = for {
  i <- ls
} yield i.brand

/*
Implement using for-yield obtain a
    collection of all litres capacity used in list above

 */

(for{
  i <- ls
} yield i.litre).toSet

/*
Implement using for-yield obtain a collection
of all objects with litre capacity as twice the original one
 */

for{
  i <- ls
}yield i.copy(litre = i.litre * 2)

