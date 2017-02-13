package util

import org.scalatest.{Matchers, WordSpec}
import java.lang.{IllegalArgumentException => IAE}

class TimeObjectSpec extends WordSpec with Matchers {

  "companionObject" should {
    "return correct seconds" in {
      Time(2).seconds shouldEqual 2
      Time(20).seconds shouldEqual 20
      Time(120).seconds shouldEqual 0
      an[IAE] should be thrownBy Time(-24)
    }

    "return correct minutes" in {
      Time(2).minutes shouldEqual 0
      Time(3600).minutes shouldEqual 0
      Time(70).minutes shouldEqual 1
      an[IAE] should be thrownBy Time(-240).minutes
    }


    "return correct hours" in {
      Time(2).hours shouldEqual 0
      Time(3600).hours shouldEqual 1
      Time(7250).hours shouldEqual 2
      an[IAE] should be thrownBy Time(-240).hours
    }

    "correct totalMinutes" in {
      Time.totalMinutes(123).hours shouldEqual 2
      Time.totalMinutes(123).minutes shouldEqual 3
      Time.totalMinutes(123).seconds shouldEqual 0
    }
  }

}


