package util

/**
  * Create a class by name Time in src/main/scala/util/Time.scala file
  * It must take 3 fields as constructors: Hours, Minutes, Seconds. It must fail if invalid values
  * The fields must be accessible from outside.
  * The values of above 3 arguments, must be valid
  * Class must be immutable
  * Add a field by name minutesOfDay that returns the number of minutes passed during the day
  * Access the class from sbt console
  */
class Time1(val hours: Int, val minutes: Int = 1, val seconds: Int = 0) {
  require(hours >= 0 && hours <= 23, "hours are invalid " + hours)
  require(minutes >= 0 && minutes <= 59, "minutes are invalid " + minutes)
  require(seconds >= 0 && seconds <= 59, "seconds are invalid " + seconds)

  val minutesOfDay: Int = hours * 60 + minutes


  override def toString = s"Time1($hours, $minutes, $seconds)"


  def canEqual(other: Any): Boolean = other.isInstanceOf[Time1]

  override def equals(other: Any): Boolean = other match {
    case that: Time1 =>
      (that canEqual this) &&
        hours == that.hours &&
        minutes == that.minutes &&
        seconds == that.seconds
    case _ => false
  }

  override def hashCode(): Int = {
    hours * minutes * seconds
  }
}

object Time1 {
  def apply(hours: Int, minutes: Int, seconds: Int) = new Time1(hours, minutes, seconds)

  def apply(totalSeconds: Int): Time1 = {
    val hours = totalSeconds / (60 * 60)
    new Time1(hours, (totalSeconds / 60) % 60, totalSeconds % 60)
  }

  /**
    * Add another function fromMinutes which must take an argument totalMinutes which represents total number of minutes during the day
    * It must returns instance of class Time
    *
    * @param totalMinutes
    * @return
    */
  def fromMinutes(totalMinutes: Int): Time1 = apply(totalMinutes*60)

}

