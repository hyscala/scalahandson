/*
If the first value of pair is an Int, then it must return Int Value.

If the first value of pair is an String, then it must return the Int value of String

If the first value is something else, then it must return 0


 */

def getNum(pair: (Any, Any)) : Int = pair match{
  case (x:Int,_) => x
  case (x:String, _) => x.toInt
  case _ => 0
}