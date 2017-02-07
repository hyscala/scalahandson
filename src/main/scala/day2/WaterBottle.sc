case class WaterBottle(brand:String, litre:Int)
val ls = List(WaterBottle("bisleri",1), WaterBottle("bisleri",2), WaterBottle("himalayan",1))

for{
  i <- ls
  if i.brand =="bisleri"
} println(i)

for{
  i <- ls
  if i.litre == 1
} println(i)

(for{
  i <- ls
} yield i.brand).toSet

(for{
  i <- ls
} yield i.litre).toSet

for(i <- ls) yield WaterBottle(i.brand, i.litre*2)

