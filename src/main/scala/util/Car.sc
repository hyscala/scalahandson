case class Car(var brand:String,var color:String)
val car = Car("bmw","blue")

car.brand
car.color

val newCar = Car("bmw","blue")

car == newCar

car.color = "red"
car.copy(color = "black")
