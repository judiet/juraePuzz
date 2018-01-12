package de.htwg.se.juraePuzz.model.model

import de.htwg.se.juraePuzz.model.gridBaseImpl.Level
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class LevelSpec extends WordSpec with Matchers {
  "A Level" should {
    "have a value" in {
      Level(Array(0)).s should be(Array(0))
      Level(Array(0)).length() should be (1)
    }
  }
}