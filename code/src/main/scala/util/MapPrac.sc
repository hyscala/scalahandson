/*
Map
Create a map of the integer corresponding to its string. i.e. Map of key: 1. value: "1"
Try getting the value by key 1
Try getting the value for key 2
Try converting map to List
Again add pair: (1, "2") to the map
Try getting the value by key 1
Again add pair: (1, "1") to the map
Try converting map to Set
 */

val map = Map(1 -> "1")
map(1) //map.apply(1)
//map(2)
map.toList
val map2 = map + (1 -> "2")

map(1)
map2(1)

map + (1 -> "1")
map.toSet
