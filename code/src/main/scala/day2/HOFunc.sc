/*
Create a list of strings: 1 to 5. i.e. List("1","2","3","4","5")
Generate another list from above whose contents must be List(1,2,3,4,5) i.e. List[Int]. Use map for this operation
From above list, then generate another list that is List of square of every number. i.e. is List(1,4,9,16,25)
Filter elements from the list that is odd
Find the element that is divisible by 3
 */

val ls: List[String] = List.range(1, 5).map(x => x + "")

val ls2 = ls.map(x => x.toInt)
ls2.map(x => x * x).filter(x => x % 2 == 1).filter(x => x % 3 == 0)

/*
create case class Player that takes two argument name:String and country:String
create case class Team that takes one argument List[Player]
create list of 5 players: Dhoni, anderson, broad, kohli, steyn with teams: ind, eng, eng, ind, sa
Write a function in companion object of Team:
 */
case class Player(name: String, country: String)

case class Team(players: List[Player])

val players = List(Player("dhoni", "ind"), Player("anderson", "eng")
  , Player("broad", "eng")
  , Player("kohli", "ind"), Player("steyn", "sa"))

object Team {
  def getTeams(ls: List[Player]): List[Team] = {
    val map: Map[String, List[Player]] = ls.groupBy(x => x.country)
    println(map)
    val values = map.values
    println(values)
    values.map(x => Team(x)).toList
  }
}

Team.getTeams(players)