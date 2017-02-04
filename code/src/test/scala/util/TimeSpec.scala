package util

import org.scalatest.{Matchers, WordSpec}
import java.lang.{IllegalArgumentException => IAE}

class TimeSpec extends WordSpec with Matchers {

  "Creating Time" should {
    "throw an IllegalArgumentException for hours not within 0 and 23" in {
      an[IAE] should be thrownBy new Time(-2,45,67)
      an[IAE] should be thrownBy new Time(24,45,67)
    }

    "throw an IllegalArgumentException for minutes not within 0 and 23" in {
      an[IAE] should be thrownBy new Time(25, 234,23)
      an[IAE] should be thrownBy new Time(25, -4,23)
    }

    "throw an IllegalArgumentException for seconds not within 0 and 23" in {
      an[IAE] should be thrownBy new Time(25, 4,123)
      an[IAE] should be thrownBy new Time(25, 4,-3)
    }
  }

  "minutesOfDay" should {
    "return correct value" in {
      new Time(2, 3, 4).minutesOfDay shouldEqual 123
      new Time(12, 3, 4).minutesOfDay shouldEqual 723
    }
  }

  "constructor initialization" should {
    "minutes correct value" in {
      new Time(2, 3, 4).minutes shouldEqual 3
      new Time(12, 30, 4).minutes shouldEqual 30
    }

    "hours correct value" in {
      new Time(2, 3, 4).hours shouldEqual 2
      new Time(12, 30, 4).hours shouldEqual 12
    }

    "seconds correct value" in {
      new Time(2, 3, 4).seconds shouldEqual 4
      new Time(12, 30, 4).seconds shouldEqual 4
    }
  }

}


