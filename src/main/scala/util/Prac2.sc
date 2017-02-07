val a = Seq(1,2,3,4,5)
val b = Seq("1","2")

a(0)
a(1)

a.head
a.tail


0 +: a

//immutable list
val ls1 = List(1,2,3)

//O(1)
val ls2 = 0 :: ls1

println("ls1: "+ls1+". ls2: "+ls2)

val ls3 = ls2 :+ 4

println("ls1: "+ls1+". ls2: "+ls2+". ls3: "+ls3)
//O(n)

val l4 = List[Int](1,2,3)
val ls5:List[Int] = List(1,2,3)



class App{
  def +:(n:String) = "hi"
}

val app = new App

app.+:("hello")

"hello" +: app




