/*
create a list containing numbers from 1 to 10
Get the first element of the list
Get the last element of the list
Get the size of the list
Get first 6 elements of the List
Get first 9 elements of the List
Get last 3 elements of the List
Get last 9 elements of the List
See if the list contains element: 7
Get the element at index 4
Add an element to the head of the List
Create another list of numbers from 10 to 15. Append the above list to this list in the front
 */


val ans = List(1,2,3,4,5,6,7,8,9,19)
List.range(1, 11)

ans.head
ans.last

ans.take(6)
ans.init

ans.takeRight(3)
ans.tail

ans contains 7
ans(4)
ans head

val newList = List.range(10,16)

ans ::: newList

ans ++ newList

